package Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player){

            Player player = (Player) commandSender;
            if(player.hasPermission("EssentialZ.Feed")){
                player.setFoodLevel(20);
                player.sendMessage(ChatColor.GREEN + "Your hunger is now restored!");
            }else{
                player.sendMessage(ChatColor.RED + "You do not have permission to do this command!");
            }
        }

        return false;
    }
}
