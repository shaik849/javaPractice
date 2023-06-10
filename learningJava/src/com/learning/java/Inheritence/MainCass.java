package com.learning.java.Inheritence;

class Bike {
	int speed;
	String name;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int speed, String name) {
		super();
		this.speed = speed;
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Strat extends Bike {
	int gear;

	public Strat(int gear, String name, int speed) {
		super(speed, name);
		this.gear = gear;
	}

	@Override
	public String toString() {
		return "[speed=" + speed + ", name=" + name + ", gear ="+ gear + "]";
	}
	
	
}

public class MainCass {

	public static void main(String[] args) {
		Bike str = new Bike();
		System.out.println(str);

	}

}
