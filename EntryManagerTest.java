import static org.junit.Assert.*;

import org.junit.Test;

public class EntryManagerTest {

	@Test
	public void testAdd() {
		Entry e = new Entry("hi");
		EntryManager em = new EntryManager();
		em.AddEntry(Entry e);
		assertEquals(true, e.added);
	}
	
	public void testDelete() {
		Entry e = new Entry("bye");
		EntryManager em = new EntryManager();
		em.DeleteEntry(e);
		assertEquals(true, e.deleted);
	}

}
