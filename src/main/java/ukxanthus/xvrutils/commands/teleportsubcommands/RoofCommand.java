package ukxanthus.xvrutils.commands.teleportsubcommands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import ukxanthus.xvrutils.XvrUtils;
import ukxanthus.xvrutils.commands.SubCommand;

import java.util.logging.Logger;

public class RoofCommand extends SubCommand {
    Logger logger = Logger.getLogger(XvrUtils.class.getName());

    public String getName() {
        return "roof";
    }

    public String getDescription() {
        return "Teleports you to the roof of the mansion";
    }

    public String getSyntax() {
        return "/warp roof";
    }

    public void perform(Player player, String[] args) {
        if (args.length == 1) {
            Location location = player.getLocation();

            location.setX(188);
            location.setY(87);
            location.setZ(-7310);

            player.teleport(location);
            player.sendMessage(ChatColor.GREEN + "[XVR Utils]" + " You have been teleported to the roof of the roof!");
            logger.info(ChatColor.GREEN + "[XVR Utils]" + player.getName() + " has used the /tp roof command! Teleporting to the roof of the roof!");
        } else {
            player.sendMessage(ChatColor.GREEN + "[XVR Utils] " + ChatColor.RED + "You must be a player to use this command!");
            logger.info(ChatColor.GREEN + "[XVR Utils] " + ChatColor.RED + "A non-player has tried to use the /warp roof command!");
        }
    }
}
