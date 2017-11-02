package pkgCore;

import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;

import pkgEnum.eGameType;

public abstract class GamePlay {

	private eGameType eGameType;
	//private ArrayList<Player> GamePlayers = new ArrayList<Player>();
	private HashMap<UUID, Player> GamePlayers = new HashMap<UUID, Player>();
	public GamePlay(eGameType eGameType)
	{
		super();
		this.eGameType = eGameType;
	}
	
	protected void AddPlayersToGame(ArrayList<Player> Players)
	{
		//Complete: Implement this method
		for(Player p: Players )
		GamePlayers.put(p.getPlayerID(), p);
	}
	protected void RemovePlayerFromGame(Player p)
	{
		//Complete: Implement this method	
		GamePlayers.remove(p.getPlayerID());
	}
	protected Player GetPlayerInGame(Player p)
	{
		//Complete: Implement this method	
		return GamePlayers.get(p.getPlayerID());
	}
}
