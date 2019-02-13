package com.animals;

// should be abstract. animals don't get instantiated without being *specific*
public abstract class Animal {
	protected static final Swimming swimImpl = new Swimming() {
		public void swim() {
			System.out.println("I am swimming");
		}
	};
}
