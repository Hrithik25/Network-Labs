import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PropertiesTest {

	@Test
	void testGetMessage() {
		Properties p = Properties.getInstance();
		String name = "config.properties";
		String key = "user";
		assertEquals("arisglobal", p.getMessage(name, key));
	}

}
