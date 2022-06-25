<?php

/**
 * Provide a admin area view for the plugin settings
 *
 * This file is used to markup the admin-facing aspects of the plugin.
 *
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */

?>

<style type="text/css">
	input, input:focus , select, textarea,textarea:focus{
		border-radius: unset !important;
		border:none !important;
		box-shadow: none !important;
		background: none !important;
	}
	.v-tabs--vertical .v-tab{
		 border-bottom: 2px solid #ffffff;
	 }

</style>

<div id="app" data-app class="v-application <?php echo is_rtl()?'rtl':'ltr'; ?>">
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
	  <v-card v-if="loaded">
		<v-card-title>

		  <h2 class="pr-4 pl-4"><?php echo $this->title ?></h2>

			  <v-btn
				class="mt-4 mb-4 mr-4 ml-4"
				color="success"
				@click="save"
				:disabled="!valid"
			  >

				<v-icon >
				  mdi-content-save-all
				</v-icon>
				<span><?php echo __('Save Options', 'microhrm') ?></span>
			  </v-btn>
		  <v-btn
				  class="mt-4 mb-4 mr-4 ml-4"
				  color="primary"
				  @click="checkAll"
		  >

			<v-icon >
			  mdi-check-all
			</v-icon>
			<span><?php echo __('(Un)Check All', 'microhrm') ?></span>
		  </v-btn>
		</v-card-title>
		<v-form
			ref="form"
			v-model="valid"
			lazy-validation
		>
		  <v-tabs vertical background-color="grey lighten-5">
			<v-tab v-for="(entity,e) in entities" v-id="e">
			  <span >{{entity.plural}} <small>({{txt.ws}})</small></span>
			</v-tab>
			<v-tab v-for="(page,p) in pages" v-id="p">
			  <span >{{page.title}} <small>({{txt.page}})</small></span>
			</v-tab>
			<v-tab v-if="extendeds&&extendeds.length" >
			  <span ><?php echo __('Extended Web-Services','microhrm') ?></span>
			</v-tab>
			<v-tab-item v-for="(entity,e) in entities" v-id="e">
			  <v-container >
				<v-row v-for="(role,r) in roles" v-id="r">
				  <v-col cols="12" sm="2" >
					<label style="line-height: 3">{{role.name}}:</label>
				  </v-col>

				  <v-col cols="12" sm="1" v-for="(cap,c) in capsWS" v-id="c">
					<v-checkbox
							v-model="caps[r]['microhrm_ws_'+e+'_'+c]"
							:label="cap"
							color="primary"
							hide-details
					></v-checkbox>
				  </v-col>

				</v-row>

			  </v-container>
			</v-tab-item>

			<v-tab-item v-for="(page,p) in pages" v-id="'page-'+p">
			  <v-container>
				<v-row v-for="(role,r) in roles" v-id="r">
				  <v-col cols="12" sm="2" >
					<label style="line-height: 3">{{role.name}}:</label>
				  </v-col>

				  <v-col cols="12" sm="1" v-for="(cap,c) in capsWS" v-id="c">
					<v-checkbox
							v-model="caps[r]['microhrm_page_'+p+'_'+c]"
							:label="cap"
							color="primary"
							hide-details
					></v-checkbox>
				  </v-col>

				  <v-col cols="12" sm="1" v-for="(bulk,b) in page.listView.bulk" v-id="'bulk-'+b">
					<v-checkbox
							v-model="caps[r]['microhrm_bulk_'+p+'_'+b]"
							:label="bulk.title"
							color="primary"
							hide-details
					></v-checkbox>
				  </v-col>

				</v-row>

			  </v-container>
			</v-tab-item>
			<v-tab-item v-if="extendeds&&extendeds.length" >
			  <v-container>
				<v-row v-for="(role,r) in roles" v-id="r">
				  <v-col cols="12" sm="2" >
					<label style="line-height: 3">{{role.name}}:</label>
				  </v-col>

				  <v-col cols="12" sm="1" v-for="(extend,ex) in extendeds" v-id="ex">
					<v-checkbox
							v-model="caps[r]['microhrm_ws_'+extend]"
							:label="extend"
							color="primary"
							hide-details
					></v-checkbox>
				  </v-col>
				</v-row>
			  </v-container>
			</v-tab-item>
		  </v-tabs>
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

		data() {
			return {
				rtl:<?php echo is_rtl() ? 'true' : 'false'; ?>,
				txt: {<?php echo "page:'" . __('Page') . "',ws:'" . __('Web-Service', 'microhrm') . "', create:'" . __('Create') . "',update:'" . __('Update') . "',edit:'" . __('Edit') . "',back:'" . __('Back') . "',delete:'" . __('Remove') . "'" ?>},
				nonce: '<?php echo wp_create_nonce('wp_rest'); ?>',
				item: JSON.parse(`<?php echo get_option('microhrm_options', '{}') ?>`),
				caps: {},
				capsWS: {},
				api: '<?php echo get_site_url()?>/wp-json/microhrm/v1/',
				singleSelect: false,
				pages: null,
				entities: null,
				roles: null,
				extendeds: null,
				valid: false,
				loaded: false,
				notify: false,
				notifyText: '',
				notifyColor: '',
				checkedAll:false
			}
		},
		mounted() {
			this.init();
		},
		methods: {
			init() {
				jQuery.ajax({
					url: this.urlMeta,
					method: 'GET',
					beforeSend: (xhr) => {
						xhr.setRequestHeader('X-WP-Nonce', this.nonce);
					},
					error: (err) => {
						this.showNotify(err.responseJSON.message);
					},
					success: (data) => {
						this.pages = data.pages;
						this.entities = data.entities;
						this.roles = data.roles;
						this.capsWS = data.caps;
						this.extendeds = data.extends;
						for (const k of Object.keys(data.roles)) {
							this.caps[k] = data.roles[k].capabilities;
						}
						this.loaded = true;
					}
				});

			},
			checkAll(){
				this.loaded=false;
				this.checkedAll=!this.checkedAll;
				const caps=this.caps;
				const entities=this.entities;
				const roles=this.roles;
				const capsWS=this.capsWS;
				const pages=this.pages;
				const extendeds=this.extendeds||[];
				for(const e in entities){
					for(const r in roles){
						for(const c in capsWS){

							caps[r]['microhrm_ws_'+e+'_'+c]=this.checkedAll;
						}
					}
				}
				for(const p in pages){
					const page=pages[p];
					for(const r in roles){
						for(const c in capsWS){
							caps[r]['microhrm_page_'+p+'_'+c]=this.checkedAll;
						}
						for(const b in page.listView.bulk) {
							caps[r]['microhrm_bulk_' + p + '_' + b] = this.checkedAll;
						}
					}
				}

				for(const ex in extendeds){
					const extend=extendeds[ex];
					for(const r in roles){
							caps[r]['microhrm_ws_'+extend]=this.checkedAll;
					}
				}
				
				this.$nextTick(() => {
					this.loaded = true;
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

			validate() {
				this.$refs.form.validate();
			},
			reset() {
				this.$refs.form.reset();
			},
			resetValidation() {
				this.$refs.form.resetValidation();
			},
			showNotify(txt, color) {
				this.notifyColor = color||'error';
				this.notifyText = txt;
				this.notify = true;

			},
			save() {
				this.validate();
				Vue.nextTick(() => {
					if (!this.valid) return;
					this.loaded=false;
					jQuery.ajax({
						type: "POST",
						url: this.urlSave,
						data: JSON.stringify(this.caps),
						contentType: 'application/json',
						beforeSend: (xhr) => {
							xhr.setRequestHeader('X-WP-Nonce', this.nonce);
						},
						success: (data) => {
							this.loaded=true;
							this.showNotify('<?php echo __('Successfully saved!','microhrm');?>','success');
						},
						error: (err) => {
							this.loaded=true;
							this.showNotify(err.responseJSON.message);
						},
						dataType: 'json'
					});
				})
			},
		},
		computed: {
			urlMeta() {
				return this.api + 'options';
			},
			urlSave() {
				return this.api + 'options';
			},
		}
	});
</script>


	
