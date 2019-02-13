package com.animals.birds;

import com.animals.Sound;

// there is no Rooster class in this solutions. we could create a
// ChickenRoosterBase with fly and then inherit both Chicken and Rooster
// from it. but I prefer to avoid unnecessary hierarchy and it appears
// to be suggested in the question statement as well 

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
