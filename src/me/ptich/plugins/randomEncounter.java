package me.ptich.plugins;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerFishEvent;

import java.util.Random;

public class randomEncounter implements Listener {

    Random random = new Random();
    int isEncountered = 0;

    @EventHandler
    public void onPlayerFish(PlayerFishEvent e) {
        
        Player player = e.getPlayer();

        if (e.getState().equals(PlayerFishEvent.State.CAUGHT_FISH)) {

            isEncountered = random.nextInt(10) + 1;

            if (isEncountered == 1 || isEncountered == 2 || isEncountered == 3) {
                //TODO 인카운터 구현
                player.sendMessage("몬스터를 만났다!");
            } else {
                e.setCancelled(false);
            }

        } else {
            e.setCancelled(false);
        }

    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {

        Player player = e.getPlayer();

        if (e.getBlock().getType() == Material.OBSIDIAN) {

            isEncountered = random.nextInt(10) + 1;

            if (isEncountered == 1 || isEncountered == 2) {
                //TODO 인카운터 구현
                player.sendMessage("몬스터를 만났다!");
            } else {
                e.setCancelled(false);
            }

        }

    }

}
