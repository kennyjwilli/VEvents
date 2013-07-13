package net.vectorgaming.vevents;

import net.vectorgaming.vcore.VHelpMenu;
import net.vectorgaming.vcore.permissions.PermissionHandler;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Kenny
 */
public class VEvents extends JavaPlugin
{
    public PermissionHandler pm = new PermissionHandler(this);
    public VHelpMenu helpMenu = new VHelpMenu(this);
    
    @Override
    public void onEnable()
    {
        
    }
    
    @Override
    public void onDisable(){}
    
    private void setupEvents()
    {
        
    }
}
