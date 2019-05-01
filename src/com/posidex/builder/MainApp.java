package com.posidex.builder;

public class MainApp {
	public static void main(String args[]) {
		Employee employee = new Employee.EmployeeBuilder("Suresh", "Rathore", 10, 101).setPhone("9009167067")
				.setAddress("Hyderabad").build();
		System.out.println(employee);
	}
}