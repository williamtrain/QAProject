import static org.junit.Assert.*;

import org.junit.Test;

public class ConnectionTest {

	@Test
	public void testConnection() {
		String file = "C:/Users/andre/Documents/Spring2020/Milestone2DB";
		Connection c = new Connection(null);
		assertEquals(file, c.path);
	}
	
	@Test
	public void testQueryReturns() {
		String file = "C:/Users/andre/Documents/Spring2020/Milestone2DB";
		Connection c = new Connection(null);
		QueryResult exp = new QueryResult("Expected");
		assertEquals(exp, c.FindData(new Query("Insert SQL here I guess")));
	}

}
