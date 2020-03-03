import static org.junit.Assert.*;
import java.io.File;
import org.junit.Test;

public class ConnectionTest2 {

	@Test
	public void test() {
		//Testing attempting to create a null connection
		Connection connection1 = new Connection(null);
		assert(connection1 == null);
		
	}
	@Test 
	public void test2() {
		//The path tested here would not contain the file, as such, we are testing a connection to a non existant file
		File f = new File("C:/windows/users/irbri/documents/wrong.txt");
		Connection connection1 = new Connection(f);
		assert(connection1.path == ("C:/windows/users/irbri/documents/wrong.txt"));
		
	}	
	@Test (expected = IllegalArgumentException.class)
	public void test3() {
		//attempting to search for null
		File f = new File("C:/windows/users/irbri/documents/right.txt");
		Connection connection1 = new Connection(f);		
		
		Query i = new Query("null");
		QueryResult q = connection1.FindData(i);
		
	}
	@Test (expected = IllegalArgumentException.class)
	public void test4() {
		//attempting to search for something that doesn't match any possible entry type
		File f = new File("C:/windows/users/irbri/documents/right.txt");
		Connection connection1 = new Connection(f);		
		
		Query i = new Query("StudentID: -1");
		QueryResult q = connection1.FindData(i);
		
	}
}
