package test.com.animals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.animals.Animal;
import com.animals.Butterfly;
import com.animals.Caterpillar;
import com.animals.Dolphin;
import com.animals.Sound;
import com.animals.birds.Bird;
import com.animals.birds.Chicken;
import com.animals.birds.Duck;
import com.animals.birds.Parrot;
import com.animals.fish.Clownfish;
import com.animals.fish.Fish;
import com.animals.fish.Shark;

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

	@Test
	void testShark() {
		Shark s = new Shark();
		Assertions.assertEquals(s.getColor(), Fish.Color.GRAY);
		Assertions.assertEquals(s.getSize(), Fish.Size.LARGE);

		captureStart();
		s.swim();
		Assertions.assertTrue(captureEnd().equals("I am swimming\n"), "sharks can't swim?");

		captureStart();
		s.eat(s);
		Assertions.assertTrue(captureEnd().equals("shark can't eat a shark\n"), "shark is eating a shark");

		Fish f = new Clownfish();
		captureStart();
		s.eat(f);
		Assertions.assertTrue(captureEnd().equals("eating clownfish\n"), "shark can't eat a clownfish");

		f = s;
		Assertions.assertEquals(f.getColor(), Fish.Color.GRAY);
		Assertions.assertEquals(f.getSize(), Fish.Size.LARGE);

		captureStart();
		f.swim();
		Assertions.assertTrue(captureEnd().equals("I am swimming\n"), "sharks can't swim?");
	}

	@Test
	void testClownfish() {
		Clownfish c = new Clownfish();
		Assertions.assertEquals(c.getColor(), Fish.Color.ORANGE);
		Assertions.assertEquals(c.getSize(), Fish.Size.SMALL);

		captureStart();
		c.swim();
		Assertions.assertTrue(captureEnd().equals("I am swimming\n"), "clownfish can't swim?");

		captureStart();
		c.joke();
		Assertions.assertTrue(
				captureEnd().equals("i could tell you a joke but I just can't remember one at the moment\n"),
				"clownfish can't make a joke");

		Fish f = c;
		Assertions.assertEquals(f.getColor(), Fish.Color.ORANGE);
		Assertions.assertEquals(f.getSize(), Fish.Size.SMALL);

		captureStart();
		f.swim();
		Assertions.assertTrue(captureEnd().equals("I am swimming\n"), "clownfish can't swim?");
	}

	@Test
	void testDolphin() {
		Dolphin d = new Dolphin();

		captureStart();
		d.swim();
		Assertions.assertTrue(captureEnd().equals("I am swimming\n"), "dolphin can't swim?");
	}

	@Test
	void testCaterpillar() {
		Caterpillar c = new Caterpillar();

		captureStart();
		c.walk();
		Assertions.assertTrue(captureEnd().equals("I am walking\n"), "caterpillar can't walk?");

		Animal a = c.morph();
		Assertions.assertTrue(a instanceof Butterfly);

		Butterfly b = (Butterfly) a;
		captureStart();
		b.fly();
		Assertions.assertTrue(captureEnd().equals("I am flying\n"), "butterfly can't walk?");

		captureStart();
		c.walk();
		Assertions.assertTrue(captureEnd().equals("I am not a caterpillar anymore\n"), "caterpillar didn't morph?");
		
		Assertions.assertSame(a, c.morph(), "caterpillar is a new butterfly?");
	}
}
