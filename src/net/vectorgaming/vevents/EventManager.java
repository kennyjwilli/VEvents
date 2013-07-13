
package net.vectorgaming.vevents;

import java.util.ArrayList;
import java.util.HashMap;
import net.vectorgaming.vevents.event.VArena;

/**
 *
 * @author Kenny
 */
public class EventManager 
{
    private static ArrayList<Class<? extends VArena>> activeArenas = new ArrayList<>();
    
    public static void activateArena(Class<? extends VArena> c)
    {
        if(!activeArenas.contains(c))
            activeArenas.add(c);
    }
    
    public static void deactivateArena(Class<? extends VArena> c)
    {
        if(activeArenas.contains(c))
            activeArenas.remove(c);
    }
}
