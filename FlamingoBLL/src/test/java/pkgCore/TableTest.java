package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableTest {

	@Test
	public void TestTable() {
		
		Table t = new Table();
		Player p1 = new Player("TJ", 1);
		
		t.AddPlayerToTable(p1);
		
		assertEquals(t.GetPlayerFromTable(p1),p1);
		
		t.RemovePlayerFromTable(p1);
	}

}
