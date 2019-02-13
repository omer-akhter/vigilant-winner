package com.animals.birds;

import com.animals.Animal;
import com.animals.Sound;
import com.animals.Swimming;

public class Duck extends Bird implements Swimming {
	public Duck() {
		this.song = Sound.DUCK;
	}

	@Override
	public void swim() {
		Animal.swimImpl.swim();
	}
}
