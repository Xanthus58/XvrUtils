package ukxanthus.xvrutils.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Properties;
import java.util.logging.Logger;

@SuppressWarnings("ALL")
public class RulesCommand implements CommandExecutor {
    Logger logger = Logger.getLogger("XvrUtils");

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Properties props = new Properties();
        sender.sendMessage("Hello, " + ChatColor.GREEN + sender.getName() + ChatColor.WHITE + " and welcome to " + ChatColor.GREEN + "XVR! \n" + ChatColor.RED + "-Rules-\n1. No Griefing \n2. No Stealing \n3. No Hacking\n4. No Advertising\n5. You are required to follow the rules of the Discord Server");
        logger.info("[XVR Utils]" + " Rules have been sent to " + sender.getName());
        return true;
    }
}
