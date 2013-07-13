
package net.vectorgaming.vevents.event.type;

import com.garbagemule.MobArena.ArenaMasterImpl;
import com.garbagemule.MobArena.framework.Arena;
import java.util.logging.Level;
import net.vectorgaming.vevents.event.VArena;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 *
 * @author Kenny
 */
public class MobArena extends VArena
{
    private ArenaMasterImpl am;
    private String arenaName;
    private Arena arena;
    
    public MobArena(Location loc, String arenaName)
    {
        super(loc);
        this.arenaName = arenaName;
        if(Bukkit.getPluginManager().getPlugin("MobArena") == null || !Bukkit.getPluginManager().getPlugin("MobArena").isEnabled())
        {
            Bukkit.getLogger().log(Level.SEVERE, "[VEvents] MobArena must be enabled to create MobArena events!");
            return;
        }
        com.garbagemule.MobArena.MobArena maPlugin = new com.garbagemule.MobArena.MobArena();
        am = new ArenaMasterImpl(maPlugin.getPlugin());
        arena = am.getArenaWithName(arenaName);
    }
    
    @Override
    public void start()
    {
        if(!am.getArenas().contains(arena))
        {
            System.out.println("[VEvents] Failed to start arena, "+arenaName+". Arena does not exist in MobArena.");
            return;
        }
        //Ends the arena if already running
        if(arena.isRunning())
            arena.endArena();
        
        //Moves all players to the joined state and MobArena handles the rest
        for(Player p : players)
        {
            arena.playerJoin(p, p.getLocation());
        }
    }
    
    @Override
    public void forceStop()
    {
        arena.forceEnd();
    }
    
    @Override
    public boolean isRunning()
    {
        if(arena.isRunning())
            return true;
        return false;
    }
    
    @Override
    public void readyArena(){}
    
    @Override
    public EventType getEventType(){return EventType.MOB_ARENA;}
    
    @Override
    public void sendEndMessage(){}
    
}
