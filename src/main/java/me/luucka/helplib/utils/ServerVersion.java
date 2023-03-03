package me.luucka.helplib.utils;

import org.bukkit.Bukkit;

/**
 * ServerVersion class help you to get Minecraft version of your server
 */
public final class ServerVersion {

    /**
     * Major version of Minecraft
     */
    public static final int MAJOR;

    /**
     * Minor version of Minecraft
     */
    public static final int MINOR;

    /**
     * Patch version of Minecraft
     */
    public static final int PATCH;

    private ServerVersion() {}

    static {
        final String bVersion = Bukkit.getBukkitVersion();
        final String[] version = bVersion.substring(0, bVersion.indexOf("-")).split("\\.");
        MAJOR = Integer.parseInt(version[0]);
        MINOR = Integer.parseInt(version[1]);
        PATCH = version.length > 2 ? Integer.parseInt(version[2]) : 0;
    }
}