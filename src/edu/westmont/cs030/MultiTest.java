package edu.westmont.cs030;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.westmont.solution.Pair;
import edu.westmont.solution.Quad;
import edu.westmont.solution.Triple;

public class MultiTest {

	@Test
	public void testBasic() {
		
		Quad<String,Pair<String,String>,Triple<String,String,String>,Quad<String,String,String,String>> frankenstein;
		Pair<String,String> b = new Pair<String,String>("B","C");
		Triple<String,String,String> d = new Triple<String,String,String>("D","E","F");
		Quad<String,String,String,String> g = new Quad<String,String,String,String>("G","H","I","J");
		frankenstein = new Quad<String,Pair<String,String>,Triple<String,String,String>,Quad<String,String,String,String>>("A",b,d,g);

		assertEquals("A",frankenstein.getFirst());
		assertEquals("B",frankenstein.getSecond().getFirst());
		assertEquals("C",frankenstein.getSecond().getSecond());
		assertEquals("D",frankenstein.getThird().getFirst());
		assertEquals("E",frankenstein.getThird().getSecond());
		assertEquals("F",frankenstein.getThird().getThird());
		assertEquals("G",frankenstein.getFourth().getFirst());
		assertEquals("H",frankenstein.getFourth().getSecond());
		assertEquals("I",frankenstein.getFourth().getThird());
		assertEquals("J",frankenstein.getFourth().getFourth());
	}
}
