package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_Ban;
import me.StevenLawson.TotalFreedomMod.TFM_BanManager;
import me.StevenLawson.TotalFreedomMod.TFM_PlayerList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

@CommandPermissions(level=AdminLevel.ALL, source=SourceType.BOTH)
@CommandParameters(description="TNT's love for bad players...", usage="/<command> <playername>")
public class Command_tnthammer
  extends TFM_Command
{
  public boolean run(final CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
  {
    if (sender.getName().equalsIgnoreCase("EXPLODINGTNT001"))
    {
    }
      else
      {
          sender.sendMessage(TotalFreedomMod.MSG_NO_PERMS);
            TFM_Util.adminAction("WARNING: " + sender.getName(), "Has attempted to use EXPLODINGTNT001's Personal Command. Lord Spam has been notified and alerted", true);
          
         
          return true;
      }
    if (args.length != 1) {
      return false;
    }
    final Player player = getPlayer(args[0]);
    if (player == null)
    {
      sender.sendMessage(TotalFreedomMod.PLAYER_NOT_FOUND);
      return true;
    }
    TFM_Util.adminAction(sender.getName(), " You know you were getting me mad... " + player.getName(), true);
    
    
    
    TFM_Util.adminAction(sender.getName(), " And the mighty Spam lord does not like that... " + player.getName(), true);
    
    
    
    TFM_Util.bcastMsg(player.getName() + " I am gonna strike my TNT Hammer on you and you shall be SHASHED AND RIPPED TO BITS OUT OF HERE!!", ChatColor.RED);
    
   
    
    TFM_Util.bcastMsg(player.getName() + " WELCOME TO A BAN BITCH!!! ", ChatColor.RED);
    
    
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.GOLD);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.BLUE);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.GREEN);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.DARK_PURPLE);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.LIGHT_PURPLE);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.DARK_RED);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.DARK_GREEN);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.BLUE);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.GREEN);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.DARK_BLUE);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.LIGHT_PURPLE);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.GOLD);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.GOLD);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.BLUE);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.GREEN);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.DARK_PURPLE);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.LIGHT_PURPLE);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.DARK_RED);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.DARK_GREEN);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.BLUE);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.GREEN);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.DARK_BLUE);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.LIGHT_PURPLE);
        TFM_Util.bcastMsg(player.getName() + ", WELCOME TO A BAN BITCH!!! ", ChatColor.GOLD);
    final String ip = player.getAddress().getAddress().getHostAddress().trim();
    
    player.setWhitelisted(false);
    player.setOp(false);
    player.setGameMode(GameMode.SURVIVAL);
    player.closeInventory();
    player.getInventory().clear();
    player.setFireTicks(10000);
    player.getWorld().createExplosion(player.getLocation(), 4.0F);
    // im awesome aint i?
         sender.sendMessage(player.getName() + " is now gone.");
          player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
          player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
          player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
          player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
          player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
          player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
          player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
          player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
          player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
          player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
          player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
          player.getWorld().strikeLightning(player.getLocation());
          player.getWorld().strikeLightning(player.getLocation());
          player.getWorld().strikeLightning(player.getLocation());
          player.getWorld().strikeLightning(player.getLocation());
          player.getWorld().strikeLightning(player.getLocation());
          player.getWorld().strikeLightning(player.getLocation());
          player.getWorld().strikeLightning(player.getLocation());
          player.getWorld().strikeLightning(player.getLocation());
          player.getWorld().strikeLightning(player.getLocation());
          player.getWorld().strikeLightning(player.getLocation());
          player.getWorld().strikeLightning(player.getLocation());
          player.getWorld().strikeLightning(player.getLocation());
          player.getWorld().strikeLightning(player.getLocation());
          player.getWorld().strikeLightning(player.getLocation());
          player.getWorld().createExplosion(player.getLocation(), 4F);
          player.getWorld().createExplosion(player.getLocation(), 4F);
          player.getWorld().createExplosion(player.getLocation(), 4F);
          player.getWorld().createExplosion(player.getLocation(), 4F);
          player.getWorld().createExplosion(player.getLocation(), 4F);
          player.getWorld().createExplosion(player.getLocation(), 4F);
          player.getWorld().createExplosion(player.getLocation(), 4F);
          player.getWorld().createExplosion(player.getLocation(), 4F);
          player.getWorld().createExplosion(player.getLocation(), 4F);
          player.getWorld().createExplosion(player.getLocation(), 4F);
          server.dispatchCommand(sender, "orbit " + player.getName());
    new BukkitRunnable()
    {
      public void run()
      {
        player.getWorld().strikeLightning(player.getLocation());
      }
    }
    

      .runTaskLater(this.plugin, 40L);
    



    player.getWorld().createExplosion(player.getLocation(), 4.0F);
    
    new BukkitRunnable()
    {
      public void run()
      {
       // remove from superadmin
        if (TFM_AdminList.isSuperAdmin(player))
        {
           TFM_Util.adminAction(sender.getName(), "Removing " + player.getName() + " from the superadmin list.", true);
            TFM_AdminList.removeSuperadmin(player);
        } 
          player.getWorld().strikeLightning(player.getLocation());
        // ban uuid
        TFM_BanManager.addUuidBan(player);
      }
    }
    
      .runTaskLater(this.plugin, 40L);
    

// remove from whitelist
        player.setWhitelisted(false);

        // deop
        player.setOp(false);

        // ban IPs
        for (String playerIp : TFM_PlayerList.getEntry(player).getIps())
        {
            TFM_BanManager.addIpBan(new TFM_Ban(playerIp, player.getName()));
        }

        // ban uuid
        TFM_BanManager.addUuidBan(player);

    TFM_Util.adminAction(player.getName(), " Welcome to a ban BITCH! ", true);
    player.setFireTicks(10000);
    // ban IPs
        for (String playerIp : TFM_PlayerList.getEntry(player).getIps())
        {
            TFM_BanManager.addIpBan(new TFM_Ban(playerIp, player.getName()));
        }
    new BukkitRunnable()
    {
      public void run()
      {
        TFM_Util.adminAction(sender.getName(), "Has slammed his tnt hammer over: " + player.getName() + ", IP: " + ip, true);
        player.getWorld().createExplosion(player.getLocation(), 4.0F);
        player.kickPlayer(ChatColor.RED + "Next time, don't be a b*tch to the mighty spam lord!!!!");
      }
    }
    
      .runTaskLater(this.plugin, 80L);
    

    return true;
  }
}
