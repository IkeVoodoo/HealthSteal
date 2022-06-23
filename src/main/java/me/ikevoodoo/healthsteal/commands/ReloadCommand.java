package me.ikevoodoo.healthsteal.commands;

import me.ikevoodoo.smpcore.SMPPlugin;
import me.ikevoodoo.smpcore.commands.SMPCommand;
import me.ikevoodoo.smpcore.commands.arguments.Arguments;
import org.bukkit.command.CommandSender;

public class ReloadCommand extends SMPCommand {
    public ReloadCommand(SMPPlugin plugin) {
        super(plugin, "hsreload", "healthsteal.reload");
    }

    @Override
    public boolean execute(CommandSender commandSender, Arguments arguments) {
        getPlugin().reload();
        commandSender.sendMessage("§6Reloaded HealthSteal!");
        return true;
    }
}
