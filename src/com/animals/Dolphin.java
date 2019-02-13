package com.animals;

public class Dolphin extends Animal implements Swimming {
	@Override
	public void swim() {
		Animal.swimImpl.swim();
	}
}
