
package net.vectorgaming.vevents.event.type;

/**
 *
 * @author Kenny
 */
public enum EventType 
{
    MOB_ARENA("MOB_ARENA"),
    PVP_ARENA("PVP_ARENA"),
    SURVIVAL_GAMES("SURVIVAL_GAMES"),
    TDM("TDM"),
    CTF("CTF");
    
    private final String event;
    
    EventType(String e)
    {
        event = e;
    }
}
