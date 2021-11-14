package nl.nickkoepr.lights.commands

import nl.nickkoepr.lights.manager.LightMode
import nl.nickkoepr.lights.manager.LightsManager
import nl.nickkoepr.lights.utils.Color
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class LightsCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, cmd: Command, label: String, args: Array<out String>): Boolean {
        if (args.isEmpty()) {
            sender.sendMessage("&cPlease add 'on' or 'off'!")
            return true
        } else {
            when (args[0]) {
                "on" -> {
                    LightsManager.setLights(LightMode.ON) { responce ->
                        sender.sendMessage(Color.translate(responce))
                    }
                    return true
                }
                "off" -> {
                    LightsManager.setLights(LightMode.OFF) { responce ->
                        sender.sendMessage(Color.translate(responce))
                    }
                    return true
                }
                else -> {
                    sender.sendMessage(Color.translate("&c${args[0]} is not valid!"))
                    return true
                }
            }
        }
    }
}
