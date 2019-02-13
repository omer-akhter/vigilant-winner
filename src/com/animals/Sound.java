package com.animals;

public enum Sound {
	DUCK("Quack, quack"),
	CHICKEN("Cluck, cluck"),
	ROOSTER("Cock-a-doodle-doo"),
	PARROT("Tain, tain"),
	DOG("Woof, woof"),
	CAT("Meow"),
	PHONE("Ring, ring");

	private final String sound;

	public final String get() {
		return this.sound;
	}

	private Sound(String sound) {
		this.sound = sound;
	}
}
