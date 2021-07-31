package me.ptich.plugins;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("플러그인 활성화");
        getServer().getPluginManager().registerEvents(new randomSpawn(),this);

        getServer().getPluginManager().registerEvents(new randomEncounter(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("플러그인 비활성화");
    }

}
