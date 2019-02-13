package com.animals.fish;

public class Shark extends Fish {
	public Shark() {
		super(Color.GRAY, Size.LARGE);
	}

	public void eat(Fish fish) {
		if (fish instanceof Shark) {
			System.out.println("shark can't eat a shark");
		} else {
			String[] fullName = fish.getClass().getName().split("\\.");
			System.out.println("eating " + fullName[fullName.length - 1].toLowerCase());
		}
	}
}
