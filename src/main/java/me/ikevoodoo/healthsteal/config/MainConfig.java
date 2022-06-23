package me.ikevoodoo.healthsteal.config;

import me.ikevoodoo.smpcore.config.annotations.Config;

@Config("config.yml")
public class MainConfig {

    public static double stealPercentage = 75;
    public static boolean stealFromDamage = true;
    public static boolean mobsStealHealth = false;

    public static boolean useMaxSteal = false;
    public static double maxSteal = 5;

}
