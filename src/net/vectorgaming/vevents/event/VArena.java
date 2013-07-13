
package net.vectorgaming.vevents.event;

import java.util.ArrayList;
import net.vectorgaming.vevents.event.type.EventType;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 *
 * @author Kenny
 */
public abstract class VArena
{
    public ArrayList<Player> players = new ArrayList<>();
    private Location arenaSpawnPt;
    private final int TASK_ID = 0;
    
    public VArena(Location loc)
    {
        arenaSpawnPt = loc;
    }
    
    public abstract void start();
    
    public void readyArena()
    {
        for(Player p : players)
        {
            p.teleport(arenaSpawnPt);
        }
    }
    
    public abstract boolean isRunning();
    
    public void end()
    {
        endTeleportAction();
        resetInventory();
        rewardPlayers(null);
        recordStats();
    }
    
    public abstract void forceStop();
    
    public abstract EventType getEventType();
    
    public EventResult getResult()
    {
        if(isRunning())
            return EventResult.GAME_RUNNING;
        return EventResult.ONE_WINNER;
    }
        
    public ArrayList<Player> getActivePlayers(){return players;}
    
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
