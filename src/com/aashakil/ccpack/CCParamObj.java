package com.aashakil.ccpack;

import java.util.List;
import java.util.ArrayList;

public class CCParamObj{
	
	private List<Object> mParams = new ArrayList<Object>(0);
	
	public CCParamObj(Object... params){
		for(Object param : params)
			mParams.add(param);
	}
	
	public Object getObject(int index){
		return this.mParams.get(index);
	}
	
	public Object getObjectNullable(int index){
		if(mParams.size()>index)
			return mParams.get(index);
		else return null;
	}
	
	public String getString(int index){
		return (String)this.getObject(index);
	}
	
}
