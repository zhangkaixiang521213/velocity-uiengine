package com.csi.ro.bizfoundation.uiengine;

public class Test {

	 public static void main(String[] args) {
		 /*
		 	if(args.length<1){
		 		System.out.println("�������ļ������ļ�Ŀ¼...");
		 		System.exit(0);
		 	}
	       */ 
	        long a = System.currentTimeMillis();
	        UIEngine en=new UIEngine();
//	       en.uiEngine("D:\\workSpace\\velocity-uiengine\\pdm\\coupon.pdm","D:\\workSpace\\velocity-uiengine\\src\\daoenginetemplate",
//	    		   "daoenginetemplate/engine_bean.vm","java");
	       en.uiEngine("D:\\workSpace\\velocity-uiengine\\pdm\\coupon.pdm","D:\\workSpace\\velocity-uiengine\\src\\daoenginetemplate",
	    		   "daoenginetemplate/engine.vm","xml");
	        //en.uiEngine("G:\\velocity\\vmfile\\aa.ux","G:\\icssWorkSpace\\com.csi.ro.bizfoundation.uiengine\\src\\uienginetemplate");
//	        en.uiEngine("G:\\velocity\\vmfile\\Test-engine.ux");
	        //en.uiEngine(args[0]);
	        System.out.println(System.currentTimeMillis() - a);
	    }
	
	
}
