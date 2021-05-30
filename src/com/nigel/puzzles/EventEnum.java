package com.nigel.puzzles;

public enum EventEnum {

	E1(1, "e1"), E2(2, "E2"), E3(3, "E3"), E4(4, "E4");

	int eventValue;

	String eventName;

	EventEnum next = this.next();

	EventEnum(int value, String name) {
		this.eventValue = value;
		this.eventName = name;
	}

	public EventEnum next() {
		if (this.next() == null) {

		}
		return this.next();
	}

}
