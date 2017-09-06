package com.jmap.chapter_4;

import com.jmap.data.Employee;
import com.jmap.data.Manager;

public class Chapter_4 {
	public static void main(String[] args) {
		Employee employee = new Employee("jmap",3500,2014,2,28);
		Employee manager =  new Manager("jmap",3500,1000,2014,2,28);
		
		Class employee_class = employee.getClass();
		Class manager_class = manager.getClass();
		
		
	}
}
