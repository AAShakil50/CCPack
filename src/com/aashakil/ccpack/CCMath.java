package com.aashakil.ccpack;

public final class CCMath{
	
	public static String roundInt(int integer, int total){
		String str = "";
		String mStr = integer+"";
		if((integer+"").length()<total){
			for(int i=0; i<total-(integer+"").length(); i++){
				str+="0";
			}
		}
		return str+mStr;
	}
	
	public static int subInt(int integer, int start){
		return Integer.parseInt(Integer.toString(integer).substring(start));
	}
	
	public static int subInt(int integer, int start, int end){
		String str = Integer.toString(integer);
		str = str.substring(start, end);
		return Integer.parseInt(str);
	}
	
}
