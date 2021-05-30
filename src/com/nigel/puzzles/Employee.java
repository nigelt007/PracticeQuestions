package com.nigel.puzzles;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Employee {

	public Employee(String name, int age, Date dob) {
		this.name = name;
		this.age = age;
		this.dob = dob;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hash = 17;
		if (name != null) {
			hash = 31 * hash + name.hashCode();
		}
		hash = 31 * hash + Integer.hashCode(age);
		if (dob != null) {
			hash = 31 * hash + dob.hashCode();
		}
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		boolean nameEquals = (this.name == null && ((Employee) obj).name == null)
				|| (this.name != null && (this.name.equals(((Employee) obj).name)));

		boolean dobEquals = (this.dob == null && ((Employee) obj).dob == null)
				|| (this.dob != null && (this.dob.equals(((Employee) obj).dob)));

		return (((Employee) obj).age == this.age) && nameEquals && dobEquals;

	}

	String name;
	int age;
	Date dob;

	public static void main(String[] args) {
		Set<Employee> emps = new HashSet<>();
		Employee emp1 = new Employee("ABC", 0, null);
		Employee emp2 = new Employee("ABC", 0, null);
		Employee emp3 = new Employee("ABC", 0, null);
		Employee emp4 = new Employee("ABCD", 1, null);
		Employee emp5 = new Employee("ABCD", 1, null);

		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		emps.add(emp5);

		System.out.println(emps.size());
	}

}
