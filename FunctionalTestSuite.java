import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ConnectionTest.class, CourseTest.class, EntryManagerTest.class, EntryTest.class, ProjectTest.class,
		QueryTest.class, StudentTest.class })
public class FunctionalTestSuite {

}
