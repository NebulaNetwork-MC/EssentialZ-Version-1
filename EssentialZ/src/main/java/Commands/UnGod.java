package Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class UnGod implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player){

            Player player = (Player) commandSender;
            if(player.hasPermission("EssentialZ.UnGod")){
                player.setInvulnerable(false);
                player.sendMessage("You are no longer invincible!");
            }else{
                player.sendMessage(ChatColor.RED + "You do not have permission to do this command!");
            }
        }

        return false;
    }
}