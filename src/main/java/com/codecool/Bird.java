package com.codecool;

public class Bird implements Flying, Feeding, Speaking {
	String name;
	boolean isFemale;

	@Override
	public void fly() {
		speak("Csajp, Csájp");
	}

	public Bird(String name, boolean isFemale) {
		this.name=name;
		this.isFemale=isFemale;
	}

	@Override
	public void feed() {
		speak("What a wonderful worm!");
	}
}
