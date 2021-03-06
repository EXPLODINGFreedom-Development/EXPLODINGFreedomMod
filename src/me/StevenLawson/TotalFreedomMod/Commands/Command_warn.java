package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_PlayerData;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH, blockHostConsole = true)
@CommandParameters(description = "Warns a player.", usage = "/<command> <player> <reason>")
public class Command_warn extends TFM_Command
{

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (args.length < 2)
        {
            return false;
        }

        Player player = getPlayer(args[0]);

        if (player == null)
        {
            playerMsg(TotalFreedomMod.PLAYER_NOT_FOUND);
            return true;
        }

        if (sender instanceof Player)
        {
            if (player == (Player) sender)
            {
                playerMsg(ChatColor.RED + "Please, don't try to warn yourself.");
                return true;
            }
        }

        if (TFM_AdminList.isSuperAdmin(player))
        {
            playerMsg(ChatColor.RED + "You may not report " + player.getName() + ", they are an admin.");
            return true;
        }

        String warnReason = StringUtils.join(ArrayUtils.subarray(args, 1, args.length), " ");

        player.sendMessage(ChatColor.RED + "[WARNING] " + warnReason + " by " + sender.getName());

        playerMsg(ChatColor.GREEN + "You have successfully warned " + player.getName());
        TFM_PlayerData.getPlayerData(player).incrementWarnings();

        return true;
    }
}