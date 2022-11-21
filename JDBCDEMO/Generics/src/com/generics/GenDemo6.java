package com.generics;

import java.util.ArrayList;

public class GenDemo6 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<String>();
		al.add(10);
		al.add(10.5);
		al.add(true);
		System.out.println(al);
	}

}
