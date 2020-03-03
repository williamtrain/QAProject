import static org.junit.Assert.*;

import org.junit.Test;

public class QueryTest {

	@Test
	public void test() {
		Query q = new Query("target");
		assertEquals("target", q.target);
	}

}
