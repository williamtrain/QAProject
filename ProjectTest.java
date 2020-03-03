import static org.junit.Assert.*;

import org.junit.Test;

public class ProjectTest {

	@Test
	public void test() {
		Student[] s = new Student[20];
		Student S = new Student("Rob", "SQLServer");
		s[1] = S;
		Project p = new Project("Database of Things", "SQLServer, Networking", s);
		assert(p.name == "Database of Things");
		assert(p.skills == "SQLServer, Networking");
		assert(p.team[1].name == "Rob");	
	}

}
