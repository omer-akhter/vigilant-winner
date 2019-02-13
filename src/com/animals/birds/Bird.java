package com.animals.birds;

import com.animals.Animal;
import com.animals.Flying;
import com.animals.Singing;
import com.animals.Sound;

//should be abstract. birds don't get instantiated without being *specific*
public abstract class Bird extends Animal implements Flying, Singing {
	protected Sound song;

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

	@Override
	public void sing() {
		System.out.println(song.get());
	}
}
