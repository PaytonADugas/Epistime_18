package edu.westmont.cs030;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.westmont.solution.Pair;

public class PairTest {

	@Test
	public void testBasic() {
		// String, String
		Pair<String, String> x = new Pair<String, String>("Hello", "World");
		assertEquals("Hello", x.getFirst());
		assertEquals("World", x.getSecond());

		x.setFirst("New Hello");
		assertEquals("New Hello", x.getFirst());

		x.setSecond("New World");
		assertEquals("New World", x.getSecond());

		// String, Integer
		Pair<String, Integer> y = new Pair<String, Integer>("Hello", 1);
		assertEquals("Hello", y.getFirst());
		assertEquals(Integer.valueOf(1), y.getSecond());

		y.setFirst("New Hello");
		assertEquals("New Hello", y.getFirst());

		y.setSecond(2);
		assertEquals(Integer.valueOf(2), y.getSecond());

		// Integer, Integer
		Pair<Integer, Integer> z = new Pair<Integer, Integer>(1, 2);
		assertEquals(Integer.valueOf(1), z.getFirst());
		assertEquals(Integer.valueOf(2), z.getSecond());

		z.setFirst(-3);
		assertEquals(Integer.valueOf(-3), z.getFirst());

		z.setSecond(-2);
		assertEquals(Integer.valueOf(-2), z.getSecond());
	}

	@Test
	public void testALot() {

		for (int i = 0; i < 1000; i++) {
			// String,String
			String firstString = "The time is " + System.nanoTime();
			String secondString = "The time is now " + System.nanoTime();
			Pair<String, String> x = new Pair<String, String>(firstString, secondString);
			assertEquals(firstString, x.getFirst());
			assertEquals(secondString, x.getSecond());

			x.setFirst(secondString);
			x.setSecond(firstString);
			assertEquals(secondString, x.getFirst());
			assertEquals(firstString, x.getSecond());

			// String,Long
			Long secondLong = System.nanoTime();
			Pair<String, Long> y = new Pair<String, Long>(firstString, secondLong);
			assertEquals(firstString, y.getFirst());
			assertEquals(secondLong, y.getSecond());

			y.setSecond(secondLong + 1);
			assertEquals(Long.valueOf(secondLong + 1L), y.getSecond());

			// Long,Long
			Long firstLong = System.nanoTime();
			Pair<Long, Long> z = new Pair<Long, Long>(firstLong, secondLong);
			assertEquals(firstLong, z.getFirst());
			assertEquals(secondLong, z.getSecond());

			z.setFirst(firstLong - 1);
			assertEquals(Long.valueOf(firstLong - 1L), z.getFirst());

			z.setSecond(secondLong - 1);
			assertEquals(Long.valueOf(secondLong - 1L), z.getSecond());
		}
	}

}
