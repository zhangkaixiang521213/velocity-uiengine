package com.csi.ro.bizfoundation.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableFieldService {
	private static Map<String,String> map=new HashMap<String,String>();
	private static Map<String,String> maptype=new HashMap<String,String>();
	private static Map<String,String> mapjson=new HashMap<String,String>();
	
	public TableFieldService(){
		map.put("datetime", "import java.util.Date;import com.fasterxml.jackson.annotation.JsonFormat;");
		map.put("date", "import java.util.Date;");
		
		maptype.put("varbinary", "String");
		maptype.put("datetime", "Date");
		maptype.put("date", "Date");
		maptype.put("float", "float");
		maptype.put("tinyint", "int");
		maptype.put("int", "int");
		
		mapjson.put("datetime", "@JsonFormat(pattern = \"yyyy-MM-dd HH:mm:ss\", timezone = \"GMT+08:00\")");
		mapjson.put("date", "@JsonFormat(pattern = \"yyyy-MM-dd\", timezone = \"GMT+08:00\")");
	}
	
	
	public String tableField(String field){
		StringBuilder sb=new StringBuilder();
		
		if(field!=null && !"".equals(field)){
			List<String> list = Arrays.asList(field.split("_"));
			for(int i=0;i<list.size();i++){
				if(i==0){
					sb.append(list.get(i).toLowerCase());
				}else if(i<list.size()){
					String s=list.get(i);
					String ups=s.substring(0, 1).toUpperCase()+s.substring(1, s.length()).toLowerCase();
					sb.append(ups);
				}
			}
		}
		return sb.toString();
	}
	
	public String tableName(String tname){
		StringBuilder sb=new StringBuilder();
		
		if(tname!=null && !"".equals(tname)){
			List<String> list = Arrays.asList(tname.split("_"));
			for(int i=0;i<list.size();i++){
				String s=list.get(i);
				String ups=s.substring(0, 1).toUpperCase()+s.substring(1, s.length()).toLowerCase();
				sb.append(ups);
			}
		}
		return sb.toString();
	}
	
	public String importByFieldType(String fieldType){
		if(map.containsKey(fieldType.toLowerCase())){
			return map.get(fieldType.toLowerCase());
		}
		return "";
	}
	
	public String fieldTypeToJavaType(String fieldType){
		if(fieldType!=null && !"".equals(fieldType)){
			int findex=fieldType.indexOf("(");
			String me=fieldType.substring(0, findex>0?findex:fieldType.length()).toLowerCase();
			if(maptype.containsKey(me)){
				return maptype.get(me);
			}
		}
		return "";
	}
	
	public String fieldJsonType(String fieldType){
		if(fieldType!=null && !"".equals(fieldType)){
			int findex=fieldType.indexOf("(");
			String me=fieldType.substring(0, findex>0?findex:fieldType.length()).toLowerCase();
			if(mapjson.containsKey(me)){
				return mapjson.get(me);
			}
		}
		return "";
	}
	
	
	public static void main(String[] args) {
		TableFieldService tfs=new TableFieldService();
		System.out.println(tfs.tableField("id"));
		System.out.println(tfs.tableName("coupon"));
		
		String me="varbinary(500)";
		System.out.println(me.substring(0, me.indexOf("(")));
	}

}
