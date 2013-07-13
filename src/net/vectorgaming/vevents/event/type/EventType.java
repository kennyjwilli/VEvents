
package net.vectorgaming.vevents.event.type;

/**
 *
 * @author Kenny
 */
public enum EventType 
{
    MOB_ARENA(0),
    PVP_ARENA(1),
    SURVIVAL_GAMES(2),
    TDM(4),
    CTF(5);
    
    private final int eventID = -1;
    
    EventType(int id)
    {
        id = eventID;
    }
}
