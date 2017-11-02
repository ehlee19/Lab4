package pkgCore;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.junit.Test;

import pkgEnum.eGameType;

public class GamePlayTest {

	@Test
	public void TestGamePlay() {
		//HashMap<UUID, Player> GamePlayers = new HashMap<UUID, Player>();
		GamePlay gp = new GamePlayBlackJack(eGameType.POKER);
		Player p1 = new Player("TJ", 1);
		Player p2 = new Player("Jon", 2);
		ArrayList<Player> Players = new ArrayList<Player>();
		Players.add(p1);
		Players.add(p2);
		
		gp.AddPlayersToGame(Players);
	
		assertEquals(gp.GetPlayerInGame(p1),p1);
		assertEquals(gp.GetPlayerInGame(p2),p2);
		
		gp.RemovePlayerFromGame(p1);
		gp.RemovePlayerFromGame(p2);
		
		
		
		
		
		
	}

}
