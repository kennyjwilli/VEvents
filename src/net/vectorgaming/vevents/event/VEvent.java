
package net.vectorgaming.vevents.event;

import info.jeppes.ZoneCore.TriggerBoxes.PolygonTriggerBox;
import info.jeppes.ZoneCore.TriggerBoxes.TriggerBox;
import java.util.ArrayList;
import net.vectorgaming.vevents.event.type.EventType;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

/**
 *
 * @author Kenny
 */
public abstract class VEvent
{
    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Location> polygon = new ArrayList<>();
    private final int TASK_ID = 0;
    private String name;
    private String type;
    
    public VEvent(String name, String type)
    {
        this.name = name;
        this.type = type;
    }
    
    public String getName(){return name;}
    
    public void setName(String name){this.name = name;}
    
    public abstract void start();
    
    public abstract void readyArena();
    
    public abstract boolean isRunning();
    
    public void end()
    {
        endTeleportAction();
        resetInventory();
        rewardPlayers(null);
        recordStats();
    }
    
    public abstract void forceStop();
    
    public String getType() {return type;}
    
    public void addPolygonPoint(Location loc){polygon.add(loc);}
    
    public ArrayList<Location> getPolygonPoints(){return polygon;}
    
    public EventResult getResult()
    {
        if(isRunning())
            return EventResult.GAME_RUNNING;
        return EventResult.ONE_WINNER;
    }
        
    public ArrayList<Player> getPlayers(){return players;}
    
    public void addPlayer(Player p)
    {
        if(!players.contains(p))
            players.add(p);
    }
    
    public void removePlayer(Player p)
    {
        if(players.contains(p))
            players.remove(p);
    }
    
    public boolean isActivePlayer(Player p)
    {
        if(players.contains(p))
            return true;
        return false;
    }
    
    public void rewardPlayers(Reward r)
    {
        
    }
    
    public void endTeleportAction()
    {
        Location loc = Bukkit.getWorld("spawn").getSpawnLocation();
        for(Player p : players){p.teleport(loc);}
    }
    
    public abstract void sendEndMessage();
    
    public void resetInventory()
    {
        
    }
    
    public void recordStats()
    {
        
    }
}
