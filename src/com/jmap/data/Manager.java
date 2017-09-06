package com.jmap.data;

public class Manager extends Employee {
	private float bonus;
	
	public Manager(String name,float salary,float bonus,int year,int month,int day){
		super(name, salary, year, month, day);
		this.bonus = bonus;
	}
}
