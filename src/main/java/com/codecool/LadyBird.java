package com.codecool;

public class LadyBird implements Flying, Feeding, Speaking {
	String name;
	boolean isFemale;

	@Override
	public void fly() {
		speak("Buzz, Buzz");
	}

	public LadyBird(String name, boolean isFemale) {
		this.name=name;
		this.isFemale=isFemale;
	}

	@Override
	public void feed() {
		speak("I love aphid!");
	}


}
