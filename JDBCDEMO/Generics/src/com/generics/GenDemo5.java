package com.generics;

import java.util.ArrayList;

public class GenDemo5 {
	public static void main(String[] args) {
		ArrayList<?> al=new ArrayList<String>();
		//ArrayList<? extends Number> al1=new ArrayList<String>();
		ArrayList<? extends Number> al2=new ArrayList<Integer>();
		//ArrayList<?> al3=new ArrayList<?>();
		//ArrayList<?> al4=new ArrayList<? extends Number>();
		ArrayList<String> al5=new ArrayList<String>();
		ArrayList<?> al6=new ArrayList<Integer>();
		
	}

}
