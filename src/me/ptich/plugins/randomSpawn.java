package me.ptich.plugins;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Random;

public class randomSpawn implements Listener {

    final int maxX = 30000;
    final int maxZ = 30000;

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        if (!player.hasPlayedBefore()) {

            Random random = new Random();

            int x = random.nextInt(maxX);
            int z = random.nextInt(maxZ);
            Location randomLocation = (Location) player.getWorld().getHighestBlockAt(x, z).getLocation();
            randomLocation.add(0, 1, 0);

            //player.teleport(randomLocation);

        }


    }

}
