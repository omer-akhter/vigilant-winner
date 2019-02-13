package com.animals.fish;

import com.animals.Animal;
import com.animals.Swimming;

//should be abstract. fish don't get instantiated without being *specific*
public abstract class Fish extends Animal implements Swimming {
	@Override
	public void swim() {
		Animal.swimImpl.swim();
	}

	public enum Size {
		SMALL, LARGE
	}

	public enum Color {
		GRAY, ORANGE
	}

	protected final Color color;
	protected final Size size;

	public Color getColor() {
		return color;
	}

	public Size getSize() {
		return size;
	}

	protected Fish(Color color, Size size) {
		this.color = color;
		this.size = size;
	}
}
