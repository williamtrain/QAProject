import static org.junit.Assert.*;

import org.junit.Test;

public class QueryResultTest2 {

	@Test (expected = IllegalArgumentException.class)
	public void test() {
		QueryResult q = new QueryResult();
		q.Type = Student;
		Student s = q.roster[1];
	}

}
