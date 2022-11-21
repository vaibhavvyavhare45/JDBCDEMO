package com.generics;

import java.util.ArrayList;

public class GenDemo7 {
	private int j;
	public void m1(ArrayList<String> l) {
		System.out.println("String");
	}
	public int m1(int j) {
		//int a=10;
		this.j=j;
		return j;
		
	}
	public static void main(String[] args) {
		GenDemo7 g=new GenDemo7();
		int res=g.m1(10);
		System.out.println(res);
	}

}
