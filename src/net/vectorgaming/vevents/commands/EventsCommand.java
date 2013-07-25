
package net.vectorgaming.vevents.commands;

import net.vectorgaming.vevents.commands.admin.*;
import net.vectorgaming.vevents.commands.user.*;
import org.bukkit.command.CommandSender;

/**
 *
 * @author Kenny
 */
public class EventsCommand extends VCommand
{
    public EventsCommand(){}
    
    @Override
    public boolean run(CommandSender cs, String[] args) 
    {
        if(args.length == 0)
        {
            cs.sendMessage(getUsage());
            return true;
        }
        this.runSubCommand(cs, args[0], args);
        return true;
    }

    @Override
    public String getName() {return "events";}

    @Override
    public String getUsage() {
        return "Type /events help for a list of commands";
    }

    @Override
    public boolean isPlayerOnlyCommand() {return false;}

    @Override
    public String[] getAliases() {
        String[] aliases = {"vevents", "ve"};
        return aliases;
    }

    @Override
    public String getPermission() {return "vevents.help";}
    
    @Override
    public void setupSubCommands()
    {
        this.addSubCommand("help", HelpMenuCommand.class);
        this.addSubCommand("vote", VoteCommand.class);
        this.addSubCommand("forcestart", ForceStartCommand.class);
    }

}
