package com.generics;

public class GenDemo4<T extends Runnable> {
	public static void main(String[] args) {
		GenDemo4<Runnable> r2=new GenDemo4<Runnable>();
		System.out.println(r2);
		
			
		GenDemo4<Thread> r = new GenDemo4<Thread>();
		System.out.println(r.toString().getClass());
		// GenDemo4<Integer> i=new GenDemo4<Integer>();//Bound is mismatch the type
		// integer is not valid by subtitude by integer
		
	}

}
