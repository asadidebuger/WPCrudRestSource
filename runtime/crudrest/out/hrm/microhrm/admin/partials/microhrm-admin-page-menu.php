<?php

/**
 * Provide a admin area view for the plugin main page
 *
 * This file is used to markup the admin-facing aspects of the plugin.
 *
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */
/** @var microhrm_Page $this */
?>
<div id="app" data-app class="v-application <?php echo is_rtl()?'rtl':'ltr'; ?>">
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
    <v-main v-if="menu">
	<h1>{{title}} <span :class="'dashicons-before '+menu.icon"></span>
	  <v-btn v-if="canConfigOptions" depressed @click="goToOptions"> <?php echo __('Options','microhrm') ?> </v-btn>
	</h1>
	<v-container fluid>
	  <v-row>
		<v-col v-for="(item,slug) in menu.sub" v-id="slug" cols="12" sm="6" md="4" lg="3" xl="2">
		  <v-card class="mx-auto"  outlined>
			<v-list-item three-line>
			  <v-list-item-content>
				<v-list-item-title class="text-h5 mb-1">
				  {{item.title}}
				</v-list-item-title>
			  </v-list-item-content>
			</v-list-item>

			<v-card-actions>
			  <v-btn  outlined
					  rounded
					  text
					  @click="goToPage(slug)">
				<?php echo __('Page','microhrm')?>
			  </v-btn>
			</v-card-actions>
		  </v-card>
		</v-col>
	  </v-row>
	</v-container>
  </v-main>
<script>
	var app = new Vue({
		el: '#app',
		vuetify: new Vuetify({rtl: <?php echo is_rtl() ? 'true' : 'false'; ?>}),

		data() {
			return {
				slug: '<?php echo $this->slug ?>',
				api: '<?php echo get_site_url()?>/wp-json/microhrm/v1/',
				nonce: '<?php echo wp_create_nonce('wp_rest'); ?>',
				menu: null,
				notify: false,
				notifyText: '',
				canConfigOptions:<?php $user = wp_get_current_user(); $allowed_roles = array('administrator');
			  echo (count(array_intersect($allowed_roles, $user->roles ))>0?'true':'false'); ?>,
			}

		},
		mounted() {
			this.getMenus();
		},

		methods: {
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
			getMenus() {
				this.get(this.urlMenus, (data) => {
					this.menu = data[this.slug];
				});
			},
			goToPage(slug) {
				var url = window.location.href;
				window.location.href = url + '-' + slug;
			},
			goToOptions(){
				window.location.href ='<?php echo get_site_url();?>/wp-admin/options-general.php?page=options_microhrm';
			}
		},
		computed: {
			urlMenus() {
				return this.api + 'admin-menu/' + this.slug
			},
			title() {
				return this.menu.title

			}
		}

	});
</script>


