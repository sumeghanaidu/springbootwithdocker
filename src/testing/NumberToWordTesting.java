package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Converter.NumberWord;

class NumberToWordTesting {

	@Test
	void test() {
		NumberWord ntw= new NumberWord();
		assertEquals("one hundred ",ntw.numberToWord(100));
	}

}
