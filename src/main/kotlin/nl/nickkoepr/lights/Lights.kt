package nl.nickkoepr.lights

import nl.nickkoepr.lights.commands.LightsCommand
import org.bukkit.plugin.java.JavaPlugin

class Lights : JavaPlugin() {

    override fun onEnable() {
        //Create light command.
        getCommand("lights")?.setExecutor(LightsCommand())
    }
}