package com.generics;

public class GenDemo2<T> {
	public static void main(String[] args) {
		GenDemo2<Integer> i=new GenDemo2<Integer>();
		System.out.println(i);
		GenDemo2<String> s=new GenDemo2<>();
		System.out.println(s.getClass().getName());
		//GenDemo2<Object> o=new GenDemo2<String>();//not allowed  this thing  not convert  from String  to object
		GenDemo2<Object> o=new GenDemo2<Object>();
		//String s1=(String)o; //can't be casted to this String
		System.out.println(o.hashCode());
		
		
		
	}

}
