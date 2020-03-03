import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest2 {

	@Test (expected = IllegalArgumentException.class)
	public void test() {
	//testing creating a course using the wrong data types
		Course c = new Course("Ron");
	}
}
