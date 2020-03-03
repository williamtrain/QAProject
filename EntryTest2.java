import static org.junit.Assert.*;

import org.junit.Test;

public class EntryTest2 {

	@Test (expected = IllegalArgumentException.class)
	public void test() {
	//testing creating an entry using the wrong data types
		Entry e = new Entry(1);
	}

}
