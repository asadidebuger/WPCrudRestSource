<?php
/**
 * Class for page detiale mode (form view) configuration.
 *
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */
include_once 'microhrm_Models.php';

class microhrm_FormView {

  public $fieldsLayouts=[];
  public $entity_key;

  public function __construct($entity_key,$fieldsLayouts)
  {
    $this->entity_key=$entity_key;
    $this->fieldsLayouts=$fieldsLayouts;
   
  }
}
