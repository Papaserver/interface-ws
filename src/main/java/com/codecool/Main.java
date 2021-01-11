package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    	List<Flying> animals = new ArrayList<>();
		animals.add(new LadyBird("Katica", false));
		animals.add(new LadyBird("Katika", true));

		animals.add(new Bird("Anser Anser", true));
		animals.add(new Bird("Buteo Buteo", true));


		for (Flying animal : animals) {
			animal.fly();
		}

    }
}
