package com.csi.ro.bizfoundation.uiengine;

public class CreateDaoBean {

	 public static void main(String[] args) {
		 String xmlPath="D:\\workSpace\\movie-service\\movie-redactivity\\src\\main\\java\\com\\ariadnethread\\redactivity\\rulemanager\\dao\\mybatis";
		 String beanPath="D:\\workSpace\\movie-service\\movie-redactivity\\src\\main\\java\\com\\ariadnethread\\redactivity\\rulemanager\\domain";
		 String tableObj="RedPay";
//		 createBean(beanPath,tableObj);   
//		 createDaoXML(xmlPath,tableObj);
		 createDao(xmlPath,tableObj);
	 }
	 
	 /**
	  *����xml�ļ�
	  */
    public static void createDaoXML(String destPath,String tableObj){
    	UIEngine en=new UIEngine();
       en.uiEngine("D:\\workSpace\\velocity-uiengine\\pdm\\movie.pdm",destPath,
    		   "daoenginetemplate/engine.vm",tableObj+"Mapper.xml");
    }
    
    /**
     *����bean
     */
    public static void createBean(String destPath,String tableObj){
    	UIEngine en=new UIEngine();
       en.uiEngine("D:\\workSpace\\velocity-uiengine\\pdm\\movie.pdm",destPath,
    		   "daoenginetemplate/engine_bean.vm",tableObj+".java");
    }
    
    /**
     *����dao
     */
    public static void createDao(String destPath,String tableObj){
    	UIEngine en=new UIEngine();
    	en.uiEngine("D:\\workSpace\\velocity-uiengine\\pdm\\movie.pdm",destPath,
    			"daoenginetemplate/engine_dao.vm",tableObj+"Mapper.java");
    }
	
	
}
