import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void test() {
		Student s = new Student("Rob", "SQLServer");
		assert(s.name == "Database of Things");
		assert(s.skills == "SQLServer");
	}

}
