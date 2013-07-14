
package net.vectorgaming.vevents.commands;

import net.vectorgaming.vevents.VEvents;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 *
 * @author Kenny
 */
public class VEBaseCommand implements CommandExecutor
{
    private VEvents plugin;
    public VEBaseCommand(VEvents instance){plugin = instance;}
    
    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String lbl, String[] args)
    {
        if(lbl.equalsIgnoreCase("ve") || lbl.equalsIgnoreCase("vevents"))
        {
            if(!cs.hasPermission("vevents.help"))
            {
                //plugin.pm.sendNoPermMsg(cs, "access help menu.");
                return true;
            }
            if(args.length == 0)
            {
                //plugin.helpMenu.noArgHelpMsg(cs);
                return true;
            }
            if(args[0].equalsIgnoreCase("join"))
            {
                
            }else if(args[0].equalsIgnoreCase("leave"))
            {
                
            }else if(args[0].equalsIgnoreCase("vote"))
            {
                
            }else if(args[0].equalsIgnoreCase("start"))
            {
                
            }else if(args[0].equalsIgnoreCase("end"))
            {
                
            }else if(args[0].equalsIgnoreCase("arenas"))
            {
                
            }
        }
        return true;
    }
}
