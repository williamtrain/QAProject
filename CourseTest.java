import static org.junit.Assert.*;

import org.junit.Test;

public class CourseTest {

	@Test
	public void test() {
		Student[] students = new Student[1];
		students[0] = new Student("Andrew", "not this");
		Course c = new Course("name", "subject", new Student[1]);
		String n = "name";
		String sub = "subject";
		Student student = new Student("Andrew", "not this");
		assertEquals(n, c.n);
		assertEquals(sub, c.sub);
		assertEquals(student, c.ros[0]);
	}

}
