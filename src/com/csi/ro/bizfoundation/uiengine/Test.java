package com.csi.ro.bizfoundation.uiengine;

public class Test {

	 public static void main(String[] args) {
		 
		 	if(args.length<1){
		 		System.out.println("请输入文件名或文件目录...");
		 		System.exit(0);
		 	}
	        
	        long a = System.currentTimeMillis();
	        UIEngine en=new UIEngine();
	       en.uiEngine("G:\\velocity\\vmfile\\Test-engine.ux","G:\\icssWorkSpace\\com.csi.ro.bizfoundation.uiengine\\src\\uienginetemplate");
	        //en.uiEngine("G:\\velocity\\vmfile\\aa.ux","G:\\icssWorkSpace\\com.csi.ro.bizfoundation.uiengine\\src\\uienginetemplate");
//	        en.uiEngine("G:\\velocity\\vmfile\\Test-engine.ux");
	        //en.uiEngine(args[0]);
	        System.out.println(System.currentTimeMillis() - a);
	    }
	
	
}
