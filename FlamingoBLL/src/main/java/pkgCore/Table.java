package pkgCore;

import java.util.HashMap;
import java.util.UUID;

public class Table {

	private UUID TableID;
	//private ArrayList<Player> PlayersInTable = new ArrayList<Player>();
	private HashMap<UUID, Player> PlayersInTable = new HashMap<UUID, Player>();
	public Table() {
		super();
		this.TableID = UUID.randomUUID();
	}
	
	public void AddPlayerToTable(Player p)
	{
		//Completed: Implement this method
		PlayersInTable.put(p.getPlayerID(), p);
	}
	public void RemovePlayerFromTable(Player p)
	{
		//Completed: Implement this method
		PlayersInTable.remove(p.getPlayerID());
	}
	
	public Player GetPlayerFromTable(Player p)
	{
		//Complete: Implement this method	
		return PlayersInTable.get(p.getPlayerID());
	}
}
