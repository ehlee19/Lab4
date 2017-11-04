package pkgCore;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.junit.Test;

import pkgEnum.eGameType;

public class GamePlayTest {
	Table t = new Table();
	Player one = new Player("Enoch",1);
	Player two = new Player("Greg",2);
	
	HashMap<UUID,Player> PlayersAtTable;
	GamePlayBlackJack Fun = new GamePlayBlackJack(eGameType.BLACKJACK);
	
	@Test
	public void Test() {
		t.AddPlayerToTable(one);
		t.AddPlayerToTable(two);
		
		PlayersAtTable = t.getPlayersInTable();
		Fun.AddPlayersToGame(PlayersAtTable);
		
		assertEquals(Fun.getGamePlayers(),PlayersAtTable);
		assertEquals(one.getPlayerID(),Fun.GetPlayerInGame(one).getPlayerID());
		
		Fun.RemovePlayerFromGame(one);
		assertEquals(null,Fun.GetPlayerInGame(one));
		
	}

}