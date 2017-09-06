package com.jmap.data;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author zhouqing
 *
 */
public class Employee {
	String name;
	private float salary;
	private Date hireDay;
	
	public Employee(String name,float salary,int year,int month,int day) {
		this.name = name;
		this.salary = salary;
		GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
		this.hireDay = calendar.getTime();
	}
	
	/**
	 * @param
	 * @return
	 * @see
	 * 
	 */
	public String getName() {
		return name;
	}

	public float getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void raiseSalary(float percent) {
		salary *= (1 + percent/100.0F);
	}
}
