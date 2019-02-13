package com.animals.birds;

import com.animals.Animal;
import com.animals.Flying;
import com.animals.Singing;
import com.animals.Sound;
import com.animals.Walking;

//should be abstract. birds don't get instantiated without being *specific*
public abstract class Bird extends Animal implements Flying, Singing, Walking {
	protected Sound song;

	@Override
	public void walk() {
		Animal.walkImpl.walk();
	}

	@Override
	public void fly() {
		Animal.flyImpl.fly();
	}

	@Override
	public void sing() {
		System.out.println(song.get());
	}
}
