package nl.nickkoepr.lights.utils

import org.bukkit.ChatColor

object Color {

    fun translate(message: String): String {
        return ChatColor.translateAlternateColorCodes('&', message)
    }
}