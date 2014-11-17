package com.csi.ro.bizfoundation.uiengine;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.jdom.Document;
import org.jdom.input.SAXBuilder;

import com.csi.ro.bizfoundation.service.FieldBean;
import com.csi.ro.bizfoundation.service.TableFieldService;

public class UIEngine {

	/**
	 * xml uiת������
	 * @param fileOrFolder �ļ����ļ���
	 */
	public void uiEngine(String fileOrFolder,String destFolder,String templePath,String fileName){
		File file = new File(fileOrFolder);
		File destFile = new File(destFolder);
		File[] files = file.listFiles(); 
		analysisEngine(file,destFile,templePath,fileName);
		
		/*
		if(file.isFile() && isXMLFile(file)){
			analysisEngine(file,destFile);
		}else if(files==null){
			return; 
		}else{
			for (int i = 0; i < files.length; i++) { 
	            if (files[i].isDirectory()) { 
	            	uiEngine(files[i].getAbsolutePath(),destFolder); 
	            } else if(files[i].isFile() && isXMLFile(files[i])){ 
	                analysisEngine(files[i],destFile);
	            } 
	        } 
		}
		*/
		
	}
	
	/**
	 * �ж��Ƿ���uiת���ļ�
	 * @param file
	 * @return
	 */
	private boolean isXMLFile(File file){
		String fileSurfix=file.getName().substring(file.getName().lastIndexOf(".") + 1, file.getName().length());
		//System.out.println("fileSurfix:"+fileSurfix);
		//System.out.println("Contents.STUDIO_UI_FILESURFIX:"+Contents.STUDIO_UI_FILESURFIX);
		if(Contents.STUDIO_UI_FILESURFIX.equalsIgnoreCase(fileSurfix)){
			return true;
		}
		return false;
	}
	
	/**
	 * velocityת������
	 * @param file
	 */
	private void analysisEngine(File file,File destFile,String templePath,String fileName){
		FileOutputStream fos = null; 
    	BufferedWriter  writer = null;

        try
        {
            /*
             *   call init
             */
        	//System.out.println("ok1");
        	//System.out.println(this.getClass().getClassLoader().getResource(".").getPath());
        	//System.out.println(UIEngine.class.getClassLoader().getResource(".").getPath());
        	//System.out.println(UIEngine.class.getResource(".").getPath());
     //Properties p = new Properties();
            //p.setProperty("resource.loader", "jar");
   //p.setProperty("file.resource.loader.path", "vm/");
           // p.setProperty("file.resource.loader.path", UIEngine.class.getResource(".").getPath());
            //p.setProperty("jar.resource.loader.class", "org.apache.velocity.runtime.resource.loader.JarResourceLoader");
            //p.setProperty("file.resource.loader.path", "jar:file:/templatefile.jar!/com/chinasofti/studio/engine/templatefile/");
            
            
            Properties p = new Properties();
            p.put("velocimacro.max.depth","40");
            p.put("file.resource.loader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
            
            p.setProperty(Velocity.ENCODING_DEFAULT, "UTF-8");
            p.setProperty(Velocity.INPUT_ENCODING, "UTF-8");
            p.setProperty(Velocity.OUTPUT_ENCODING, "UTF-8");   
            //p.setProperty(VelocityEngine.FILE_RESOURCE_LOADER_PATH, "d://");
            Velocity.init(p);
            //System.out.println("resource.loader:"+Velocity.getProperty("resource.loader"));
            //System.out.println("jar.resource.loader.class:"+Velocity.getProperty("jar.resource.loader.class"));
            //System.out.println("file.resource.loader.path:"+Velocity.getProperty("file.resource.loader.path"));
            /*
            //����velocity��Դ���ط�ʽΪjar
            p.setProperty("resource.loader", "jar");
            //����velocity��Դ���ط�ʽΪfileʱ�Ĵ�����
            p.setProperty("jar.resource.loader.class", "org.apache.velocity.runtime.resource.loader.JarResourceLoader");
            //����jar�����ڵ�λ��
            //p.setProperty("file.resource.loader.path", "jar:file:WebContent/WEB-INF/lib/studioEngine.jar");
//            p.setProperty("file.resource.loader.path", "jar:file:/WebContent/WEB-INF/lib/templatefile.jar");
            p.setProperty("file.resource.loader.path", "jar:file:/G:/icssWorkSpace/velocity/WebContent/WEB-INF/lib/templatefile.jar!/com/chinasofti/studio/engine/templatefile/");
            //Velocity.init(p);
            Velocity.setProperty("resource.loader", "jar");
            Velocity.setProperty("jar.resource.loader.class", "org.apache.velocity.runtime.resource.loader.JarResourceLoader");
            Velocity.setProperty("file.resource.loader.path", "jar:file:G:/icssWorkSpace/velocity/WebContent/WEB-INF/lib/templatefile.jar!/com/chinasofti/studio/engine/templatefile/");
            Velocity.init();
            */
           //VelocityEngine velocityEngine=new VelocityEngine(p);
          //Velocity.init();
            System.out.println(file.getAbsolutePath());
            //System.out.println(UIEngine.class.getResourceAsStream("."));


            /*
             * build a Document from our xml
             */

            SAXBuilder builder;
            Document root = null;
            

            try
            {
                builder = new SAXBuilder();
                root = builder.build(file.getAbsolutePath());
            }
            catch( Exception ee)
            {
                System.out.println("Exception building Document : " + ee);
                return;
            }

            /*
             * now, make a Context object and populate it.
             */

            VelocityContext context = new VelocityContext();
            context.put("root", root);
            context.put("tableService", new TableFieldService());
//            context.put("list", new ArrayList<FieldBean>());

            /*
             *  make a writer, and merge the template 'against' the context
             */

            //Template template = Velocity.getTemplate(Contents.TEMPLATE_FILE_NAME);
            //Template template = Velocity.getTemplate("com/chinasofti/studio/engine/templatefile/engine.vm");
            //Template template = Velocity.getTemplate("com/chinasofti/studio/engine/templatefile/engine.vm");
            
            //Template template = velocityEngine.getTemplate("com/chinasofti/studio/engine/templatefile/engine.vm");
//            Template template = Velocity.getTemplate("daoenginetemplate/engine.vm");
//            Template template = Velocity.getTemplate("daoenginetemplate/engine_bean.vm");
            
            System.out.println(templePath);
            Template template = Velocity.getTemplate(templePath);
            
//            String fileName=file.getName().subSequence(0, file.getName().lastIndexOf("."))+"."+Contents.DESTINATION_FILESURFIX_JAVA;
//            String fileName=file.getName().subSequence(0, file.getName().lastIndexOf("."))+"."+surfix;
            System.out.println(destFile.getPath()+File.separator+fileName);
            File outFile = new File(destFile.getPath()+File.separator+fileName); 
//            System.out.println(destFile.getParent()+File.separator+fileName);
//            File outFile = new File(destFile.getParent()+File.separator+fileName); 
            //File outFile = new File(file.getParent()+File.separator+fileName); 
            
            fos = new FileOutputStream(outFile);  
            writer = new BufferedWriter(new OutputStreamWriter(fos, Contents.OUT_FILE_CODETYPE));// ����д����ļ�����,����������� 
            //writer = new BufferedWriter(new OutputStreamWriter(System.out));
            template.merge( context , writer);
            
            System.out.println("�����ɹ�...");
        }
        catch( Exception e )
        {
           System.out.println("Exception : " + e);
        }
        finally
        {
            if ( writer != null)
            {
                try
                {
                    writer.flush();
                    writer.close();
                }
                catch( Exception ee )
                {
                    System.out.println("Exception : " + ee );
                }
            }
            if (fos != null) {  
                try {  
                    fos.close();  
                } catch (IOException e) {  
                    //��ӡ��־  
                }  
            }  
        }
	}
}
