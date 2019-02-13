package com.animals.fish;

public class Clownfish extends Fish {
	public Clownfish() {
		super(Color.ORANGE, Size.SMALL);
	}

	public void joke() {
		System.out.println("i could tell you a joke but I just can't remember one at the moment");
	}
}
