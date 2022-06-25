package crudrest;
import java.util.regex.*;  
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.*;
import java.net.URL;
import java.util.List;
import java.util.*;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    static String PROJECT_ROOT_NAME="crudrest";
	static String PROJECT_ROOT_PATH=getProjectRoot();
	
	public String getDirectory(EObject plg) {
		Object detail=getFeature(plg, "detail");
		if (notEmpty(detail)) {
			Object dir=getFeature((EObject)detail, "directory");
			if (notEmpty(dir))return dir.toString();
		}
		
		Object dir= getFeature(plg, "name");
		if (notEmpty(dir))return  dir.toString();
		return "CrudRestPlugin";
	}	
	public String getPrefix(EObject plg) {
		Object detail=getFeature(plg, "detail");
		if (notEmpty(detail)) {
			Object dir=getFeature((EObject)detail, "prefix");
			if (notEmpty(dir))return dir.toString();
		}
		return getDirectory(plg);
	}
	public String getLanguagesDirectory(EObject plg) {
		Object detail=getFeature(plg, "detail");
		if (notEmpty(detail)) {
			Object dir=getFeature((EObject)detail, "domainPath");
			if (notEmpty(dir))return dir.toString();
		}
		return "languages";
	}
	public String getCopyrightComment(EObject plg,String since) {
		String author="";
		Object detail=getFeature(plg, "detail");
		if (notEmpty(detail)) {
			Object au=getFeature((EObject)detail, "author");
			if (notEmpty(au)) author= au.toString();
			Object url=getFeature((EObject)detail, "authorURI");
			if (notEmpty(url)) author+="\t"+ url.toString();
		}
		
		return " * @since      "+(notEmpty(since)?since:"1.0.0")+"\r\n"
				+ " * @package    "+getPrefix(plg)+"\r\n"
				+ " * @author     "+author;
	}	
	public String getCopyrightComment(EObject plg) {
		return getCopyrightComment(plg,null);
	}
	public static String getProjectRoot() {
		URL resource =Services.class.getResource("/");
		String path  =resource.getPath();
		path= path.substring(0, path.lastIndexOf(PROJECT_ROOT_NAME)+PROJECT_ROOT_NAME.length());
		return path;
	}
//	public Service(){
////		ResourceSet rs = new ResourceSetImpl();
////        rs.getPackageRegistry().put(crudrest.CrudrestPackage.eNS_URI, crudrest.CrudrestPackage.eINSTANCE);
////  		Resource.Factory.Registry  r = rs.getResourceFactoryRegistry();
////  				Map<String,Object> m = r.getExtensionToFactoryMap();
////  				m.put("*",new XMIResourceFactoryImpl());
//  	}
	public Boolean notEmpty(Object st) {
		//System.out.print((st==null?"null":st).toString());
    	return st != null && st.toString().trim().length()!=0;
    }
	public Boolean isEmpty(Object st) {
    	return st == null || st.toString().trim().length()==0;
    }
	public Object getFeature(EObject eobject,String name) {
		if (isEmpty(eobject)) return null;
    	final EStructuralFeature fFeature  = eobject.eClass().getEStructuralFeature (name);
    	if (isEmpty(fFeature)) return null;
    	return eobject.eGet(fFeature);
    }
	public Object getFeature(Object eobject,String name) {
		return getFeature((EObject) eobject, name);
    }
	public Boolean keyIsValid(EObject eobject) {
		return this.keyIsValid(eobject, "key");
    }
	public Boolean nameIsValid(EObject eobject) {
		return this.keyIsValid(eobject, "name");
    }
	public Boolean keyIsValid(EObject eobject,String key) {
		return Pattern.matches("^[a-zA-z]+[a-zA-Z0-9]*$", getFeature(eobject, key).toString());
    }
//	public IExternalJavaAction biuld() {
//		IExternalJavaAction e=new IExternalJavaAction() {
//			
//			@Override
//			public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public boolean canExecute(Collection<? extends EObject> arg0) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//		};
//		return e;
//	}
	 public String getEntityLabel(EObject eobject) {
      	 Object label = getFeature(eobject,"label");
      	 if (notEmpty(label))return label.toString();
      	 Object key = getFeature(eobject,"key");
      	 if (notEmpty(key))return label.toString();
      	 return "Select a key!";
   	}
//	 public String getEntityLabel(EObject eobject,EObject entity) {
//      	 return getEntityLabel(entity);
//   	}
    public String getFieldLabel(EObject eobject,EObject field) {
   	 return getFieldLabel(field);
	} 
    public String getLayoutLabel(EObject eobject) {
        
    	Object name=getFeature(eobject, "name");
    	if (notEmpty(name))return name.toString();
      	 return getLayoutResult(eobject);
   	}
    public String getLayoutLabel(EObject eobject,EObject layout) {
    	
    	Object name=getFeature(layout, "name");
    	
      	 return name+" ["+ getLayoutResult(layout)+"]";
   	}
    public String getFieldLayoutLabel(EObject eobject,EObject fieldLayout) {
    	EObject field= (EObject) getFeature(fieldLayout, "field");
    	EObject layout= (EObject) getFeature(fieldLayout, "layout");
    	String lb=getFieldLabel(field).toString();
    	if (notEmpty(layout))  lb+="["+getLayoutLabel(layout)+"]";
   	 return lb;
	} 
    public Integer getInt(EObject eobject,String key) {
   	 	Object o=getFeature(eobject,key);
   	 	if (isEmpty(o)) return 0;
   	 	return (Integer)o;
    }
    public String getString(EObject eobject,String key) {
   	 	Object o=getFeature(eobject,key);
   	 	if (isEmpty(o)) return "";
   	 	return (String)o;
    }
    public String getString(Object eobject,String key) {
   	 	return getString((EObject)eobject,key);
    }
    public Boolean getBoolean(Object eobject,String key) {
   	 	Object o=getFeature(eobject,key);
   	 	if (isEmpty(o)) return false;
   	 	return (Boolean)o;
    }
    public Boolean checkPageIsValid(UIPage page){
    	if (page.getEntity()==null)return false;
    	String key=page.getKey();
    	if (key==null||key.isBlank()||key=="select_a_unique_key")return false;
    	return true;
    }
//    public List<FieldBase> getPageEntityFields(EObject eobject,EObject page){
//    	return getPageEntityFields(page);
//    }
    
	public List<FieldBase> getPageEntityFields(UIPage page){
//		UIPage page=(UIPage) eobject;
		List<FieldBase> result=new ArrayList<FieldBase>();
		if (page==null) 
			return result;
    	Entity entity=page.getEntity();
    	List<Field> fields= entity.getFields();
    	List<Relation> relations=entity.getRelations();
    	
    	for(Field f:fields) result.add(f);
    	for(Relation f:relations) result.add(f);
    	return result;
    }
    public String getFieldLabel(EObject eobject) {
     	 Object label = getFeature(eobject,"label");
     	 if (notEmpty(label))return label.toString();
     	 Object key = getFeature(eobject,"key");
     	 if (notEmpty(key))return label.toString();
     	 return "Select a key!";
  	}
    public String getFieldLabelAndType(EObject eobject) {
    	 Object type = getFeature(eobject,"type");
    	 return getFieldLabel(eobject)+"("+(type==null?"Select type!":getFeature((EObject) type, "key"))+")";
 	}
    public String getRelationLabel(EObject eobject) {
    	
    	 Object entity = getFeature(eobject,"entity");
    	 Object opposite=null;
    	 if (notEmpty(entity)) {
    		 opposite=getFeature(eobject,"opposite");
    		 
    	 }
//    	 return getFieldLabel(eobject).toString();
    	 return getFieldLabel(eobject)+"::"+(entity==null?"Select Entity!":getEntityLabel((EObject) entity)+(opposite==null?".id":("."+getFieldLabel((EObject) opposite))));
 	}
    public String getEntityPluralLabel(EObject eobject) {
      	 Object labelPlural =getFeature(eobject,"labelPlural");
      	 if (notEmpty(labelPlural)) return labelPlural.toString();
      	return getEntityLabel(eobject);
   	}
    public String getPageTitle(EObject eobject) {
   	 Object overrideTitle =getFeature(eobject,"overrideTitle");
   	 if (notEmpty(overrideTitle)) return overrideTitle.toString();
   	 Object entity=getFeature(eobject, "entity");
   	 if (entity==null)return "Select an entity!";
   	 return getEntityPluralLabel((EObject)entity);
	}
    public String getPageTitle(EObject eobject,EObject eobject2) {
    	return getPageTitle(eobject2); 
   	} 
    
    public String getReusableLayoutTitle(EObject eobject) {
    	Object name=getFeature(eobject, "name");
      	 if (notEmpty(name))return name.toString();
      	 return "Select an name!";
   	}
//    public String getRelationLineLabel(EObject eobject) {
////    	return eobject.toString();
////    	//[self.key+'.'+self.relations.key/]
//    	 Object key = getFeature(eobject,"key");
////    	 Object rkey = getFeature(relation,"key");
//    	 return key.toString();// relation.toString();
////    	 Object key = getFeature(eobject,"key");
//////    	 return getFieldLabel(eobject).toString();
////    	 return getFieldLabel(eobject)+"::"+(entity==null?"Select Entity!":getEntityLabel((EObject) entity)+".id");
//   	}
    
    
    public String getMenuTitle(EObject eobject) {
    	 Object overrideTitle = getFeature (eobject, "overrideTitle" );
    	 if (notEmpty(overrideTitle)) return overrideTitle.toString();
    	 Object page= getFeature (eobject, "page" );
    	 if (page==null) return "Select a page!";
    	 String pageTitle= getPageTitle((EObject) page);
    	 return pageTitle;
	}
    public List<Integer> getOneToTowelveList(EObject eobject) {
    	List<Integer> i=new ArrayList<Integer>();
//    	i.add(null);
    	for (Integer j = 0; j < 13; j++) {
			i.add(j);
		}
    	return i;
   	}
    public List<EObject> addFieldToList(EObject eobject,String e,List<EObject> newFields,List<EObject> fields) {
//    	return newFields;
    	if (e!="DOUBLE_CLICK")return fields;
    	if (newFields==null||newFields.size()<1)return fields;
    	List<EObject> old=fields;
    	if (old==null) old= new ArrayList<EObject>();
    	old.add(newFields.get(0));
    	return old;
   	}
    public EObject getFirstItemFromList(EObject eobject,List<EObject> fields) {
//    	return newFields;
//    	if (e!="DOUBLE_CLICK")return fields;
    	if (fields==null||fields.size()<1)return null;
    	return fields.get(0);
   	}
    public List<EObject> removeFieldFromList(EObject eobject,String e,List<EObject> newFields,List<EObject> fields) {
    	if (e!="DOUBLE_CLICK")return null;
    	return newFields;
//    	return null;//new ArrayList<EObject>();
//    	
//    	if (newFields==null||newFields.size()<1)return fields;
//    	List<EObject> old=fields;
//    	if (old==null) old= new ArrayList<EObject>();
//    	old.remove(0);
////    	old.remove(newFields.get(0));
//    	return old;
   	}
    public Boolean repositoryAttached(EObject eobject,EObject root) {
//    	return false;
    	if (getFeature(root, "repository")==null)return false;
    	return true;
   	}
    public Boolean repositoryNotAttached(EObject eobject,EObject root) {
    	return !repositoryAttached(eobject,root);
   	}
    public Boolean canAddFieldToForm(EObject eobject,String e,List<EObject> newFields,List<EObject> fields) {
    	if (e!="DOUBLE_CLICK")return false;
//    	return true;
    	if (newFields==null||newFields.size()<1)return false;
    	EObject newField=newFields.get(0);
    	for (int i=0;i<fields.size();i++) {
    		EObject field = fields.get(i);
    		if (getFeature(field, "field")==newField) return false;
			
		}
    	return true;
   	}
    public String getExtendedWebServiceLabel(EObject eobject) {
      	 Object name=getFeature(eobject, "name");
      	 if (isEmpty(name))return "Set Name!";
      	 Object method=getFeature(eobject, "method");
      	 return method+"::" +name;
   	} 
    static EObject currentFormField=null;
    public EObject getSelectedFormField(EObject eobject) {
    	return currentFormField;
    }
    public Boolean notNullselectedFormField(EObject eobject) {
    	return currentFormField!=null;
    }
    public EObject getSelectedFormFieldLayout(EObject eobject) {
    	return (EObject) getFeature(currentFormField,"layout");
    }
    public Boolean canRemoveFieldForm(EObject eobject,String e,List<EObject> newFields) {
    	currentFormField =newFields.get(0);
    	if (e!="DOUBLE_CLICK")return false;
    	currentFormField=null;
    	return true;
   	}
    public String getPageWizardTitle(EObject eobject) {
    	return "Customize \""+getPageTitle(eobject)+"\" Page";
   	}
    public String getPageListTitle(EObject page) {
    	String title=getPageTitle(page);
    	return "Customize \""+title+"\" page in list view mode:";
   	}
    public String getPageFormTitle(EObject eobject,EObject page) {
    	String title=getPageTitle(page);
    	return "Customize \""+title+"\" page in detail (form) view mode:";
   	}
    public String getLayoutDescription(EObject eobject) {
    	return "In this section select width of element accourding to the Bootstrap framework.\r\n"
    			+ "For example 12 means 100% and 6 is 50%...\r\n"
    			+ "value 0 mens nothing and no bootstrap class will be added to the element!";
   	}
    public String getLayoutCalss(EObject eobject) {
    	if (isEmpty(eobject)) return "";
    	Object _xs= getFeature(eobject, "col_xs");
    	Object _sm= getFeature(eobject, "col_sm");
    	Object _md= getFeature(eobject, "col_md");
    	Object _lg= getFeature(eobject, "col_lg");
    	Object _xl= getFeature(eobject, "col_xl");
    	
    	int xs=notEmpty(_xs)? (int) _xs:0;
    	int sm=notEmpty(_sm)? (int) _sm:0;
    	int md=notEmpty(_md)? (int) _md:0;
    	int lg=notEmpty(_lg)? (int) _lg:0;
    	int xl=notEmpty(_xl)? (int) _xl:0;
    	Object cls= getFeature(eobject, "class");
    	String clazz="";
    	if (xs>0)clazz+="col-xs-"+xs+" ";
    	if (sm>0)clazz+="col-sm-"+sm+" ";
    	if (md>0)clazz+="col-md-"+md+" ";
    	if (lg>0)clazz+="col-lg-"+lg+" ";
    	if (xl>0)clazz+="col-xl-"+xl+" ";
    	if (notEmpty(cls)) clazz+= cls.toString().trim();
    	return clazz;
    }
    public String getLayoutResult(EObject eobject) {
//    	return eobject.toString();
//    	int xs=(int) getFeature(eobject, "col_xs");
//    	int sm=(int) getFeature(eobject, "col_sm");
//    	int md=(int) getFeature(eobject, "col_md");
//    	int lg=(int) getFeature(eobject, "col_lg");
//    	int xl=(int) getFeature(eobject, "col_xl");
//    	Object cls= getFeature(eobject, "class");
    	Object style= getFeature(eobject, "style");
    	String clazz=getLayoutCalss(eobject);
//    	if (xs>0)clazz+="col-xs-"+xs+" ";
//    	if (sm>0)clazz+="col-sm-"+sm+" ";
//    	if (md>0)clazz+="col-md-"+md+" ";
//    	if (lg>0)clazz+="col-lg-"+lg+" ";
//    	if (xl>0)clazz+="col-xl-"+xl+" ";
//    	
//    	if (notEmpty(cls)) clazz+= cls.toString().trim();
    	if (notEmpty(clazz)) clazz="class=\""+clazz+"\" ";
    	
    	if (notEmpty(style)) clazz+="style=\""+ style.toString().trim()+"\"";
    	return clazz.trim();
    	
   	}
     public boolean getFalse(EObject eobject) {
		return false;
	}
	 public List<FieldBase> getSortableFields(EObject eobject) {
		 crudrest.List list=(crudrest.List) eobject;
		 List<FieldBase> s=list.getSortableColumns();//(List<EObject>) getFeature(eobject, "sortableColumns");
			if (s==null||s.size()>0) return  new ArrayList<FieldBase>();
			UIPage page=(UIPage) list.eContainer();
			return getPageEntityFields(page);
// 			EObject entity= (EObject) getFeature(page, "entity");
// 			return (List<EObject>) getFeature(entity, "fields");
		}
//	 public List unifyList(List<EObject> lst) {
//		 if (lst.size()<2)return lst;
//		 List result=new ArrayList();
//		 EObject first=lst.get(0);
//		 for(int i=1;i<lst.size();i++) {
//			 EObject o=lst.get(i);
//			 o.
//			 result.add(o);
////			 o.get
//		 }
//		 return lst;
//		 
//		 
//	 }
     public List<String> getIcons(EObject o) {
    	 String[] s= {"menu","admin-site","dashboard","admin-post","admin-media","admin-links","admin-page","admin-comments","admin-appearance","admin-plugins","admin-users","admin-tools","admin-settings","admin-network","admin-home","admin-generic","admin-collapse","welcome-write-blog","welcome-add-page","welcome-view-site","welcome-widgets-menus","welcome-comments","welcome-learn-more","format-aside","format-image","format-gallery","format-video","format-status","format-quote","format-chat","format-audio","camera","images-alt","images-alt2","video-alt","video-alt2","video-alt3","image-crop","image-rotate-left","image-rotate-right","image-flip-vertical","image-flip-horizontal","undo","redo","editor-bold","editor-italic","editor-ul","editor-ol","editor-quote","editor-alignleft","editor-aligncenter","editor-alignright","editor-insertmore","editor-spellcheck","editor-distractionfree","editor-kitchensink","editor-underline","editor-justify","editor-textcolor","editor-paste-word","editor-paste-text","editor-removeformatting","editor-video","editor-customchar","editor-outdent","editor-indent","editor-help","editor-strikethrough","editor-unlink","editor-rtl","align-left","align-right","align-center","align-none","lock","calendar","visibility","post-status","edit","trash","arrow-up","arrow-down","arrow-right","arrow-left","arrow-up-alt","arrow-down-alt","arrow-right-alt","arrow-left-alt","arrow-up-alt2","arrow-down-alt2","arrow-right-alt2","arrow-left-alt2","sort","leftright","list-view","exerpt-view","share","share-alt","share-alt2","twitter","rss","facebook","facebook-alt","googleplus","networking","hammer","art","migrate","performance","wordpress","wordpress-alt","pressthis","update","screenoptions","info","cart","feedback","cloud","translation","tag","category","yes","no","no-alt","plus","minus","dismiss","marker","star-filled","star-half","star-empty","flag","location","location-alt","vault","shield","shield-alt","search","slides","analytics","chart-pie","chart-bar","chart-line","chart-area","groups","businessman","id","id-alt","products","awards","forms","portfolio","book","book-alt","download","upload","backup","lightbulb","smiley"};
    	 ArrayList<String>ss= new ArrayList<String>();
    	 for(int i=0;i<s.length;i++) {
    		 ss.add(s[i]);
    	 }
    	 return ss;
     }  

     public String getRelationJoinTabel(Relation relation) {
    	 Relation opposite= relation.getOpposite();
    	 Entity targetEntity= relation.getEntity();
    	 if (opposite==null)return targetEntity.getKey();
    	 Entity sourceEntity=(Entity) relation.eContainer();
    	 Boolean manySelf=relation.isMany();
    	 Boolean manyOpp=opposite.isMany();
    	 
    	 if (manySelf&&manyOpp) {
    		 String source=sourceEntity.getKey();
    		 String target=targetEntity.getKey();
    		 return "m_"+(source.compareTo(target)>0?target:source)+"_"+(source.compareTo(target)<0?target:source);
    	 }

    	 return targetEntity.getKey();
	 }
     

     public String getRelationJoinSourceKey(Relation relation) {
    	 Relation opposite= relation.getOpposite();
    	 if (opposite==null) {
    		 if (relation.isMany()) return "id";
    		 return relation.getKey();
    	 }
//    	 Object targetEntity= getFeature(relation, "entity");
//    	 Entity sourceEntity=(Entity) relation.eContainer();
    	 
    	 Boolean manySelf=relation.isMany();
    	 Boolean manyOpp=opposite.isMany();
    	 
    	 if (manySelf) {
    		 if (manyOpp) return "id";
    		 return "id";
    	 }
    	 if (manyOpp) return relation.getKey();
		 return relation.getKey();
    	 
//    	 if (manySelf&&manyOpp) {
//    		 return "id";
//    	 }
//    	 
//    	 if (manySelf) {
//    		 return opposite.getKey();
//    	 }
//    	 if(!manySelf) {
//    		 return relation.getKey();
//    	 }
////    	 if (manyOpp) {
////    		 return getString(sourceEntity,"key");
////    	 }
//    	 
//    	 return "id";
     }   
     public String getRelationJoinTargetKey(Relation relation) {
    	 Relation opposite=relation.getOpposite();
    	 if (opposite==null) {
    		 if (relation.isMany()) return ((Entity)relation.eContainer()).getKey()+"_"+ relation.getKey();
    		 return "id";
    	 }
//    	 Object targetEntity= getFeature(relation, "entity");
    	 Entity sourceEntity=(Entity) relation.eContainer();
//    	 if (sourceEntity==opposite.eContainer()) {
//    		 
//    	 }
    	 Boolean manySelf=relation.isMany();
    	 Boolean manyOpp=opposite.isMany();
    	 
    	 if (manySelf) {
    		 if (manyOpp) return sourceEntity.getKey();
    		 return opposite.getKey();
    	 }
    	 if (manyOpp) return "id";
		 return "id";
    	 
//    	 if (manySelf) {
//    		 return  //"id";//getString(targetEntity,"key");
//    	 }
//    	 if(!manySelf) {
//    		 return "id";
//    	 }
////    	 if (manyOpp) {
//    		 return opposite.getKey();
////    	 }
    	 
//    	 return getString(targetEntity,"key");
     } 
     public String test(CrudRestPlugin plg) {
//    	 plg.
//    	 CrudRestPlugin plg2=(CrudRestPlugin)plg;
//    	 crudrest.impl.CrudRestPluginImpl
//    	 CrudrestAdapterFactory d=new CrudrestAdapterFactory();
//    	 d.createCrudRestPluginAdapter().;
//    	 crudrest.util.CrudrestSwitch<EObject> s=new CrudrestSwitch<>();
//    	 s.
    	 return plg.getName();
     }
     private List<String> allTables=new ArrayList<String>();
     public List<String> getAllTables() {
    	 return allTables;
     }
     public List<String> getCreateTableList(PluginWebService ws,String prefix,String indent) {
    	 EList<Entity> entities= ws.getEntityModel();
    	 List<String> tabels=new ArrayList<>();
    	 List<StringBuilder> entityTables=new ArrayList<>();
    	 List<StringBuilder> middleTables=new ArrayList<>();
    	 
    	 for (Entity entity : entities) {
    		 List<FieldBase> uniqueFields=new  ArrayList<>();
    		 StringBuilder q=new StringBuilder();
    		 String table=entity.getKey();
    		 tabels.add(table);
    		 q.append("CREATE TABLE {$wpdb->prefix}")
    		 .append(prefix).append("_").append(table).append(" (")
    		 .append("\r\n")
    		 .append(indent).append(indent).append(indent).append(indent).append("`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,");
    		 EList<Field> fields= entity.getFields();
    		 EList<Relation> relations= entity.getRelations();
    		 for (Field field : fields) {
    			 if (field.isUnique()) uniqueFields.add(field);
    			 q.append("\r\n").append(indent).append(indent).append(indent).append(indent).append("`"+field.getKey()+"`").append(" ").append(field.getType().getConfig().getType())
    			 .append(" ").append(field.getType().getConfig().getExpression()).append(",");
    		 }
    		 
    		 //review all relations in all entities
    		 for (Entity ent : entities) {
    			 EList<Relation> rels= ent.getRelations();
    			 for (Relation relation : rels) {
    				 
    				 // if relation in entity is related with current entity
    				 if (relation.getEntity().getKey()==entity.getKey()) {
    					 
    					 Relation op=relation.getOpposite();
    					 
    					 //if relation`s and opposite`s entity is current entity
    					 if(op!=null&&op.getEntity().getKey()==entity.getKey()) {
    						 String key_src=getRelationJoinSourceKey(relation);
    						 if (key_src!="id") q.append("\r\n").append(indent).append(indent).append(indent).append(indent)
        					 .append("`"+key_src+"`").append(" INT(11) UNSIGNED,");
    						 continue;
    					 }
    					 
    					 // if this entity is target of many relation without opposite then create fk
    					 if (op==null&&relation.isMany()) {
        					 q.append("\r\n").append(indent).append(indent).append(indent).append(indent)
        					 .append("`"+ent.getKey()).append("_").append(relation.getKey()+"`").append(" INT(11) UNSIGNED,");
    					 }
    					 
    					 // if this entity is target and relation is one-many then create fk form many relation
    					 if (relation.isMany()&&op!=null&&!op.isMany())  {
    						 q.append("\r\n").append(indent).append(indent).append(indent).append(indent)
    						 .append("`"+getRelationJoinSourceKey(op)+"`").append(" INT(11) UNSIGNED,");
    						 continue;
    					 }
    				 }
    			 }
    		 }
    		 
    		 for (Relation relation : relations) {
    			 
    			 
    			 Relation op=relation.getOpposite();
    			 // if opposite not exist and relation is one to one then create fk
    			 if(op==null) {
    				 if (!relation.isMany()) {
	    				 q.append("\r\n").append(indent).append(indent).append(indent).append(indent)
	    				 .append("`"+relation.getKey()+"`").append(" INT(11) UNSIGNED,");
	    				 if (relation.isUnique()) uniqueFields.add(relation);
    				 }
    			 }
    			 
    			 String join_table=getRelationJoinTabel(relation);
    			 
    				
    			
    			 //if table exist ignore
    			 if (tabels.contains(join_table)) continue;
    			 Boolean exist=false;
    			 for (Entity en : entities) {
    				 if (en.getKey()==join_table) {exist=true;continue;}
    			 }
    			 if (exist) continue; 

    			 tabels.add(join_table);

    			 //create intermediate table for many-many relationship
    			 String key_src=getRelationJoinTargetKey(relation);
    			 String key_tgt=getRelationJoinTargetKey(op);
    			 StringBuilder sb=new StringBuilder();
    			 sb.append("CREATE TABLE {$wpdb->prefix}").append(prefix).append("_").append(join_table)
    			 .append(" (\r\n").append(indent).append(indent).append(indent).append(indent).append("`id` INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,\r\n")
    			 .append(indent).append(indent).append(indent).append(indent).append("`"+key_src+"`").append(" INT(11) UNSIGNED,\r\n")
    			 .append(indent).append(indent).append(indent).append(indent).append("`"+key_tgt+"`").append(" INT(11) UNSIGNED);");
    			 middleTables.add(sb);
    			 
    		 }
    		 if (uniqueFields.size()>0) {
    			 StringBuilder u=new StringBuilder().append("UNIQUE KEY(");
	    		 for(FieldBase f:uniqueFields) {
	    			 if (f instanceof Relation) {
	    				 u.append("`"+f.getKey()+"`").append(",");
	    				 continue;
	    			 }
	    			 Field field=(Field) f;
	    			 String e=field.getType().getConfig().getExpression();
	    			 if (e!=null&& !e.contains("(")) u.append("`"+f.getKey()+"`").append("(20),");
	    			 else u.append("`"+f.getKey()+"`").append(",");
	    		 }	
	    		 u.deleteCharAt( u.length()-1).append(") ");
	    		 q.append("\r\n").append(indent).append(indent).append(indent).append(indent).append(u);
    		 }

    		 q.deleteCharAt(q.length()-1).append(")");
    		 entityTables.add(q);
    	 }
    	 
    	 List<String> result=new ArrayList<String>();
//    	 StringBuilder sb=new StringBuilder();
    	 for(StringBuilder q :entityTables) result.add(q.toString()); //sb.append(q).append("\r\n").append(indent).append(indent).append(indent);
    	 
    	 for(StringBuilder q :middleTables) result.add(q.toString());//sb.append("\r\n").append(indent).append(indent).append(indent).append(q);
    	 allTables=tabels;
    	
    	 return result; //sb.toString();
     } 
//    public int[] getOneToTowelveArray(EObject eobject) {
//
//    	int [] myIntArray = IntStream.range(1, 12).toArray();
//    	return myIntArray;
//   	}

}
