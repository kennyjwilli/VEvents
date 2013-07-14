package net.vectorgaming.vevents;

import net.vectorgaming.vevents.commands.CommandManager;
import net.vectorgaming.vevents.commands.EventsCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Kenny
 */
public class VEvents extends JavaPlugin
{
    private CommandManager cm = new CommandManager();
    
    @Override
    public void onEnable()
    {
        setupEvents();
    }
    
    @Override
    public void onDisable(){}
    
    private void setupEvents()
    {
        PluginManager pm = Bukkit.getPluginManager();
        this.getCommand("events").setExecutor(cm);
        CommandManager.registerCommand("events", EventsCommand.class);
    }
}
