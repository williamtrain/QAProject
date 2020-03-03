import static org.junit.Assert.*;

import org.junit.Test;

public class EntryTest {

	@Test
	public void test() {
		Entry e = new Entry("idk");
		assertEquals("idk", e.name);
	}

}
