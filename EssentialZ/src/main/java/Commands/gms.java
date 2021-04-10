package Commands;

import me.configz1.essentialz.EssentialZ;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gms implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player){

            Player player = (Player) commandSender;
            if(player.hasPermission("EssentialZ.gms")){
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage("Your gamemode has been set to 0");
            }else{
                player.sendMessage(ChatColor.RED + "You do not have permission to do this command!");
            }
        }

        return false;
    }
}
