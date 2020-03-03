import static org.junit.Assert.*;

import org.junit.Test;

public class EntryManagerTest {

	@Test
	public void testAdd() {
		Entry e = new Entry("hi");
		EntryManager em = new EntryManager();
		em.AddEntry(e);
		assertEquals(true, em.added);
	}
	
	public void testDelete() {
		Entry e = new Entry("bye");
		EntryManager em = new EntryManager();
		em.DeleteEntry(e);
		assertEquals(true, em.deleted);
	}

}
