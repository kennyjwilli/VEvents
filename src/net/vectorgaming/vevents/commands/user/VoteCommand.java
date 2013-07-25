
package net.vectorgaming.vevents.commands.user;

import java.util.Arrays;
import net.vectorgaming.vevents.commands.VCommand;
import org.bukkit.command.CommandSender;

/**
 *
 * @author Kenny
 */
public class VoteCommand extends VCommand
{

    @Override
    public boolean run(CommandSender cs, String[] argus) 
    {
        //Move args array over to begin after vote
        String[] args = Arrays.copyOfRange(argus, 1, argus.length);
        
        if(args.length == 0)
        {
            cs.sendMessage(getUsage());
            return true;
        }
        
        return true;
    }

    @Override
    public String getName() {return "events vote";}

    @Override
    public String getUsage() {return "Usage: /events vote";}

    @Override
    public boolean isPlayerOnlyCommand() {return true;}

    @Override
    public String[] getAliases() {
        String[] aliases = {"v"};
        return aliases;
    }

    @Override
    public void setupSubCommands(){}

    @Override
    public String getPermission() {return "vevents.vote";}

}
