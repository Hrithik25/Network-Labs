import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarksTest {

	@Test
	void testTellClass() {
		String first = "First Class";
		String second = "Second Class";
		String third = "Third Class";
		String fail = "Supplementry is six months away";
		assertEquals(first, Marks.tellClass(70, 72, 65, 87, 92));
		assertEquals(first, Marks.tellClass(10, 12, 2, 15, 8));
	}

}
