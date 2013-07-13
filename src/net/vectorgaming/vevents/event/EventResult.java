
package net.vectorgaming.vevents.event;

/**
 *
 * @author Kenny
 */
public enum EventResult 
{
    GAME_RUNNING(0),
    ONE_WINNER(1),
    TEAM_WINNER(2);
    
    public final int eventResult;
    
    EventResult(int i)
    {
        eventResult = i;
    }
}
