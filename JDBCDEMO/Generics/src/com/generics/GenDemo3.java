package com.generics;

public class GenDemo3<T extends String> {
	public static void main(String[] args) {

		// GenDemo3<String> s=new GenDemo3<Integer>();//bound mismatch can not convert
		// from intger to string
		GenDemo3<String> s=new GenDemo3<String>();
		System.out.println("vaibhav \t" +s);

	}
}
