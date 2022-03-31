package edu.westmont.cs030;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.westmont.solution.Triple;

public class TripleTest {

	@Test
	public void testBasic() {
		// String, String, String
		Triple<String, String, String> x = new Triple<String, String, String>("Hello", "World", "I'm alive");
		assertEquals("Hello", x.getFirst());
		assertEquals("World", x.getSecond());
		assertEquals("I'm alive", x.getThird());

		x.setFirst("New Hello");
		assertEquals("New Hello", x.getFirst());

		x.setSecond("New World");
		assertEquals("New World", x.getSecond());

		x.setThird("New I'm Alive");
		assertEquals("New I'm Alive", x.getThird());

		// String, String, Integer
		Triple<String, String, Integer> y = new Triple<String, String, Integer>("Hello", "World", 1);
		assertEquals("Hello", y.getFirst());
		assertEquals("World", y.getSecond());
		assertEquals(Integer.valueOf(1), y.getThird());

		y.setFirst("New Hello");
		assertEquals("New Hello", y.getFirst());

		y.setSecond("New World");
		assertEquals("New World", y.getSecond());

		y.setThird(2);
		assertEquals(Integer.valueOf(2), y.getThird());

		// Integer, Integer, Integer
		Triple<Integer, Integer, Integer> z = new Triple<Integer, Integer, Integer>(1, 2, 3);
		assertEquals(Integer.valueOf(1), z.getFirst());
		assertEquals(Integer.valueOf(2), z.getSecond());
		assertEquals(Integer.valueOf(3), z.getThird());

		z.setFirst(-3);
		assertEquals(Integer.valueOf(-3), z.getFirst());

		z.setSecond(-2);
		assertEquals(Integer.valueOf(-2), z.getSecond());

		z.setThird(-1);
		assertEquals(Integer.valueOf(-1), z.getThird());

	}

	@Test
	public void testALot() {
		for (int i = 0; i < 1000; i++) {
			// String,String, String
			String firstString = "The time is " + System.nanoTime();
			String secondString = "The time is now " + System.nanoTime();
			String thirdString = "The time is now actually " + System.nanoTime();
			Triple<String, String, String> x = new Triple<String, String, String>(firstString, secondString,
					thirdString);
			assertEquals(firstString, x.getFirst());
			assertEquals(secondString, x.getSecond());
			assertEquals(thirdString, x.getThird());

			x.setFirst(secondString);
			x.setSecond(thirdString);
			x.setThird(firstString);
			assertEquals(secondString, x.getFirst());
			assertEquals(thirdString, x.getSecond());
			assertEquals(firstString, x.getThird());

			// String,Long, Long
			Long secondLong = System.nanoTime();
			Long thirdLong = System.nanoTime();
			Triple<String, Long, Long> y = new Triple<String, Long, Long>(firstString, secondLong, thirdLong);
			assertEquals(firstString, y.getFirst());
			assertEquals(secondLong, y.getSecond());
			assertEquals(thirdLong, y.getThird());

			y.setSecond(secondLong + 1);
			assertEquals(Long.valueOf(secondLong + 1L), y.getSecond());

			y.setThird(thirdLong + 2);
			assertEquals(Long.valueOf(thirdLong + 2L), y.getThird());

			// Long,Long,Long,
			Long firstLong = System.nanoTime();
			Triple<Long, Long, Long> z = new Triple<Long, Long, Long>(firstLong, secondLong, thirdLong);
			assertEquals(firstLong, z.getFirst());
			assertEquals(secondLong, z.getSecond());
			assertEquals(thirdLong, z.getThird());

			z.setFirst(firstLong - 1);
			assertEquals(Long.valueOf(firstLong - 1L), z.getFirst());

			z.setSecond(secondLong - 2);
			assertEquals(Long.valueOf(secondLong - 2L), z.getSecond());

			z.setThird(thirdLong - 3);
			assertEquals(Long.valueOf(thirdLong - 3L), z.getThird());
		}
	}
}
