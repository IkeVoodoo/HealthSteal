package me.ikevoodoo.healthsteal;

import me.ikevoodoo.smpcore.SMPPlugin;
import org.bukkit.Bukkit;

public final class HealthSteal extends SMPPlugin {

    @Override
    public void onPreload() {
        Bukkit.broadcastMessage("YO");
    }

    @Override
    public void whenEnabled() {
        System.out.println("hey");
    }
}
