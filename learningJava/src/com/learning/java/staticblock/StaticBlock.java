package com.learning.java.staticblock;

class Mobile{
	String brand;
	int price;
	String network;
	static String name;
	
	static {
		name="Phone";
		System.out.println("in static block");
	}
	
	public Mobile() {
		brand="";
		price=200;
//		name="Phone";
		System.out.println("in constructor");
	}
	
	public static void show(Mobile obj) {
		System.out.println(obj.brand+" : "+obj.price+" : "+obj.name);
	}
	
	
}
public class StaticBlock { 
	public static void main(String[] args) throws ClassNotFoundException
	{
		Mobile obj1=new Mobile();
		obj1.brand="Apple";
		obj1.price=1500;
		Mobile.show(obj1);
		
//		  Class.forName("com.learning.java.staticblock.Mobile"); 
		
		
//		
//		
//		Mobile obj2=new Mobile();
//		  obj2.brand="samsung";
//			obj2.price=500;
//			Mobile.name="SmartPhone";
		  //abovr line will change all the names as smart phone

	
	}
}

//construtor block calls when we create no of objects
//static block only creates one time when the classloads (i.e. first object creates)
//JVM has a class loader that load only one time then creates objects. 
//beacuse of class load static block creates first then constrouctor goes next
//if we doesnt create an object both construcror and static blocks not created
//because class doent load

//we can load classloader without creating object