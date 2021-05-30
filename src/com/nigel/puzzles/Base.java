package com.nigel.puzzles;

class Base {
	public void display() {
		System.out.println("Base display()");
	}
}

class Derived extends Base {

	// Annotations are not pure comments as they can change the way a program is
	// treated by compiler.
	// Uncomment the below annotation.
	// @Override
	public void display(int x) {
		System.out.println("Derived display(int )");
	}

	public static void main(String args[]) {
		Derived obj = new Derived();
		obj.display();
	}
}