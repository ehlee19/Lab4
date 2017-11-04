package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;


	
	public class TableTest {
		Table A = new Table();
		Player one = new Player("Enoch",1);
		Player two = new Player("Greg",2);
		
		@Test
		public void test() {
			
			A.AddPlayerToTable(one);
			A.AddPlayerToTable(two);
			
			assertEquals(one.getPlayerID(),A.GetPlayerFromTable(one).getPlayerID());
			
			A.RemovePlayerFromTable(one);
			assertEquals(null,A.GetPlayerFromTable(one));
		}
	}

