import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BracketTest {

	@Test
	void testIs_valid() {
		boolean expected = false;
		String expression = "{}{})";
		assertEquals(expected,Bracket.is_valid(expression));
	}

}
