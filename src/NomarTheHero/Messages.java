package NomarTheHero;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Messages implements Runnable {
	
	Random rand = new Random();
	
	Broadcast plugin = Broadcast.getPlugin();
	
	ChatColor bold = ChatColor.BOLD;
	String gold = bold + "" + ChatColor.GOLD;
	String goldNormal = "" + ChatColor.GOLD;
	String lBlue = "" + ChatColor.AQUA;
	String blue = bold + "" + ChatColor.DARK_AQUA;
	String darkAqua = bold + "" + ChatColor.DARK_BLUE;
	String green = bold + "" + ChatColor.GREEN;
	String greenNormal = "" + ChatColor.GREEN;
	String pink = "" + ChatColor.LIGHT_PURPLE;
	String red = "" + ChatColor.DARK_RED;
	

	@Override
	public void run() {

		if (plugin.getConfig().getString("server").equalsIgnoreCase("creative")) {
			
			int x = rand.nextInt(listOfMessagesCreative.length);
			
			broadcastMessage(listOfMessagesCreative[x]);
			
		}
		
		else if (plugin.getConfig().getString("server").equalsIgnoreCase("survival")) {
			
			int x = rand.nextInt(listOfMessagesSurvival.length);
			
			broadcastMessage(listOfMessagesSurvival[x]);
			
		}
		
	}
	
	
	public String[] listOfMessagesCreative = {
		"You can earn in-game money by bringing new people to the server! More info on the Member page.",
		"Join our official plug.dj for a place where you can play music together! http://plug.dj/monkeycraft",
		"Want to talk to other players? Connect to our Teamspeak! IP: ts.monkeygamesmc.com",
		"To disable " + pink + "Chat Sounds" + lBlue + " type /sounds off.",
		"Visit the homepage regularly to be informed of the newest updates!",
		"Visit the website to post on the forums where you can post reports, bugs, feedback and more, or take a look at the store or apply for Member! http://monkeygamesmc.com",
		"Be sure to " + goldNormal + "/vote" + lBlue + " every day for 2 hours of WorldEdit, $40, fire, and to support the server!",
		"Donate for WorldEdit, DisguiseCraft, Particles, Nicknames and a lot more! Visit http://monkeygamesmc.com/shop.",
		"Want to flip a table or slap someone? Try /tableflip or /slap! Or try /gibberish to talk in nonsense!",
		"Also try our Survival server! IP: life.monkeygamesmc.com",
		"You can get a 25% off discount at Minecraft server hosting using the coupon code" + goldNormal + " monkeycraft " + lBlue + "at http://mpgservers.com!",
		"Want to play " + goldNormal + "BowSpleef" + lBlue + " with others? Try /bspleef join 1!",
		"Want to marry other players? Type /marry for more info",
		"You can make LikeSigns by putting [Like] at the top row of a sign. You can also sit in stairs like chairs, and ride minecarts on flat ground! To auction things, type /auc for more help.",
		"Want to be able to only talk on the plot you're standing on, for example to roleplay? Type /pchat to enable or disable plot-only chat!"
	};
	
	public String[] listOfMessagesSurvival = {
		"You can earn in-game money by bringing new people to the server! More info on the Member page.",
		"Join our official plug.dj for a place where you can play music together! http://plug.dj/monkeycraft",
		"Want to talk to other players? Connect to our Teamspeak! IP: ts.monkeygamesmc.com",
		"To disable " + pink + "Chat Sounds" + lBlue + " type /sounds off.",
		"Visit the homepage regularly to be informed of the newest updates!",
		"Visit the website to post on the forums where you can post reports, bugs, feedback and more, or take a look at the store or apply for Member! http://monkeygamesmc.com",
		"Be sure to " + goldNormal + "/vote" + lBlue + " every day for 24 hours of /tpa, $150, and to support the server!",
		"Donate for Money, Godmode, Nicknames, Virtual Chests, Fly mode and more! Visit http://monkeygamesmc.com/shop.",
		"Want to flip a table or slap someone? Try /tableflip or /slap! Or try /gibberish to talk in nonsense!",
		"Also try our Creative server! IP: build.monkeygamesmc.com",
		"You can get a 25% off discount at Minecraft server hosting using the coupon code" + goldNormal + " monkeycraft " + lBlue + "at http://mpgservers.com!",
		"Want to marry other players? Type /marry for more info",
		"Type /kit <kit> for some free items everyday!",
		"You can " + red + "pvp " + lBlue + "in an arena where you don't loose your items by typing /pvp!",
		"Never accept /tpa requests from people you don't trust!",
		"To buy land type /land claim. To add someone you trust to your land type /land friendall. To remove someone from your land, type /land unfriendall.",
		"Griefing or placing lava / water next to the borders of claimed land is NOT allowed, and if caught will result in a permanent ban."
	};
	
	
	
	private void broadcastMessage(String message) {
		
		//Prefix
		
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage(gold + "   ▬▬▬▬▬▬▬▬▬▬▬▬▬▬  " + darkAqua + "[" + green + "MonkeyCraft" + darkAqua + "]" + gold + "  ▬▬▬▬▬▬▬▬▬▬▬▬▬▬"); //&6&l▬▬▬▬▬▬▬▬▬▬▬▬▬ &9&l[&a&lMonkeyCraft&9&l]&6&l ▬▬▬▬▬▬▬▬▬▬▬▬▬
		
		//Message
		
		sendMsg(message);
		
		//Suffix
		
		Bukkit.broadcastMessage("");
		
	}
	
	private void sendMsg(String message) {
		
		Bukkit.broadcastMessage(lBlue + "► " + message);
		
	}

}
