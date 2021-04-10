package Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player){

            Player player = (Player) commandSender;
            if(player.hasPermission("EssentialZ.heal")){
                player.setHealth(20);
                player.sendMessage(ChatColor.YELLOW + "You healed to full health!");
            }else{
                player.sendMessage(ChatColor.RED + "You do not have permission to do this command!");
            }
        }

        return false;
    }
}
