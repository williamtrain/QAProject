import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest2 {

	@Test (expected = IllegalArgumentException.class)
	public void test() {
	//testing creating a student using the wrong data types
		Student s = new Student("Ron");
	}
}
