package com.csi.ro.bizfoundation.uiengine;

import com.csi.ro.bizfoundation.service.TableFieldService;

public class CreateDaoBean {
	
	public static String currentTableName(){
		return "coupon_history_correspond";
	}
	public static String packagePath(){
		return "com.ariadnethread.couponcard.coupon";
	}

	 public static void main(String[] args) {
		 
//		 String xmlPath="D:\\workSpace\\movie-service\\movie-activity\\src\\main\\java\\com\\ariadnethread\\activity\\actfix\\dao\\mybatis";
//		 String beanPath="D:\\workSpace\\movie-service\\movie-activity\\src\\main\\java\\com\\ariadnethread\\activity\\actfix\\domain";
		 String xmlPath="D:\\workSpace\\movie-service\\movie-couponcard\\src\\main\\java\\com\\ariadnethread\\couponcard\\coupon\\dao\\mybatis";
		 String beanPath="D:\\workSpace\\movie-service\\movie-couponcard\\src\\main\\java\\com\\ariadnethread\\couponcard\\coupon\\domain";
//		 String xmlPath="D:\\workSpace\\movie-service\\movie-couponcard\\src\\main\\java\\com\\ariadnethread\\couponcard\\exchange\\dao\\mybatis";
//		 String beanPath="D:\\workSpace\\movie-service\\movie-couponcard\\src\\main\\java\\com\\ariadnethread\\couponcard\\exchange\\domain";
//		 String xmlPath="D:\\workSpace\\movie-service\\movie-couponcard\\src\\main\\java\\com\\ariadnethread\\couponcard\\membership\\dao\\mybatis";
//		 String beanPath="D:\\workSpace\\movie-service\\movie-couponcard\\src\\main\\java\\com\\ariadnethread\\couponcard\\membership\\domain";
//		 String xmlPath="D:\\workSpace\\movie-service\\movie-devicemanage\\src\\main\\java\\com\\ariadnethread\\nocmanage\\dao\\mybatis";
//		 String beanPath="D:\\workSpace\\movie-service\\movie-devicemanage\\src\\main\\java\\com\\ariadnethread\\nocmanage\\domain";
//		 String xmlPath="D:\\workSpace\\movie-service\\movie-redactivity\\src\\main\\java\\com\\ariadnethread\\redactivity\\ruleuser\\dao\\mybatis";
//		 String beanPath="D:\\workSpace\\movie-service\\movie-redactivity\\src\\main\\java\\com\\ariadnethread\\redactivity\\ruleuser\\domain";
		 
//		 String tableObj="recharge_record_01";
		 String tableObj=new TableFieldService().tableName(currentTableName());
		 
//		 createBean(beanPath,tableObj);   
//		 createDao(xmlPath,tableObj);
		 createDaoXML(xmlPath,tableObj);
		 
	 }
	 
	 /**
	  *生成xml文件
	  */
    public static void createDaoXML(String destPath,String tableObj){
    	UIEngine en=new UIEngine();
       en.uiEngine("D:\\workSpace\\velocity-uiengine\\pdm\\movie-1.6v.pdm",destPath,
    		   "daoenginetemplate/engine.vm",tableObj+"Mapper.xml");
    }
    
    /**
     *生成bean
     */
    public static void createBean(String destPath,String tableObj){
    	UIEngine en=new UIEngine();
       en.uiEngine("D:\\workSpace\\velocity-uiengine\\pdm\\movie-1.6v.pdm",destPath,
    		   "daoenginetemplate/engine_bean.vm",tableObj+".java");
    }
    
    /**
     *生成dao
     */
    public static void createDao(String destPath,String tableObj){
    	UIEngine en=new UIEngine();
    	en.uiEngine("D:\\workSpace\\velocity-uiengine\\pdm\\movie-1.6v.pdm",destPath,
    			"daoenginetemplate/engine_dao.vm",tableObj+"Mapper.java");
    }
	
	
}
