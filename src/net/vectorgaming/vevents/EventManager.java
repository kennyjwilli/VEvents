
package net.vectorgaming.vevents;

import java.util.ArrayList;
import java.util.HashMap;
import net.vectorgaming.vevents.event.VEvent;

/**
 *
 * @author Kenny
 */
public class EventManager 
{
    private static ArrayList<Class<? extends VEvent>> activeArenas = new ArrayList<>();
    private static HashMap<String, Class<? extends VEvent>> events = new HashMap<>();
    
//    public static void activateArena(Class<? extends VEvent> c)
//    {
//        if(!activeArenas.contains(c))
//            activeArenas.add(c);
//    }
//    
//    public static void deactivateArena(Class<? extends VEvent> c)
//    {
//        if(activeArenas.contains(c))
//            activeArenas.remove(c);
//    }
    
    public ArrayList<String> getEventTypes()
    {
        ArrayList<String> result = new ArrayList<>();
        for(String s : events.keySet())
        {
            if(!result.contains(s))
                result.add(s);
        }
        return result;
    }
    
    public static void registerEvent(String name, Class<? extends VEvent> c)
    {
        events.put(name, c);
    }
    
    public static void unregisterEvent(String name)
    {
        events.remove(name);
    }
    
    public static Class<? extends VEvent> getEventClass(String eventType)
    {
        return events.get(eventType);
    }
}
