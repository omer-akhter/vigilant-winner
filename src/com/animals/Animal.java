package com.animals;

// should be abstract. animals don't get instantiated without being *specific*
public abstract class Animal {
	protected static final Swimming swimImpl = new Swimming() {
		public void swim() {
			System.out.println("I am swimming");
		}
	};

	protected static final Flying flyImpl = new Flying() {
		@Override
		public void fly() {
			System.out.println("I am flying");
		}
	};

	protected static final Walking walkImpl = new Walking() {

		@Override
		public void walk() {
			System.out.println("I am walking");
		}
	};
}
