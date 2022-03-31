package edu.westmont.cs030;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.westmont.solution.Quad;

public class QuadTest {

	@Test
	public void testBasic() {
		// String, String, String,String
		Quad<String, String, String, String> x = new Quad<String, String, String, String>("Hello", "World", "I'm alive",
				"Watch me roar");
		assertEquals("Hello", x.getFirst());
		assertEquals("World", x.getSecond());
		assertEquals("I'm alive", x.getThird());
		assertEquals("Watch me roar", x.getFourth());

		x.setFirst("New Hello");
		assertEquals("New Hello", x.getFirst());

		x.setSecond("New World");
		assertEquals("New World", x.getSecond());

		x.setThird("New I'm Alive");
		assertEquals("New I'm Alive", x.getThird());

		x.setFourth("Hear me roar");
		assertEquals("Hear me roar", x.getFourth());

		// String, String, Integer,Integer
		Quad<String, String, Integer, Integer> y = new Quad<String, String, Integer, Integer>("Hello", "World", 1, 2);
		assertEquals("Hello", y.getFirst());
		assertEquals("World", y.getSecond());
		assertEquals(Integer.valueOf(1), y.getThird());
		assertEquals(Integer.valueOf(2), y.getFourth());

		y.setFirst("New Hello");
		assertEquals("New Hello", y.getFirst());

		y.setSecond("New World");
		assertEquals("New World", y.getSecond());

		y.setThird(2);
		assertEquals(Integer.valueOf(2), y.getThird());

		y.setFourth(3);
		assertEquals(Integer.valueOf(3), y.getFourth());

		// Integer, Integer, Integer, Integer
		Quad<Integer, Integer, Integer, Integer> z = new Quad<Integer, Integer, Integer, Integer>(1, 2, 3, 4);
		assertEquals(Integer.valueOf(1), z.getFirst());
		assertEquals(Integer.valueOf(2), z.getSecond());
		assertEquals(Integer.valueOf(3), z.getThird());
		assertEquals(Integer.valueOf(4), z.getFourth());

		z.setFirst(-3);
		assertEquals(Integer.valueOf(-3), z.getFirst());

		z.setSecond(-2);
		assertEquals(Integer.valueOf(-2), z.getSecond());

		z.setThird(-1);
		assertEquals(Integer.valueOf(-1), z.getThird());

		z.setFourth(0);
		assertEquals(Integer.valueOf(0), z.getFourth());

	}

	@Test
	public void testALot() {
		for (int i = 0; i < 1000; i++) {
			// String,String, String
			String firstString = "The time is " + System.nanoTime();
			String secondString = "The time is now " + System.nanoTime();
			String thirdString = "The time is now actually " + System.nanoTime();
			String fourthString = "The time is now actually actually" + System.nanoTime();
			Quad<String, String, String, String> x = new Quad<String, String, String, String>(firstString, secondString,
					thirdString, fourthString);
			assertEquals(firstString, x.getFirst());
			assertEquals(secondString, x.getSecond());
			assertEquals(thirdString, x.getThird());
			assertEquals(fourthString, x.getFourth());

			x.setFirst(secondString);
			x.setSecond(thirdString);
			x.setThird(fourthString);
			x.setFourth(firstString);
			assertEquals(secondString, x.getFirst());
			assertEquals(thirdString, x.getSecond());
			assertEquals(fourthString, x.getThird());
			assertEquals(firstString, x.getFourth());

			// String String,Long, Long
			Long firstLong = System.nanoTime();
			Long secondLong = System.nanoTime();
			Quad<String, String, Long, Long> y = new Quad<String, String, Long, Long>(firstString, secondString,
					firstLong, secondLong);
			assertEquals(firstString, y.getFirst());
			assertEquals(secondString, y.getSecond());
			assertEquals(firstLong, y.getThird());
			assertEquals(secondLong, y.getFourth());

			y.setFirst(secondString);
			y.setSecond(firstString);
			y.setThird(secondLong);
			y.setFourth(firstLong);

			assertEquals(secondString, y.getFirst());
			assertEquals(firstString, y.getSecond());
			assertEquals(secondLong, y.getThird());
			assertEquals(firstLong, y.getFourth());

			// Long,Long,Long,Long
			Long thirdLong = System.nanoTime();
			Long fourthLong = Long.valueOf(i);
			Quad<Long, Long, Long, Long> z = new Quad<Long, Long, Long, Long>(firstLong, secondLong, thirdLong,
					fourthLong);
			assertEquals(firstLong, z.getFirst());
			assertEquals(secondLong, z.getSecond());
			assertEquals(thirdLong, z.getThird());
			assertEquals(fourthLong, z.getFourth());

			z.setFirst(firstLong - 1);
			assertEquals(Long.valueOf(firstLong - 1L), z.getFirst());

			z.setSecond(secondLong - 1);
			assertEquals(Long.valueOf(secondLong - 1L), z.getSecond());

			z.setThird(thirdLong - 1);
			assertEquals(Long.valueOf(thirdLong - 1L), z.getThird());

			z.setFourth(fourthLong - 1);
			assertEquals(Long.valueOf(fourthLong - 1L), z.getFourth());
		}
	}
}
