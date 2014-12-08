package com.csi.ro.bizfoundation.uiengine;

public class CreateDaoBean {

	 public static void main(String[] args) {
		 
		 String xmlPath="D:\\workSpace\\movie-service\\movie-couponcard\\src\\main\\java\\com\\ariadnethread\\couponcard\\membership\\dao\\mybatis";
		 String beanPath="D:\\workSpace\\movie-service\\movie-couponcard\\src\\main\\java\\com\\ariadnethread\\couponcard\\membership\\domain";
//		 String xmlPath="D:\\workSpace\\movie-service\\movie-devicemanage\\src\\main\\java\\com\\ariadnethread\\nocmanage\\dao\\mybatis";
//		 String beanPath="D:\\workSpace\\movie-service\\movie-devicemanage\\src\\main\\java\\com\\ariadnethread\\nocmanage\\domain";
//		 String xmlPath="D:\\workSpace\\movie-service\\movie-redactivity\\src\\main\\java\\com\\ariadnethread\\redactivity\\ruleuser\\dao\\mybatis";
//		 String beanPath="D:\\workSpace\\movie-service\\movie-redactivity\\src\\main\\java\\com\\ariadnethread\\redactivity\\ruleuser\\domain";
		 
//		 String tableObj="recharge_record_01";
		 String tableObj="MembershipRecord";
		 
//		 createBean(beanPath,tableObj);   
		 createDaoXML(xmlPath,tableObj);
//		 createDao(xmlPath,tableObj);
		 
	 }
	 
	 /**
	  *生成xml文件
	  */
    public static void createDaoXML(String destPath,String tableObj){
    	UIEngine en=new UIEngine();
       en.uiEngine("D:\\workSpace\\velocity-uiengine\\pdm\\movie-1.3v.pdm",destPath,
    		   "daoenginetemplate/engine.vm",tableObj+"Mapper.xml");
    }
    
    /**
     *生成bean
     */
    public static void createBean(String destPath,String tableObj){
    	UIEngine en=new UIEngine();
       en.uiEngine("D:\\workSpace\\velocity-uiengine\\pdm\\movie-1.3v.pdm",destPath,
    		   "daoenginetemplate/engine_bean.vm",tableObj+".java");
    }
    
    /**
     *生成dao
     */
    public static void createDao(String destPath,String tableObj){
    	UIEngine en=new UIEngine();
    	en.uiEngine("D:\\workSpace\\velocity-uiengine\\pdm\\movie-1.3v.pdm",destPath,
    			"daoenginetemplate/engine_dao.vm",tableObj+"Mapper.java");
    }
	
	
}
