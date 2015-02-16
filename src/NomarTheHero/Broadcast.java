package NomarTheHero;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Broadcast extends JavaPlugin {
	
	private static Broadcast plugin;
    
    public void onEnable(){
    	
    	plugin = this;
    	
    	//Every 8 minutes a message (6000 TICKS = 5 MINUTES)
    	Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Messages(), 0L, 6000L);
    	
    	saveDefaultConfig();
    	
    }
    

    
    public void onDisable() {
    	
    }
    
    public static Broadcast getPlugin() {
    	return plugin;
    }
    

}
