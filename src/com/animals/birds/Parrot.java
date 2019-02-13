package com.animals.birds;

import com.animals.Sound;

public class Parrot extends Bird {
	public Parrot() {
		this(null);
	}

	public Parrot(Sound imitate) {
		if (imitate == null) {
			this.song = Sound.PARROT;
		} else {
			this.song = imitate;
		}
	}
}
