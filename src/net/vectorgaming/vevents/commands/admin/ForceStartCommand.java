
package net.vectorgaming.vevents.commands.admin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.vectorgaming.vevents.commands.VCommand;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;

/**
 *
 * @author Kenny
 */
public class ForceStartCommand extends VCommand
{

    @Override
    public boolean run(CommandSender cs, String[] arguments) 
    {
        //Move args array over to begin after vote
        String[] args = Arrays.copyOfRange(arguments, 1, arguments.length);
        
        Location loc  = new Location(Bukkit.getWorld("world"), 1, 1, 1);
        //MobArena defaultMa;
        try {
            //defaultMa = new MobArena(args[0]);
            //defaultMa.addPlayer(Bukkit.getPlayer("comedyallianz"));
            //defaultMa.start();
        } catch (Exception ex) {
            Logger.getLogger(ForceStartCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public String getName() {return "events forcestart";}

    @Override
    public String getUsage() {return "Usage: /events forcestart";}

    @Override
    public boolean isPlayerOnlyCommand() {return false;}

    @Override
    public String[] getAliases() {
        String[] aliases = {};
        return aliases;
    }

    @Override
    public void setupSubCommands() {}

    @Override
    public String getPermission() {return "vevents.admin.forcestart";}

}
