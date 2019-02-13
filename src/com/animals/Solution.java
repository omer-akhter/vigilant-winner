package com.animals;

import com.animals.birds.Chicken;
import com.animals.birds.Duck;
import com.animals.birds.Parrot;
import com.animals.fish.Clownfish;
import com.animals.fish.Shark;

public class Solution {

	public static void main(String[] args) {
		Animal[] animals = new Animal[] { new Duck(), new Chicken(true), new Chicken(false), new Parrot(),
				new Parrot(Sound.CAT), new Shark(), new Clownfish(), new Dolphin() };

		int count = 0;
		for (Animal animal : animals) {
			if (animal instanceof Flying) {
				count++;
			}
		}
		System.out.printf("%d animals fly", count);
		System.out.println();

		count = 0;
		for (Animal animal : animals) {
			if (animal instanceof Walking) {
				count++;
			}
		}
		System.out.printf("%d animals walk", count);
		System.out.println();

		count = 0;
		for (Animal animal : animals) {
			if (animal instanceof Singing) {
				count++;
			}
		}
		System.out.printf("%d animals sing", count);
		System.out.println();

		count = 0;
		for (Animal animal : animals) {
			if (animal instanceof Swimming) {
				count++;
			}
		}
		System.out.printf("%d animals swim", count);
		System.out.println();
	}
}
