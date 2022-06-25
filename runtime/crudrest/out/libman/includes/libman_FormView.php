<?php
/**
 * Class for page detiale mode (form view) configuration.
 *
 * @since      1.0.0
 * @package    libman
 * @author     Mohammadreza Asadi	https://mdse.ui.ac.ir/fa/member/%D9%85%D8%AD%D9%85%D8%AF%D8%B1%D8%B6%D8%A7-%D8%A7%D8%B3%D8%AF%DB%8C/
 */
include_once 'libman_Models.php';

class libman_FormView {

  public $fieldsLayouts=[];
  public $entity_key;

  public function __construct($entity_key,$fieldsLayouts)
  {
    $this->entity_key=$entity_key;
    $this->fieldsLayouts=$fieldsLayouts;
   
  }
}
