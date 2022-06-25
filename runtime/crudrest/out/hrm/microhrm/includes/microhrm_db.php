<?php
/**
 * Database functionality
 *
 *
 * @since      1.5.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */
include_once 'microhrm_Models.php';

class microhrm_db {
	private $version= 4 ;
	 
	//Models instance static field
	private static $db=null;

	//static function to access db as singletone
	public static function get_db():microhrm_db {
	  if (self::$db==null) self::$db = new microhrm_db();
	  return self::$db;
	}

	public function init(){
		$version=get_site_option('microhrm_db_version');
		if(!$version) {
			$this->install();
			return; 
		}

		if ($version != $this->version) $this->update();
	}

	private function install(){
		global $wpdb;
		require_once(ABSPATH . 'wp-admin/includes/upgrade.php');

		$wpdb->query("CREATE TABLE {$wpdb->prefix}microhrm_person (
				`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
				`name` VARCHAR (50),
				`family` VARCHAR (50),
				`code` VARCHAR (10),
				`birth` DATE ,
				`description` TEXT ,
				`gender` INT (2) UNSIGNED,
				`mobile` VARCHAR (11),
				`phone` VARCHAR (14),
				`father` INT(11) UNSIGNED,
				`building_employ` INT(11) UNSIGNED,
				`shift_employe` INT(11) UNSIGNED,
				`insurance_person` INT(11) UNSIGNED,
				`blood` INT(11) UNSIGNED,
				UNIQUE KEY(`mobile`))");
		$wpdb->query("CREATE TABLE {$wpdb->prefix}microhrm_blood (
				`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
				`title` VARCHAR (50),
				UNIQUE KEY(`title`))");
		$wpdb->query("CREATE TABLE {$wpdb->prefix}microhrm_edu (
				`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
				`title` VARCHAR (50),
				UNIQUE KEY(`title`))");
		$wpdb->query("CREATE TABLE {$wpdb->prefix}microhrm_building (
				`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
				`title` VARCHAR (50),
				`capacity` INT ,
				UNIQUE KEY(`title`))");
		$wpdb->query("CREATE TABLE {$wpdb->prefix}microhrm_shift (
				`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
				`title` VARCHAR (50),
				`start` TIME ,
				`end` TIME ,
				UNIQUE KEY(`title`))");
		$wpdb->query("CREATE TABLE {$wpdb->prefix}microhrm_insurance (
				`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
				`title` VARCHAR (50),
				`start` DATETIME ,
				`end` DATETIME ,
				UNIQUE KEY(`title`))");
		$wpdb->query("CREATE TABLE {$wpdb->prefix}microhrm_asset (
				`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
				`title` VARCHAR (50),
				`code` VARCHAR (50),
				`owner` INT(11) UNSIGNED,
				`cat` INT(11) UNSIGNED)");
		$wpdb->query("CREATE TABLE {$wpdb->prefix}microhrm_assetCat (
				`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
				`title` VARCHAR (50),
				UNIQUE KEY(`title`))");
		$wpdb->query("CREATE TABLE {$wpdb->prefix}microhrm_employee (
				`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
				`code` VARCHAR (50),
				`active` BOOLEAN ,
				`start` DATE ,
				`job` INT(11) UNSIGNED,
				`cat` INT(11) UNSIGNED,
				UNIQUE KEY(`code`))");
		$wpdb->query("CREATE TABLE {$wpdb->prefix}microhrm_ability (
				`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
				`title` VARCHAR (50),
				UNIQUE KEY(`title`))");
		$wpdb->query("CREATE TABLE {$wpdb->prefix}microhrm_job (
				`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
				`title` VARCHAR (50),
				UNIQUE KEY(`title`))");
		$wpdb->query("CREATE TABLE {$wpdb->prefix}microhrm_workTime (
				`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
				`enter` DATETIME ,
				`exit` DATETIME ,
				`employee_workTime` INT(11) UNSIGNED,
				`employee` INT(11) UNSIGNED,
				UNIQUE KEY(`employee`))");
		$wpdb->query("CREATE TABLE {$wpdb->prefix}microhrm_jobCategory (
				`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
				`title` VARCHAR (50),
				`paymentRate` INT ,
				UNIQUE KEY(`title`))");
		$wpdb->query("CREATE TABLE {$wpdb->prefix}microhrm_m_edu_person (
				`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
				`person` INT(11) UNSIGNED,
				`edu` INT(11) UNSIGNED);");
		$wpdb->query("CREATE TABLE {$wpdb->prefix}microhrm_m_employee_insurance (
				`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
				`employee` INT(11) UNSIGNED,
				`insurance_person` INT(11) UNSIGNED);");
		$wpdb->query("CREATE TABLE {$wpdb->prefix}microhrm_m_building_employee (
				`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
				`employee` INT(11) UNSIGNED,
				`building_employ` INT(11) UNSIGNED);");
		$wpdb->query("CREATE TABLE {$wpdb->prefix}microhrm_m_ability_employee (
				`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
				`employee` INT(11) UNSIGNED,
				`ability` INT(11) UNSIGNED);");
		add_option('microhrm_db_version', $this->version);	
	}

	/**
	 * update function for manipulate db when version changed
	 * customize this function to handle db changes manually!
	 *
	 */
	private function update(){
		$this->uninstall();
		$this->install();
	}

	/**
	 * uninstall function to clear db tables
	 * this function will be called in plugin unistall event
	 *
	 */
	public function uninstall(){
		global $wpdb;
		$wpdb->query("DROP TABLE IF EXISTS {$wpdb->prefix}microhrm_person");
		$wpdb->query("DROP TABLE IF EXISTS {$wpdb->prefix}microhrm_m_edu_person");
		$wpdb->query("DROP TABLE IF EXISTS {$wpdb->prefix}microhrm_blood");
		$wpdb->query("DROP TABLE IF EXISTS {$wpdb->prefix}microhrm_edu");
		$wpdb->query("DROP TABLE IF EXISTS {$wpdb->prefix}microhrm_building");
		$wpdb->query("DROP TABLE IF EXISTS {$wpdb->prefix}microhrm_shift");
		$wpdb->query("DROP TABLE IF EXISTS {$wpdb->prefix}microhrm_insurance");
		$wpdb->query("DROP TABLE IF EXISTS {$wpdb->prefix}microhrm_asset");
		$wpdb->query("DROP TABLE IF EXISTS {$wpdb->prefix}microhrm_assetCat");
		$wpdb->query("DROP TABLE IF EXISTS {$wpdb->prefix}microhrm_employee");
		$wpdb->query("DROP TABLE IF EXISTS {$wpdb->prefix}microhrm_m_employee_insurance");
		$wpdb->query("DROP TABLE IF EXISTS {$wpdb->prefix}microhrm_m_building_employee");
		$wpdb->query("DROP TABLE IF EXISTS {$wpdb->prefix}microhrm_m_ability_employee");
		$wpdb->query("DROP TABLE IF EXISTS {$wpdb->prefix}microhrm_ability");
		$wpdb->query("DROP TABLE IF EXISTS {$wpdb->prefix}microhrm_job");
		$wpdb->query("DROP TABLE IF EXISTS {$wpdb->prefix}microhrm_workTime");
		$wpdb->query("DROP TABLE IF EXISTS {$wpdb->prefix}microhrm_jobCategory");
		delete_option('microhrm_db_version');
	}
   /** @var SplQueue $aliases_q */
  private $aliases_q = null;
  private $aliases=array();

  private function push_alias($key,$tail=0):string
  {
//	  if($this->aliases==null)$this->aliases_q=new SplQueue();
	$suffix=!!$tail?$tail:'';
	$alias=$key.$suffix;
	if(!in_array($alias,$this->aliases)) {
	  $this->aliases_q->enqueue($alias);
	  $this->aliases[]=$alias;
	  return $alias;
	}
	return $this->push_alias($key,$tail+1);
  }
  private function deque_alias():string
  {
	return $this->aliases_q->dequeue();
  }
  private function reset_alias()
  {
	$this->aliases = array();
	$this->aliases_q = new SplQueue();
  }
  public function fetch_data($entity_key, $fields, $search=null, $where = null, $order_by = null, $limit = -1, $offset = -1) : array
  {
	global $wpdb;
	$prefix = $wpdb->prefix . 'microhrm_';
	$entity = microhrm_Models::get_entity($entity_key);
	$e_fields = array();
	/** @var microhrm_Relation[] $e_relations */
	$e_relations = array();
	$this->reset_alias();
	$expanded_fields = array();

	//separate fields and relations
	foreach ($fields as $key) {
	  $field = $entity->get_field($key);
	  if ($field->type != 'relation') $e_fields[$key] = $field;
	  else $e_relations[$key] = $field;
	}
	$alias = $this->push_alias($entity_key);

	$q = "SELECT $alias.id, ";

	$targets = array();

	// select non relation fields
	foreach ($e_fields as $field) {
	  $q .= "$alias.$field->key, ";
	}

	// select relation fields
	foreach ($e_relations as $relation) {

	  $target = microhrm_Models::get_entity($relation->entity);
	  $targets[$target->key] = $target;
	  if ($relation->join_s_key === 'id') continue;
	  if ($relation->many) {
		$q .= "$entity_key.$relation->key, ";
		continue;
	  }
	  $alias = $this->push_alias($relation->join_table);
	  $t_q = "$alias.id AS {$relation->key}_id, ";
	  $expanded_fields[$relation->key] = ["id"];

	  // get fields that used in title script
	  foreach ($target->fields as $field) {
		if (strpos($target->title_script, $field->key) != false) {
		  $t_q .= "$alias.$field->key AS {$relation->key}_$field->key, ";
		  $expanded_fields[$relation->key][] = "$field->key";
		}
	  }
	  $q .= $t_q;

	}
	// escape last comma
	if (substr($q, -2) == ', ') $q = substr($q, 0, -2);

	$primary_alias=$alias = $this->deque_alias();


	$q .= " FROM $prefix$entity_key AS $alias";
	$total_query="SELECT COUNT(*) FROM $prefix$entity_key AS $alias";

	// add JOIN clause
	foreach ($e_relations as $relation) {
	  if (!$relation->many) {
		$alias = $this->deque_alias();
		$q_from = " LEFT JOIN $prefix$relation->join_table AS $alias ON $entity->key.$relation->join_s_key=$alias.$relation->join_t_key ";
		$q .= $q_from;
		continue;
	  }
	}

	$searchWhere=array();
	if ($search){
	  foreach ($fields as $key) {
		$field = $entity->get_field($key);
		if ($field->type != 'text' && $field->type != 'nationalCode') continue;
		$searchWhere[] = "$primary_alias.$key LIKE '%$search%'";
	  }
	  $searchWhere=implode(' OR ',$searchWhere);
	  if($searchWhere){
		if ($where) $where.=' AND ('.$searchWhere.')';
		else $where=$searchWhere;
	  }
	}

	if ($where) {
	  $q .= " WHERE " . $where;
	  $total_query .= " WHERE " . $where;
	}
	if ($order_by) $q .= " ORDER BY $primary_alias.$order_by";
	if ($limit > -1) $q .= " LIMIT " . $limit;
	if ($offset > -1) $q .= " OFFSET  " . $offset;
	$total=0;
	$rows = $wpdb->get_results($q);
	if(!count($rows)) return array('items'=>$rows,'total'=>$total);
	$total = $wpdb->get_var($total_query);
	foreach ($e_relations as $relation) {
	  if (!$relation->many) continue;
	  $target = $targets[$relation->entity];

	  /** @var microhrm_Relation $opposite */
	  $opposite = $relation->opposite ? $target->get_field($relation->opposite) : null;

	  if ($opposite && $opposite->many) {
		$sub_query = "SELECT $entity_key.$relation->join_s_key AS {$entity_key}_id, $relation->entity.id, ";
		foreach ($target->fields as $field) {
		  if (strpos($target->title_script, $field->key) != false) {
			$sub_query .= "$relation->entity.$field->key AS $field->key, ";
		  }
		}
		if (substr($sub_query, -2) == ', ') $sub_query = substr($sub_query, 0, -2);

		$sub_query.=" FROM $prefix$entity_key as $entity_key ";
		$sub_query.=" RIGHT JOIN $prefix$relation->join_table AS $relation->join_table ON $entity->key.$relation->join_s_key=$relation->join_table.$relation->join_t_key ";
		$sub_query.=" RIGHT JOIN $prefix$relation->entity AS $relation->entity ON $target->key.$opposite->join_s_key=$relation->join_table.$opposite->join_t_key ";
		$ids = array();
		foreach ($rows as $row) {
		  $ids[] = $row->id;
		}
		$ids = implode(',', $ids);
		$sub_query.=" WHERE $entity_key.$relation->join_s_key IN ($ids)";
	  }
	  else  {
		$sub_query = "SELECT id, $relation->join_t_key, ";
		foreach ($target->fields as $field) {
		  if (strpos($target->title_script, $field->key) != false) {
			$sub_query .= "$field->key , ";
		  }
		}
		if (substr($sub_query, -2) == ', ') $sub_query = substr($sub_query, 0, -2);

		$ids = array();
		foreach ($rows as $row) {
		  $k = $relation->join_s_key;
		  $id = $row->$k;
		  if ($id == null) continue;
		  if (!in_array($id, $ids)) $ids[] = $id;
		}
		$ids = implode(',', $ids);
		$sub_query .= " FROM $prefix$relation->join_table WHERE $relation->join_t_key IN ($ids)";
	  }
//	else  {
////		$alias = $this->push_alias($relation->join_table);
//		$sub_query = "SELECT id, ";
//
//		foreach ($target->fields as $field) {
//		  if (strpos($target->title_script, $field->key) != false) {
//			$sub_query .= "$field->key , ";
//		  }
//		}
//		if (substr($sub_query, -2) == ', ') $sub_query = substr($sub_query, 0, -2);
//
//		$ids = array();
//		foreach ($rows as $row) {
//		  $k = $relation->join_s_key;
//		  $id = $row->$k;
//		  if ($id == null) continue;
//		  if (!in_array($id, $ids)) $ids[] = $id;
//		}
//		$ids = implode(',', $ids);
//		$sub_query .= " FROM $prefix$relation->join_table WHERE $relation->join_t_key IN ($ids)";
//	  }
	  $sub_rows = $wpdb->get_results($sub_query);


	  if ($opposite && $opposite->many) {
		foreach ($rows as $row) {

		  $k = "{$entity_key}_id";
		  $id = $row->id;
		  $filters=array();
		  $reminds=array();
		  foreach ($sub_rows as $key=>$data){
			if ($data->$k == $id){
			  unset($data->$k);
			  $filters[]= $data;
			}else $reminds[]=$data;
		  }
		  $row->{$relation->key} = $filters;
		  $sub_rows=$reminds;

		}
	  }else {
		foreach ($rows as $row) {

		  $k = $relation->join_s_key;
		  $id = $row->$k;
		  if ($id == null) {
			$row->{$relation->key} = array();
			continue;
		  }
		  $row->{$relation->key} = array_values(array_filter($sub_rows, function ($data) use ($id,$relation) {
			return $data->{$relation->join_t_key} == $id;
		  }));
		}
	  }

	}
	if (!count($expanded_fields)) return array('items'=>$rows,'total'=>$total);

	foreach ($rows as $row) {
	  foreach ($expanded_fields as $key=>$fields){
		$row->$key=null;
		foreach ($fields as $field)
		{
		  $k=$key.'_'.$field;
		  $value=$row->$k;
		  unset($row->$k);
		  if (!$value) continue;
		  if($row->$key==null)$row->$key=new stdClass();
		  $row->$key->$field=$value;
		}

	  }


	}
	return array('items'=>$rows,'total'=>$total);

  }


  public function mutation_item( $item,$entity_key)
  {
	global $wpdb;
	$prefix = $wpdb->prefix . 'microhrm_';
	$entity = microhrm_Models::get_entity($entity_key);
	$removed_keys = array();
	// many-many bi-direct
	$m_m_b = new stdClass();
	// many-one bi-direct
	$m_o_b = new stdClass();
	$id = array_key_exists("id", $item) ? $item["id"] : 0;
	$current = $id ? $wpdb->get_row("SELECT * FROM $prefix$entity_key WHERE id=$id") : null;
	foreach ($item as $key => $value) {
	  $relation = $entity->get_relation($key);
	  if (!$relation) {
		if ($current && $current->$key == $value) $removed_keys[] = $key;
		continue;
	  }
	  $opposite = $relation->opposite;
	  if (!$opposite) {
		//many-one direct
		if (!$relation->many) {
		  if ($current && $current->$key == $value) $removed_keys[] = $key;
		  continue;
		}

		// many-one direct
		$ids=implode(',',$value);
		$wpdb->query("UPDATE $prefix$relation->entity SET $relation->join_t_key=NULL WHERE $relation->join_t_key = $id");
		$wpdb->query("UPDATE $prefix$relation->entity SET $relation->join_t_key=$id WHERE id IN ($ids)");
		$removed_keys[] = $key;
		continue;
	  }
	  $target = microhrm_Models::get_entity($relation->entity);
	  $opposite = $target->get_relation($relation->opposite);
//	  if ($relation->entity==$entity_key)
//	  {
//
//	    continue;
//	  }
	  if ($opposite->many) {
		//many-many bi-direct
		if ($relation->many) {
		  $tmp = new stdClass();
		  $tmp->value = $value;
		  $tmp->relation = $relation;
		  $tmp->opposite = $opposite;
		  $tmp->target = $target;
		  $m_m_b->$key = $tmp;
		  $removed_keys[] = $key;
		  continue;
		}
		//many-one bi-direct
		if ($current && $current->$key == $value) $removed_keys[] = $key;
		continue;

		continue;
	  }
	  $tmp = new stdClass();
	  $tmp->value = $value;
	  $tmp->relation = $relation;
	  $tmp->opposite = $opposite;
	  $tmp->target = $target;
	  $m_o_b->$key = $tmp;
	  $removed_keys[] = $key;

	}

	foreach ($removed_keys as $key) {
	  unset($item[$key]);
	}
	if (count($item)) {
	  if ($current) {
		$result = $wpdb->update("$prefix$entity_key", $item, array('id' => $id));
	  } else {
		$result = $wpdb->insert("$prefix$entity_key", $item);
		$id = $wpdb->insert_id;
	  }
	  if ($result===false) return $wpdb->last_error;
	}
	foreach ($m_m_b as $key => $mmb) {
	  $relation = $mmb->relation;
	  $values = $mmb->value;
	  $opposite = $mmb->opposite;
	  $target = $mmb->target;
	  $table = $relation->join_table;

	  if ($current) {

		$items = $wpdb->get_results("SELECT * FROM $prefix$relation->join_table WHERE $relation->join_t_key=$id");
		$ids_to_remove = array();
		foreach ($items as $item) {
		  $search=array_search($item->{$relation->entity}, $values);
		  if ($search=== false)$ids_to_remove[] = $item->id;
		  else unset($values[$search]);
		}
		if (count($ids_to_remove)) {
		  $ids_to_remove=implode(',',$ids_to_remove);
		  $wpdb->query("DELETE FROM $prefix$relation->join_table WHERE id IN ($ids_to_remove)");
		}
	  }
	  if ($id && count($values)) {
		$insert_query = "INSERT INTO $prefix$relation->join_table ($relation->join_t_key,$opposite->join_t_key) VALUES ";
		$insert_query_values = array();
		foreach ($values as $value) {

		  array_push($insert_query_values, "($id,$value)");
		}
		$insert_query .= implode(",", $insert_query_values);
		$wpdb->query($insert_query);
	  }

	}
	foreach ($m_o_b as $key => $mmb) {
	  $relation = $mmb->relation;
	  $values = $mmb->value;
	  $opposite = $mmb->opposite;
	  $target = $mmb->target;
	  $table = $relation->join_table;

	  if ($current) {

		$items = $wpdb->get_results("SELECT id,$opposite->join_s_key FROM $prefix$relation->join_table WHERE $opposite->join_s_key=$id");
		$ids_to_remove = array();
		foreach ($items as $item) {
//		  if ( !$values|| !count($values) || in_array($item->{$relation->join_s_key},$values)) continue;
//		  $ids_to_remove[] = $item->id;
		  $search=array_search($item->{$relation->join_s_key}, $values);
		  if ($search=== false)$ids_to_remove[] = $item->id;
		  else unset($values[$search]);
		}
		if (count($ids_to_remove)) {
		  $ids_to_remove=implode(',',$ids_to_remove);
		  $wpdb->query("UPDATE $prefix$relation->join_table SET $opposite->join_s_key = NULL WHERE id IN ($ids_to_remove)");
		}
	  }
	  if ($values && count($values)) {
		$ids = implode(",", $values);
		$wpdb->query("UPDATE $prefix$relation->join_table SET $opposite->join_s_key=$id WHERE id IN ($ids)");
	  }
	}
	return $id;
  }
  public function delete_item( $item,$entity_key):int
  {
	global $wpdb;
	$prefix = $wpdb->prefix . 'microhrm_';
	$entity = microhrm_Models::get_entity($entity_key);
	$id =is_array($item)?(array_key_exists('id', $item) ? $item["id"] : 0):$item;
	$current = $id ? $wpdb->get_row("SELECT * FROM $prefix$entity_key WHERE id=$id") : null;
	if (!$current) return 0;
	foreach ($current as $key => $value) {
	  $relation = $entity->get_relation($key);
	  if (!$relation) continue;
	  $opposite = $relation->opposite;
	  if (!$opposite) {
		//many-one direct
		if (!$relation->many) continue;
		$wpdb->query("UPDATE $prefix$relation->entity SET $relation->join_t_key=NULL WHERE $relation->join_t_key = $id");
		continue;
	  }
	  $target = microhrm_Models::get_entity($relation->entity);
	  $opposite = $target->get_relation($relation->opposite);

	  if ($opposite->many) {
		//many-many bi-direct
		if ($relation->many) {
		  $wpdb->query("DELETE FROM $prefix$relation->join_table WHERE $entity_key = $id");
		  continue;
		}
		//many-one bi-direct
		if ($relation->join_table==$entity_key)
		  $wpdb->query("UPDATE $prefix$relation->join_table SET $opposite->join_t_key=NULL WHERE $opposite->join_t_key = $id");
		continue;
	  }
	}
	$wpdb->query("DELETE FROM $prefix$entity_key  WHERE id = $id");
	return $id;
  }


}
