import static org.junit.Assert.*;

import org.junit.Test;

public class QueryTest2 {

	@Test (expected = IllegalArgumentException.class)
	public void test() {
		//Invalid Input Test
		Query Q = new Query(124);
	}
	
	@Test
	public void test2() {
		//Making sure string isnt null
		Query Q = new Query("Johnathan");
		assert(Q.data != null);
	}	

}
