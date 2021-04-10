package Commands;

import me.configz1.essentialz.EssentialZ;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class god implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player){

            Player player = (Player) commandSender;
            if(player.hasPermission("EssentialZ.god")){
                player.setInvulnerable(true);
                player.sendMessage("You are now invincible!");
            }else{
                player.sendMessage(ChatColor.RED + "You do not have permission to do this command!");
            }
        }

        return false;
    }
}
