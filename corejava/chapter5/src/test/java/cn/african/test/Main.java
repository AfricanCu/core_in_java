package cn.african.test;

import java.lang.reflect.Field;

import abstractClasses.Employee;

public class Main {

	public static void main(String[] args) throws Exception {
		Employee harry = new Employee("Harry Hacker", 35000, 1989, 10, 1);
		Class<? extends Employee> clazz = harry.getClass();
		Field f1 = clazz.getDeclaredField("salary");
		f1.setAccessible(true);
		Object v = f1.get(harry);
		f1.set(harry, 2500);
		v = f1.get(harry);
		System.out.println(v);

	}
	
	

}
