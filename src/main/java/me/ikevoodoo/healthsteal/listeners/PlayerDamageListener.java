package me.ikevoodoo.healthsteal.listeners;

import me.ikevoodoo.smpcore.SMPPlugin;
import me.ikevoodoo.smpcore.listeners.SMPListener;
import me.ikevoodoo.smpcore.utils.HealthUtils;
import me.ikevoodoo.smpcore.utils.MathUtils;
import me.ikevoodoo.healthsteal.config.MainConfig;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class PlayerDamageListener extends SMPListener {
    public PlayerDamageListener(SMPPlugin plugin) {
        super(plugin);
    }

    @EventHandler
    public void on(EntityDamageByEntityEvent event) {
        if (!MainConfig.mobsStealHealth && !(event.getDamager() instanceof Player)) return;
        if (!(event.getEntity() instanceof LivingEntity entity)) return;
        if (!(event.getDamager() instanceof LivingEntity attacker)) return;

        double toSteal = MathUtils.percentageOf(MainConfig.stealPercentage, MainConfig.stealFromDamage ? event.getDamage() : entity.getHealth());
        if (MainConfig.useMaxSteal && toSteal > MainConfig.maxSteal)
            toSteal = MainConfig.maxSteal;
        HealthUtils.heal(attacker, toSteal);
    }
}
