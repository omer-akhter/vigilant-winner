package test.com.animals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.animals.Sound;
import com.animals.birds.Bird;
import com.animals.birds.Chicken;
import com.animals.birds.Duck;
import com.animals.birds.Parrot;

class AnimalTest {
	private final ByteArrayOutputStream outCaptured = new ByteArrayOutputStream();
	private final PrintStream out = System.out;

	private void captureStart() {
		outCaptured.reset();
		System.setOut(new PrintStream(outCaptured));
	}

	private String captureEnd() {
		System.setOut(out);
		return outCaptured.toString();
	}
	
	@Test
	void testDuck() {
		Duck d = new Duck();

		captureStart();
		d.fly();
		Assertions.assertTrue(captureEnd().equals("I am flying\n"), "ducks can't fly?");

		captureStart();
		d.sing();
		Assertions.assertTrue(captureEnd().equals("Quack, quack\n"), "what is duck singing");

		captureStart();
		d.swim();
		Assertions.assertTrue(captureEnd().equals("I am swimming\n"), "ducks can't swim?");

		Bird b = d;

		captureStart();
		b.fly();
		Assertions.assertTrue(captureEnd().equals("I am flying\n"), "ducks can't fly?");

		captureStart();
		b.sing();
		Assertions.assertTrue(captureEnd().equals("Quack, quack\n"), "what is duck singing");
	}

	@Test
	void testChicken() {
		Chicken c = new Chicken(false);

		captureStart();
		c.fly();
		Assertions.assertTrue(captureEnd().equals("I can't fly\n"), "wow, a chicken is flying");

		captureStart();
		c.sing();
		Assertions.assertTrue(captureEnd().equals("Cluck, cluck\n"), "what is chicken singing?");

		Bird b = c;

		captureStart();
		b.fly();
		Assertions.assertTrue(captureEnd().equals("I can't fly\n"), "wow, a chicken is flying");

		captureStart();
		b.sing();
		Assertions.assertTrue(captureEnd().equals("Cluck, cluck\n"), "what is chicken singing?");
	}

	@Test
	void testRooster() {
		Chicken c = new Chicken(true);

		captureStart();
		c.fly();
		Assertions.assertTrue(captureEnd().equals("I can't fly\n"), "wow, a rooster is flying");

		captureStart();
		c.sing();
		Assertions.assertTrue(captureEnd().equals("Cock-a-doodle-doo\n"), "what is rooster singing?");

		Bird b = c;

		captureStart();
		b.fly();
		Assertions.assertTrue(captureEnd().equals("I can't fly\n"), "wow, a rooster is flying");

		captureStart();
		b.sing();
		Assertions.assertTrue(captureEnd().equals("Cock-a-doodle-doo\n"), "what is rooster singing?");
	}

	@Test
	void testParrot() {
		Parrot p = new Parrot();

		captureStart();
		p.fly();
		Assertions.assertTrue(captureEnd().equals("I am flying\n"), "parrots can't fly?");

		captureStart();
		p.sing();
		Assertions.assertTrue(captureEnd().equals("Tain, tain\n"), "what is parrot singing");

		Bird b = p;

		captureStart();
		b.fly();
		Assertions.assertTrue(captureEnd().equals("I am flying\n"), "parrots can't fly?");

		captureStart();
		b.sing();
		Assertions.assertTrue(captureEnd().equals("Tain, tain\n"), "what is parrot singing");
	}

	@Test
	void testParrotWithDog() {
		Parrot p = new Parrot(Sound.DOG);

		captureStart();
		p.fly();
		Assertions.assertTrue(captureEnd().equals("I am flying\n"), "parrots can't fly?");

		captureStart();
		p.sing();
		Assertions.assertTrue(captureEnd().equals("Woof, woof\n"), "what is parrot imitating");

		Bird b = p;

		captureStart();
		b.fly();
		Assertions.assertTrue(captureEnd().equals("I am flying\n"), "parrots can't fly?");

		captureStart();
		b.sing();
		Assertions.assertTrue(captureEnd().equals("Woof, woof\n"), "what is parrot imitating");
	}

	@Test
	void testParrotWithCat() {
		Parrot p = new Parrot(Sound.CAT);

		captureStart();
		p.fly();
		Assertions.assertTrue(captureEnd().equals("I am flying\n"), "parrots can't fly?");

		captureStart();
		p.sing();
		Assertions.assertTrue(captureEnd().equals("Meow\n"), "what is parrot imitating");

		Bird b = p;

		captureStart();
		b.fly();
		Assertions.assertTrue(captureEnd().equals("I am flying\n"), "parrots can't fly?");

		captureStart();
		b.sing();
		Assertions.assertTrue(captureEnd().equals("Meow\n"), "what is parrot imitating");
	}

	@Test
	void testParrotWithRooster() {
		Parrot p = new Parrot(Sound.ROOSTER);

		captureStart();
		p.fly();
		Assertions.assertTrue(captureEnd().equals("I am flying\n"), "parrots can't fly?");

		captureStart();
		p.sing();
		Assertions.assertTrue(captureEnd().equals("Cock-a-doodle-doo\n"), "what is parrot imitating");

		Bird b = p;

		captureStart();
		b.fly();
		Assertions.assertTrue(captureEnd().equals("I am flying\n"), "parrots can't fly?");

		captureStart();
		b.sing();
		Assertions.assertTrue(captureEnd().equals("Cock-a-doodle-doo\n"), "what is parrot imitating");
	}
}
