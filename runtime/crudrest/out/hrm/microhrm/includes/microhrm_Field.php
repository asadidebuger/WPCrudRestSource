<?php
/**
 * Class for Entity's Fields.
 *
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */
include_once 'microhrm_FieldBase.php';

class microhrm_Field extends microhrm_FieldBase
{
  
  public function __construct($key,$type,$label=null,$index=false,$unique=false,$required=false)
  {
   
	parent::__construct($key,$type,$label??$key,$index,$unique,$required);

  }

}
