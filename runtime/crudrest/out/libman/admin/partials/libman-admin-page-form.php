<?php

/**
 * Provide a admin area view for the entities detail view and edit
 *
 * This file is used to markup the admin-facing aspects of the plugin.
 *
 * @since      1.0.0
 * @package    libman
 * @author     Mohammadreza Asadi	https://mdse.ui.ac.ir/fa/member/%D9%85%D8%AD%D9%85%D8%AF%D8%B1%D8%B6%D8%A7-%D8%A7%D8%B3%D8%AF%DB%8C/
 */
 /** @var libman_Page $this */
require_once libman_PATH.'includes/libman_field_type.php';
/** @var libman_Page $this */

$entity=libman_Models::get_entity($this->entity_key);
$fieldsLayouts=$this->formView->fieldsLayouts;
$js_to_load=array();
$css_to_load=array();
$component_to_load=array();
foreach ($fieldsLayouts as $key=>$layout ){
  $field = $entity->get_field($key);
  $fieldType = libman_field_type::get($field->type);
  if ($fieldType->url_js){
	foreach (explode(',',$fieldType->url_js) as $i=>$js){
	  $js=trim($js);
	  if (strlen($js)) $js_to_load[$js]=$js;
	}
  }
  if ($fieldType->url_css){
	foreach (explode(',',$fieldType->url_css) as $i=>$css){
	  $css=trim($css);
	  if (strlen($css)) $css_to_load[$css]=$css;
	}
  }
  if ($fieldType->component){
	   $component_to_load[$fieldType->component]=$fieldType->component;
  }
}
$can_view = current_user_can("libman_page_{$this->key}_view");
$can_edit = current_user_can("libman_page_{$this->key}_edit");
$can_delete = current_user_can("libman_page_{$this->key}_delete");
$can_create = current_user_can("libman_page_{$this->key}_create");
$can_list = current_user_can("libman_page_{$this->key}_list");
foreach ($js_to_load as $js) echo "<script src=\"$js\"></script>\r\n";
foreach ($css_to_load as $css) echo "<link rel=\"stylesheet\" type=\"text/css\"  href=\"$css\"/>\r\n";
?>

<style type="text/css">
	.v-menu{display:block}
	input, input:focus , select, textarea,textarea:focus{
		border-radius: unset !important;
		border:none !important;
		box-shadow: none !important;
		background: none !important;
	}
</style>

<div id="app" data-app class="v-application <?php echo is_rtl()?'rtl':'ltr'; ?>">
  <v-dialog ref="deleteconfirm"
			transition="dialog-bottom-transition"
			max-width="500"
			:value="selectedToDelete"
			@click:outside="selectedToDelete=null"
  >
	<template v-slot:default="dialog">
	  <v-card>
		<v-toolbar
				color="error"
				dark
		><?php echo __('Confirm Action','crwp') ?></v-toolbar>
		<v-card-text color="error">
		  <div class="text-h5 pa-5"><?php echo __('Are you sure to delete this item?','crwp') ?></div>
		  <div class="text-center text-h4 pa-5" style="text-decoration: underline; color: #ff3737"> {{title}}</div>
		</v-card-text>
		<v-card-actions class="justify-end">
		  <v-btn  depressed color="success"
				  text
				  @click="selectedToDelete=null"
		  ><?php echo __('Cancel') ?>
		  </v-btn>
		  <v-btn depressed
				 color="error"
				 text
				 @click="remove"
		  ><?php echo __('Yes') ?>
		  </v-btn>
		</v-card-actions>
	  </v-card>
	</template>
  </v-dialog>

  <v-snackbar centered multi-line :color="notifyColor"
			  v-model="notify"
			  :timeout="2000"
  >
	{{ notifyText }}
	<template v-slot:action="{ attrs }">
	  <v-btn text
			 v-bind="attrs"
			 @click="notify = false"
	  >
		<v-icon>
		  mdi-close
		</v-icon>
	  </v-btn>
	</template>
  </v-snackbar>
  <v-main>
	<v-container fluid>
	  <v-card v-if="item">
		<v-card-title>
		  <v-tooltip bottom>
			<template v-slot:activator="{ on, attrs }">
			  <v-btn
					  icon
					  color="blue"
					  @click="back"
					  v-bind="attrs"
					  v-on="on"
			  >
				<v-icon left>
				  {{rtl?"mdi-arrow-right-thick":"mdi-arrow-left-thick"}}
				</v-icon>
			  </v-btn>
			</template>
			<span>{{txt.back}}</span>
		  </v-tooltip>

		  <small>{{modeTitle}}  <?php echo __($this->get_entity()->label,'crwp'); ?></small> <h2 class="pr-4 pl-4">{{title}}</h2>

		</v-card-title>
		<v-form
				ref="form"
				v-model="valid"
				lazy-validation
		>
		  <v-container>
			<v-row>
			  <?php
			  foreach ($fieldsLayouts as $key=>$layout ){
				$field = $entity->get_field($key);
				$fieldType = libman_field_type::get($field->type); ?>

			  <v-col
				cols="12"
				<?php foreach ($layout["col"] as $colKey=>$colVal) {
				  if ($colVal>0) echo "$colKey=\"$colVal\" ";
				}
				?>>
				<<?php echo  $fieldType->tag ?>

				  <?php echo $fieldType->get_params($this,$field,$key);?>

				 ></<?php echo  $fieldType->tag ?>>
			  </v-col>
			  <?php } ?>
			</v-row>
			<v-row class="mb-4" >

			  <v-btn
					  v-if="access.list"
					  color=""
					  class="mr-4"
					  @click="back"
			  >
				{{txt.back}}
				<v-icon left>
				  {{rtl?"mdi-arrow-right-thick":"mdi-arrow-left-thick"}}
				</v-icon>
			  </v-btn>

			  <v-btn
					  v-if="access.edit&&mode==='view'"
					  class="mr-4"
					  color="primary"
					  @click="mode='edit'"
					  :disabled="!valid"
			  >
				{{txt.edit}}
				<v-icon >
				  mdi-pencil
				</v-icon>
			  </v-btn>

			  <v-btn
				v-if="access.create&&mode==='new'"
				:disabled="!valid"
				color="success"
				class="mr-4"
				@click="create"
			  >
				{{txt.create}}
			  </v-btn>

			  <v-btn
				v-if="access.edit&&mode==='edit'"
				class="mr-4"
				color="warning"
				@click="update"
				:disabled="!valid"
			  >
				{{txt.update}}
				<v-icon >
				  mdi-check
				</v-icon>
			  </v-btn>

			  <v-btn v-if="access.delete"
					  v-if="mode!=='new'"
					  color="error"
					  class="mr-4"
					  @click="selectedToDelete=true"
			  >
				{{txt.delete}}
				<v-icon >
				  mdi-delete
				</v-icon>
			  </v-btn>



		  </v-row>
		  </v-container>
		</v-form>

	  </v-card>
	  <div v-else style="text-align: center;">
		<v-progress-circular
				style="margin-top:30vh;"
				:size="70"
				:width="7"
				color="primary"
				indeterminate
		></v-progress-circular>
	  </div>

  	</v-container>
  </v-main>
</div>

<script>
const app = new Vue({
	el: '#app',
	vuetify: new Vuetify({rtl: <?php echo is_rtl() ? 'true' : 'false'; ?>}),
	components: {
      <?php foreach($component_to_load as $c) echo $c.", \r\n"; ?>
    },
	data() {
		return {
			rtl:<?php echo is_rtl() ? 'true' : 'false'; ?>,
			txt: {<?php echo "create:'" . __('Create') . "',view:'" . __('View') . "',update:'" . __('Update') . "',edit:'" . __('Edit') . "',back:'" . __('Back') . "',delete:'" . __('Remove') . "'" ?>},
			item: null,
			nonce: '<?php echo wp_create_nonce('wp_rest'); ?>',
			api: '<?php echo get_site_url()?>/wp-json/libman/v1/',
			id: null,
			pageKey: '<?php echo $this->key ?>',
			selectedToDelete: null,
			page: null,
			valid: false,
			rData: {},
			notify: false,
			notifyText: '',
			notifyColor:'',
			mode:null,
			access:{
				view:<?php echo $can_view?'true':'false';?>,
				edit:<?php echo $can_edit?'true':'false';?>,
				delete:<?php echo $can_delete?'true':'false';?>,
				create:<?php echo $can_create?'true':'false';?>,
				list:<?php echo $can_list?'true':'false';?>,
			}
		}
	},
	mounted() {
		const queryString = window.location.search;
		const urlParams = new URLSearchParams(queryString);
		var mode=urlParams.get('mode');
		var id=urlParams.get('id');
		if (id === 'new') mode= 'new';
		if (id&&!mode) mode= 'view';
		this.id=id;
		this.mode=mode;
		this.getMeta();
		// console.log(this);
	},
	methods: {
		showNotify(txt, color) {
			this.notifyColor = color||'error';
			this.notifyText = txt;
			this.notify = true;
		},
		get(url, clbk) {
			jQuery.ajax({
					url: url,
					method: 'GET',
					beforeSend: (xhr) => {
						xhr.setRequestHeader('X-WP-Nonce', this.nonce);
					},
					error: (err) => {
						this.showNotify(err.responseJSON.message);
					},
					success: (data) => {
						clbk(data);
					}
				}
			);
		},
		post(url, clbk) {
			jQuery.ajax({
				url: url,
				method: 'POST',
				beforeSend: (xhr) => {
					xhr.setRequestHeader('X-WP-Nonce', this.nonce);
				},
				error: (err) => {
					this.showNotify(err.responseJSON.message);
				},
				success: (data) => {
					clbk(data);
				}
			});
		},
		getMeta() {
			this.get(this.urlMeta, (data) => {
				const page = data[this.pageKey];
				page.entity.allfields = {...page.entity.fields, ...page.entity.relations};
				this.page = page;
				this.getData();
			});
		},

		getData() {
			if (this.mode === 'new') {
				const item = {};
				for (const key in this.page.entity.relations) {
					const relation=this.page.entity.relations[key];
					item[key] = (relation.many)?[]:'';
				}
				for (const key in this.page.entity.fields) {
					item[key] = '';
				}
				this.item = item;

				return this.getRelationsData();
			}
			this.get(this.urlData, (data) => {
				this.item = data;
				for (const key in this.page.entity.relations) {
					if (data[key]) continue;
					const relation=this.page.entity.relations[key];
					this.item[key] = (relation.many)?[]:{};
				}
				this.getRelationsData();
			});
		},
		resolveScript(script, _item, param) {
			if (!script) return "";
			"use strict"
			let value = {};
			let result = null;
			const that = this;
			const params = param;
			const item = _item;
			eval("result =(() => {\n" + (script) + "\n})(value,that,item,params)");
			return result || value;
		},
		resolveRelationTitle(entityKey, item) {
			const script = this.page.entity.relations[entityKey].title_script;
			return script? this.resolveScript('return ' + script, item): item.id;

		},
		getRelationsData() {
			const relations = this.page.entity.relations;
			for (const key in relations) {
				if (!this.page.formView.fieldsLayouts[key]) continue;
				// console.log(relations[key].entity, key);
				this.getRelationData(relations[key].entity, key);
			}
		},
		getRelationData(entityKey, key, id = "") {
			var url = this.api +'mini/'+ entityKey + '/' + id;

			this.get(url, (data) => {
				// console.log(data);
				this.rData[key] = data.items;
				this.$forceUpdate();
			});
		},
		validate() {
			this.$refs.form.validate();
		},
		reset() {
			this.$refs.form.reset();
		},
		resetValidation() {
			this.$refs.form.resetValidation();
		},
		create() {
			this.validate();
			Vue.nextTick(() => {
				if (!this.valid) return;
				jQuery.ajax({
					type: "POST",
					url: this.urlCreate,
					data: JSON.stringify(this.item),
					contentType: 'application/json',
					beforeSend: (xhr) => {
						xhr.setRequestHeader('X-WP-Nonce', this.nonce);
					},
					success: (data) => {
						if (/[0-9]+/.test(data.id))return this.goToItem(data.id);
						this.showNotify(data.id);
					},
					error: (err) => {
						this.showNotify(err.responseJSON.message);
					},
					dataType: 'json'
				});

			})
		},

		update() {
			this.validate();
			Vue.nextTick(() => {
				if (!this.valid) return;
				jQuery.ajax({
					type: "POST",
					url: this.urlData,
					data: JSON.stringify(this.item),
					contentType: 'application/json',
					beforeSend: (xhr) => {
						xhr.setRequestHeader('X-WP-Nonce', this.nonce);
					},
					success: (data) => {
						this.showNotify('<?php echo __('Successfully saved!','crwp');?>','success');
					},

					error: (err) => {
						this.showNotify(err.responseJSON.message);
					},
					dataType: 'json'
				});

			})
		},
		remove() {
			if (!this.id || !/[0-9]+/.test(this.id)) return;
			jQuery.ajax({
				type: "DELETE",
				url: this.urlData,
				data: JSON.stringify(this.id),
				contentType: 'application/json',
				beforeSend: (xhr) => {
					xhr.setRequestHeader('X-WP-Nonce', this.nonce);
				},
				success: (data) => {
					this.back();
				},
				error: (err) => {
					this.showNotify(err.responseJSON.message);
				},
				dataType: 'json'
			});
			this.selectedToDelete=null;

			// })
		},
		back() {
			var url = window.location.href;
			var i = url.lastIndexOf('&id');
			window.location.href = url.substring(0, i);
		},
		goToItem(id) {
			var url = window.location.href;
			var i = url.lastIndexOf('&id');
			window.location.href = url.substring(0, i) + '&id=' + id;
		},

	},
	computed: {
		modeTitle() {
			const mode = this.mode;
			switch (mode) {
				case 'edit':
					return this.txt.edit;
				case 'new':
					return this.txt.create;
			}
			return this.txt.view;
		},
		title() {
			if (!this.item) return '';
			if (!this.page.entity.title_script) return this.item.id;
			const title = this.resolveScript("return " + this.page.entity.title_script, this.item);
			return title;
		},
		urlMeta() {
			return this.api + 'page/' + this.pageKey;
		},
		urlData() {
			return this.api + 'page_' + this.page.key + '/' + this.id;
		},
		urlCreate() {
			return this.api + 'page_' + this.page.key;
		},
	}
});
</script>

