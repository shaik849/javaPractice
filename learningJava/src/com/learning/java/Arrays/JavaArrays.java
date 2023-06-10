package com.learning.java.Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Employee {
	int id;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	String name;
	long salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
}

public class JavaArrays {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "shaik", 10000);
		Employee emp2 = new Employee(1, "shai", 1000);
		Employee emp3 = new Employee(1, "shak", 100);
		Employee emp4 = new Employee(1, "shik", 0000);
	 
		Employee[] data = new Employee[4];
		        data[0] = emp1;
				data[1] = emp2;
				data[2] = emp3;
				data[3] = emp4;
				
     for(Employee i : data) {
    	 System.out.println(i);
     }
     int[] arrays = new int[10];
     Arrays.fill(arrays, 10);
     
     for(int j : arrays) {
    	 System.out.println(j);
     }
     
	}

}
