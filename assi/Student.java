package com.assi;

public class Student {
	private int roll;
	private String name;
	private int age;
	private int marks;
	
	
	public Student() {
		
	}
	
	public Student(int roll,String name,int age,int marks) {
		this.age = age;
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	public int getRoll() {
		return roll;
	}
	
	
	public void setMarks(int marks) {
		if(marks>0 && marks<500)
		{
			this.marks = marks;			
		}
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	
	public void setAge(int age) {
		if(age>18 && age<60)
		{
			this.age = age;
		}
		
		
	}
	

	
	public int getAge() {
		return age;
	}
	
	public void Display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Marks: " + marks);
		System.out.println("Roll: " + roll);
	}
}
