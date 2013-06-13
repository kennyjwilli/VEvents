
package net.vectorgaming.vevents;

import java.util.ArrayList;
import org.bukkit.entity.Player;

/**
 *
 * @author Kenny
 */
abstract class VArena 
{
    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Player> activePlayers = new ArrayList<>();
    
    public void start()
    {
        
    }
    
    public void end()
    {
        endTeleportAction();
        resetInventory();
        rewardPlayers();
        recordStats();
    }
    
    public void forceStop()
    {
        
    }
    
    public void join()
    {
        
    }
    
    public void leave()
    {
        
    }
    
    public Object getResult()
    {
        
    }
    
    public ArrayList<Player> getPlayers(){return players;} 
    
    public ArrayList<Player> getActivePlayers(){return activePlayers;}
    
    public void addActivePlayer(Player p)
    {
        if(!activePlayers.contains(p))
            activePlayers.add(p);
    }
    
    public void removeActivePlayer(Player p)
    {
        if(activePlayers.contains(p))
            activePlayers.remove(p);
    }
    
    public boolean isActivePlayer(Player p)
    {
        if(activePlayers.contains(p))
            return true;
        return false;
    }
    
    public void readyArena()
    {
        
    }
    
    public void rewardPlayers(Reward r)
    {
        
    }
    
    public void endTeleportAction()
    {
        
    }
    
    public void resetInventory()
    {
        
    }
    
    public void recordStats()
    {
        
    }
}
