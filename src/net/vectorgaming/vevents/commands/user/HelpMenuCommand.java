
package net.vectorgaming.vevents.commands.user;

import net.vectorgaming.vevents.commands.VCommand;
import org.bukkit.command.CommandSender;

/**
 *
 * @author Kenny
 */
public class HelpMenuCommand extends VCommand
{
    
    @Override
    public boolean run(CommandSender cs, String[] args) {
        cs.sendMessage("Reached");
        return true;
    }

    @Override
    public String getName(){return "event help";}

    @Override
    public String getUsage() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean isPlayerOnlyCommand() {return false;}

    @Override
    public String[] getAliases() {
        String[] aliases = {"events", "vevents", "ve"};
        return aliases;
    }

    @Override
    public String getPermission() {return "vevents.help";}

    @Override
    public void setupSubCommands(){}
    
}
