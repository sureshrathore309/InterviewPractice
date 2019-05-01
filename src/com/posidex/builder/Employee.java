package com.posidex.builder;

public class Employee {
	private final String firstName;
	private final String lastName;
	private final int age;
	private final int personalId;
	private final String phone;
	private final String address;
	private final String mail;
	
	public static class EmployeeBuilder{
		private final String firstName;
		private final String lastName;
		private final int age;
		private final int personalId;
		private String phone;
		private String address;
		private String mail;
		public EmployeeBuilder(String firstName, String lastName, int age, int personId) {
			this.firstName=firstName;
			this.lastName=lastName;
			this.age=age;
			this.personalId=personId;
		}
		public EmployeeBuilder setAddress(String address) {
			this.address=address;
			return this;
		}
		public EmployeeBuilder setPhone(String phone) {
			this.phone=phone;
			return this;
		}
		public EmployeeBuilder setMail(String mail) {
			this.mail=mail;
			return this;
		}
		public Employee build() {
			return new Employee(this);
		}
	}
	
	private Employee(EmployeeBuilder builder) {
		this.firstName=builder.firstName;
		this.lastName=builder.lastName;
		this.age=builder.age;
		this.personalId=builder.personalId;
		this.phone=builder.phone;
		this.address=builder.address;
		this.mail=builder.mail;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public int getPersonalId() {
		return personalId;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public String getMail() {
		return mail;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", personalId="
				+ personalId + ", phone=" + phone + ", address=" + address + ", mail=" + mail + "]";
	}
	
}
