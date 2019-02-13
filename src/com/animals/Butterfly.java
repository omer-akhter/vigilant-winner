package com.animals;

public class Butterfly extends Animal implements Flying {
	@Override
	public void fly() {
		Animal.flyImpl.fly();
	}
}
