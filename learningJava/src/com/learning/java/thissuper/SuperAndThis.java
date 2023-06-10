package com.learning.java.thissuper;

class Fun extends Object{

	public Fun() {
		super();
	System.out.println("hey from fun");
	}
	public Fun(int a, int b) {
		super();
		System.out.println(a+ " fun "+b);
	}
	
}
class Happy extends Fun {
	public Happy() {
		super();
		System.out.println("hey from happy");
	}
	public Happy(int a, int b) {
		this();
		System.out.println(a+ " happy "+b);
	}
}

public class SuperAndThis {

	public static void main(String[] args) {
		Happy obj = new Happy(3,4);
		
	}

}
