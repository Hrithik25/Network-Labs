import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HeightTest {
	
	@Test
	void testConvertToCm() {
		Height h1 = new Height(1,2);
		Height h2 = new Height(2,4);
		
		assertEquals(100, Height.convertToCm(h1, h2));
	}

}
