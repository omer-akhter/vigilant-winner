package com.animals;

public class Caterpillar extends Animal implements Walking, Morphing {
	private Butterfly morphed;

	@Override
	public Animal morph() {
		if (morphed == null) {
			morphed = new Butterfly();
		} else {
			System.out.println("I am not a caterpillar anymore");
		}
		return morphed;
	}

	@Override
	public void walk() {
		if (morphed == null) {
			Animal.walkImpl.walk();
			return;
		}
		System.out.println("I am not a caterpillar anymore");
	}
}
