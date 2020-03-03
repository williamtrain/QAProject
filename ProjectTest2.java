import static org.junit.Assert.*;

import org.junit.Test;

public class ProjectTest2 {

	@Test (expected = IllegalArgumentException.class)
	public void test() {
	//testing creating a project using the wrong data types
		Project p = new Project(4, course[]);
	}

}

