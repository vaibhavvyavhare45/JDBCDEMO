package com.generics;

class Gen<T> {
	   
    T ob;
    Gen(T ob){
        this.ob=ob;

    } 
    public void show(){
        System.out.println("this type of ob: "+ob.getClass().getName());

    }   
    public T getOb(){
        return ob;

    }
    
}
class GenDemo1 {
public static void main(String[] args) {
    Gen<String> g1=new Gen("vaibhav");
    g1.show();
    System.out.println(g1.getOb());

    Gen<Integer> g2=new Gen(10);
    g2.show();
    System.out.println(g2.getOb());

    Gen<Double> g3=new Gen(10.5);
    g3.show();
    System.out.println(g3.getOb());
}
}






