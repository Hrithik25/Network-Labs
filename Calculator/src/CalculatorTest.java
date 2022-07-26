import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calc = new Calculator();
		assertEquals(30,calc.add(10, 20));
		assertEquals(-1, calc.add(0, -1));
		assertEquals(-2, calc.add(-1, -1));
	}

	@Test
	void testSubtract() {
		Calculator calc = new Calculator();
		assertEquals(10,calc.subtract(20, 10));
	}

}
