package com.animals.birds;

import com.animals.Sound;

public class Chicken extends Bird {
	public Chicken(boolean male) {
		if (male) {
			this.song = Sound.ROOSTER;
		} else {
			this.song = Sound.CHICKEN;
		}
	}
	
	@Override
	public void fly() {
		// depending on the situation, throwing exception might be a better
		// implementation. but since that appears not to be required in current
		// exercise and to avoid 'throws', we are not going with that.
		//throw new Exception("I can't fly");
		System.out.println("I can't fly");
	}
}
