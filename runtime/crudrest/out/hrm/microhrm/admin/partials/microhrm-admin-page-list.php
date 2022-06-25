<?php

/**
 * Provide a admin area view for entities list
 *
 * This file is used to markup the admin-facing aspects of the plugin.
 *
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */
/** @var microhrm_Page $this */
?>
<style type="text/css">
	.bulkactions .v-text-field__details{display: none !important;}
	.action-icon:before{font-size: 40px; margin-right: 12px; margin-left: 12px;}
	input, input:focus , select, textarea,textarea:focus{
		border-radius: unset !important;
		border:none !important;
		box-shadow: none !important;
	}
</style>
<div id="microhrm-app" data-app class="v-application <?php echo is_rtl()?'rtl':'ltr'; ?>">
  <v-snackbar centered multi-line color="error"
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

	  <v-dialog ref="bulkconfirm"
				transition="dialog-bottom-transition"
				max-width="500"
				:value="showBulkConfirm"
				@click:outside="clearBulk"
	  >
		<template v-slot:default="dialog">
		  <v-card>
			<v-toolbar
					color="error"
					dark
			><?php echo __('Confirm Action','microhrm') ?></v-toolbar>
			<v-card-text color="error">
			  <div class="text-h5 pa-5"><?php echo __('Are you confirm this action?','microhrm') ?></div>
			  <div class="text-center text-h4 pa-5" style="text-decoration: underline; color: #ff3737"><span v-if="selectedBulk&&selectedBulk.icon" :class="'action-icon dashicons-before dashicons-'+selectedBulk.icon"></span> {{selectedBulk&&selectedBulk.title}}</div>
			</v-card-text>
			<v-card-actions class="justify-end">
			  <v-btn  depressed color="success"
					  text
					  @click="clearBulk"
			  ><?php echo __('Cancel') ?>
			  </v-btn>
			  <v-btn depressed
					 color="error"
					 text
					 @click="doBulk"
			  ><?php echo __('Yes') ?>
			  </v-btn>
			</v-card-actions>
		  </v-card>
		</template>
	  </v-dialog>
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
			><?php echo __('Confirm Action','microhrm') ?></v-toolbar>
			<v-card-text color="error">
			  <div class="text-h5 pa-5"><?php echo __('Are you sure to delete this item?','microhrm') ?></div>
			  <div class="text-center text-h4 pa-5" style="text-decoration: underline; color: #ff3737"> {{getItemTitle(selectedToDelete)}}</div>
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
					 @click="remove(selectedToDelete)"
			  ><?php echo __('Yes') ?>
			  </v-btn>
			</v-card-actions>
		  </v-card>
		</template>
	  </v-dialog>
	  <v-card>
		<v-card-title>
		  {{title}}
		  <v-spacer></v-spacer>
		  <v-text-field
			  v-if="<?php echo $this->get_list_view()->props["searchBox"]?'true':'false'; ?>"
			  v-model="search"
			  append-icon="mdi-magnify"
			  label="<?php echo __('Search')?>"
			  single-line
			  hide-details
			  @keydown.enter.prevent="handleSearch"
		  ></v-text-field>
		</v-card-title>
		<v-container>
		  <v-row  >
			<v-col md="4">
			  <v-btn v-if="access.create"
					  color="success"
					  class="mr-4"
					  @click="create"
			  >
				<?php echo __('Add New','microhrm');?> <v-icon>mdi-file-plus </v-icon>
			  </v-btn>
			</v-col>
			<v-col md="5"></v-col>
			<v-col md="3" >
			  <v-overflow-btn
				  ref="bulks"
				  class="bulkactions"
				  v-if="showBulk"
				  style="margin:0"
				  v-model="selectedBulk"
				  :items="bulks"
				  label="<?php echo __('Select an action','microhrm') ?>"
				  menu-props="top"
				  filled
				  dense >
				<template v-slot:append>
				  <v-icon >
					mdi-gesture-tap
				  </v-icon>
				</template>
				<template v-slot:item="{item,on,attrs}">
				  <div v-bind="attrs"
					   v-on="on">
				  	<span v-if="item.icon" :class="'dashicons-before dashicons-'+item.icon"></span><span>{{ item.title }}</span>
				  </div>
				</template>
				<template v-slot:selection="{item}">
				  <div >
					<span v-if="item.icon" :class="'dashicons-before dashicons-'+item.icon"></span><span>{{ item.title }}</span>
				  </div>
				</template>
			  </v-overflow-btn>
			</v-col>
		  </v-row>
		</v-container>

		<v-data-table
			ref="list"
			:headers="headers"
			:items="items"
			:loading="loading"
			loading-text="<?php echo __('Loading...','microhrm')?>"
			v-model="selected"
			:single-select="singleSelect"
			item-key="id"
			no-data-text="<?php echo __('Data not exist!','microhrm')?>"
			no-results-text="<?php echo __('No data found!','microhrm')?>"
			show-select
			class="elevation-1"
			:items-per-page="itemsPerPage"
			@pagination="handlePagination"
			:server-items-length="total"
			:page="currentPage"
			:options="pagination"
			@update:sort-by="handleSortBy"
			@update:sort-desc="handleSortDesc"
		>
		  <template v-for="header in headers.filter((header) => header.hasOwnProperty('formatter'))" v-slot:[`item.${header.value}`]="{ header, value }">
			{{ header.formatter(header, value) }}
		  </template>
		  <?php
		   $can_view=$this->get_list_view()->props["detailButton"] && current_user_can("microhrm_page_{$this->key}_view");
		   $can_edit=$this->get_list_view()->props["editButton"] && current_user_can("microhrm_page_{$this->key}_edit");
		   $can_delete=$this->get_list_view()->props["deleteButton"] && current_user_can("microhrm_page_{$this->key}_delete");
		   $can_create=$this->get_list_view()->props["createButton"] && current_user_can("microhrm_page_{$this->key}_create");
		   $can_list=current_user_can("microhrm_page_{$this->key}_list");
		   if($can_view||$can_edit||$can_delete){
		  ?>
		  <template v-slot:item.__action="{ item }">
			<v-icon v-if="access.view"
					small
					class="mr-2"
					@click="viewItem(item)"
			>
			  mdi-eye-outline
			</v-icon>
			<v-icon
					v-if="access.edit"
					small
					class="mr-2"
					@click="editItem(item)"
			>
			  mdi-pencil
			</v-icon>
			<v-icon
					v-if="access.delete"
					small
					@click="selectedToDelete=item"
			>
			  mdi-delete
			</v-icon>
		  </template>
		  <?php } ?>

		</v-data-table>
	  </v-card>
  </v-main>
  </v-container>
</div>

<script>
	var app = new Vue({
		el: '#microhrm-app',
		vuetify: new Vuetify({rtl: <?php echo is_rtl() ? 'true' : 'false'; ?>}),
		data() {
			return {
				api: '<?php echo get_site_url()?>/wp-json/microhrm/v1/',
				nonce: '<?php echo wp_create_nonce('wp_rest'); ?>',
				pageKey: '<?php echo $this->key ?>',
				title: '<?php echo $this->title ?>',
				singleSelect: false,
				search: '',
				selected: [],
				page: null,
				items: [],
				loading: true,
				selectedBulk: null,
				showBulkConfirm: false,
				selectedToDelete:null,
				notify: false,
				notifyText: '',
				header:null,
				access:{
					view:<?php echo $can_view?'true':'false';?>,
					edit:<?php echo $can_edit?'true':'false';?>,
					delete:<?php echo $can_delete?'true':'false';?>,
					create:<?php echo $can_create?'true':'false';?>,
					list:<?php echo $can_list?'true':'false';?>,
					bulk:{<?php foreach ($this->get_list_view()->bulk as $key=>$bulk) echo "$key:".(current_user_can("microhrm_bulk_{$this->key}_{$key}")?'true':'false'); ?>}
				},
				itemsPerPage:1,
				currentPage:1,
				pagination:{},
				total:0,
				sort: {by:'',desc:''},
				lastPaginationOptions:{},
				lastUrl:null

			}
		},
		mounted() {
			this.getMeta();
			// console.log(this);
		},
		methods: {
			handlePagination(e){

				this.lastPaginationOptions=e;
				if (!this.page) return;
				this.getData(e.page,e.itemsPerPage,this.sort,this.search);
			},
			handleSearch(){
				this.handlePagination(this.lastPaginationOptions)
			},
			handleSortDesc(e){
				this.sort.desc=e;
				this.handlePagination(this.lastPaginationOptions)
			},
			handleSortBy(e){
				this.sort.by=e;
			},
			showNotify(txt) {
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
					var page = data[this.pageKey];
					page.entity.allfields = {...page.entity.fields, ...page.entity.relations};
					this.itemsPerPage=page.listView.props.itemsPerPage;
					this.page = page;
				});
			},

			getData(currentPage,itemsPerPage,sort,search) {
				let url=this.api + 'page_' + this.page.key+'?page='+currentPage+'&per_page='+itemsPerPage+'&search='+encodeURIComponent(search);
				if (sort.by) url+='&sort='+encodeURIComponent(sort.by+' '+(sort.desc?'DESC':''));
				if(this.lastUrl===url) return;
				this.lastUrl=url;
				this.loading = true;
				this.get(url, (data) => {
					this.total = data.total;
					this.items = data.items;
					this.loading = false;
				});
			},
			getItemTitle(item){
				return this.resolveScript('return ' + this.page.entity.title_script, item);
			},
			resolveScript(script, _item, param) {
				if (!script || !_item) return "";
				"use strict"
				let value = {};
				let result = null;
				const that = this;
				const params = param;
				const item = _item;
				eval("result =(() => {\n" + (script.value || script) + "\n})(value,that,item,params)");
				return result || value;
			},
			editItem(item, meta) {
				window.location.href = window.location.href + "&id=" + item.id+"&mode=edit";;
			},
			viewItem(item, meta) {
				window.location.href = window.location.href + "&id=" + item.id+"&mode=view";
			},
			create() {
				window.location.href = window.location.href + "&id=new";
			},
			remove(item) {
				if (!item || !item.id || !/[0-9]+/.test(item.id)) return;
				jQuery.ajax({
					type: "DELETE",
					url: this.urlData + '/' + item.id,
					data: JSON.stringify(item.id),
					contentType: 'application/json',
					beforeSend: (xhr) => {
						xhr.setRequestHeader('X-WP-Nonce', this.nonce);
					},
					success: (data) => {
						location.reload();
					},
					error: (err) => {
						this.showNotify(err.responseJSON.message);
					},
					dataType: 'json'
				});

				this.selectedToDelete=null;
			},
			clearBulk() {
				this.selectedBulk = null;
				this.showBulkConfirm = false;
			},
			doBulk() {
				const bulk = this.selectedBulk;
				this.clearBulk();
				jQuery.ajax({
					type: "POST",
					url: this.urlData + '/bulk/' + bulk.key,
					data: JSON.stringify(this.selection),
					contentType: 'application/json',
					beforeSend: (xhr) => {
						xhr.setRequestHeader('X-WP-Nonce', this.nonce);
					},
					success: (data) => {
						location.reload();
					},
					error: (err) => {
						this.showNotify(err.responseJSON.message);
					},
					dataType: 'json'
				});
			}
		},
		watch: {
			selectedBulk(bulk) {
				if (!bulk) return;
				this.showBulkConfirm = true;
			},
		},
		computed: {
			urlMeta() {
				return this.api + 'page/' + this.pageKey;
			},
			urlData() {
				return this.api + 'page_' + this.page.key;
			},
			bulks() {
				const bulk = this.page && this.page.listView.bulk || null;
				if (!bulk) return null;
				const bulks = [];
				for (const key of Object.keys(bulk)) {
					const b = bulk[key];
					b.key = key;
					bulks.push(b);
				}
				return bulks;
			},
			showBulk() {
				return this.page && Object.keys(this.selection).length && this.bulks.length;
			},
			selection() {
				return this.page && this.$refs.list.selection || {};
			},
			headers() {
				if (!this.page) return [];
				var page = this.page;
				var header = page.listView.columns.map((key) => {
					var h = {
						text: page.entity.allfields[key].label,
						align: 'start',//  'start' | 'center' | 'end',
						sortable: page.listView.sortable.indexOf(key) > -1,
						filterable: page.listView.searchable.indexOf(key) > -1,
						value: key,
					}
					if (page.entity.relations[key]) {
						h.title_script = page.entity.relations[key].title_script;
						h.formatter = (header, value) => {
							if(!value) return '';
							if(Array.isArray(value)) return value.map(v=>{
									return this.resolveScript('return ' + header.title_script, v)
								}).join('-');
							return this.resolveScript('return ' + header.title_script, value)
						};
					}
					return h;
				});
				if(this.access.view||this.access.delete||this.access.edit) {
					const action = {
						text: 'Action',
						align: 'center',//  'start' | 'center' | 'end',
						sortable: false,
						filterable: false,
						value: '__action',
					};
					header.push(action);
				}
				this.header=header;
				return header;
			}
		}
	});
</script>



