<?php
/**
 * Class for Entity's Fields.
 *
 * @since      1.0.0
 * @package    libman
 * @author     Mohammadreza Asadi	https://mdse.ui.ac.ir/fa/member/%D9%85%D8%AD%D9%85%D8%AF%D8%B1%D8%B6%D8%A7-%D8%A7%D8%B3%D8%AF%DB%8C/
 */
include_once 'libman_FieldBase.php';

class libman_Field extends libman_FieldBase
{
  
  public function __construct($key,$type,$label=null,$index=false,$unique=false,$required=false)
  {
   
	parent::__construct($key,$type,$label??$key,$index,$unique,$required);

  }

}
