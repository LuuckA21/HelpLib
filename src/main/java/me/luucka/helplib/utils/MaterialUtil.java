package me.luucka.helplib.utils;

import org.bukkit.Material;

import java.util.Set;

public final class MaterialUtil {

    private static final Set<Material> BANNERS;
    private static final Set<Material> EDITABLE_BOOKS;
    private static final Set<Material> FIREWORKS;
    private static final Set<Material> FIREWORK_CHARGE;
    private static final Set<Material> POTIONS;

    private static final Set<Material> LEATHER_ARMOR;
    private static final Set<Material> HELMETS;
    private static final Set<Material> CHESTPLATES;
    private static final Set<Material> LEGGINGS;
    private static final Set<Material> BOOTS;

    private static final Set<Material> WALL_SIGNS;

    private MaterialUtil() {}

    static {
        BANNERS = EnumUtil.getAllMatching(Material.class, "BANNER", "WHITE_BANNER",
                "ORANGE_BANNER", "MAGENTA_BANNER", "LIGHT_BLUE_BANNER", "YELLOW_BANNER", "LIME_BANNER",
                "PINK_BANNER", "GRAY_BANNER", "LIGHT_GRAY_BANNER", "CYAN_BANNER", "PURPLE_BANNER",
                "BLUE_BANNER", "BROWN_BANNER", "GREEN_BANNER", "RED_BANNER", "BLACK_BANNER", "SHIELD");

        EDITABLE_BOOKS = EnumUtil.getAllMatching(Material.class, "WRITTEN_BOOK", "WRITABLE_BOOK");

        FIREWORKS = EnumUtil.getAllMatching(Material.class, "FIREWORK", "FIREWORK_ROCKET");

        FIREWORK_CHARGE = EnumUtil.getAllMatching(Material.class, "FIREWORK_CHARGE", "FIREWORK_STAR");

        POTIONS = EnumUtil.getAllMatching(Material.class, "POTION", "SPLASH_POTION",
                "LINGERING_POTION", "TIPPED_ARROW");

        LEATHER_ARMOR = EnumUtil.getAllMatching(Material.class, "LEATHER_HELMET",
                "LEATHER_CHESTPLATE", "LEATHER_LEGGINGS", "LEATHER_BOOTS");

        HELMETS = EnumUtil.getAllMatching(Material.class, "LEATHER_HELMET", "CHAINMAIL_HELMET", "IRON_HELMET",
                "GOLDEN_HELMET", "DIAMOND_HELMET", "NETHERITE_HELMET", "TURTLE_HELMET");

        CHESTPLATES = EnumUtil.getAllMatching(Material.class, "LEATHER_CHESTPLATE", "CHAINMAIL_CHESTPLATE",
                "IRON_CHESTPLATE", "GOLDEN_CHESTPLATE", "DIAMOND_CHESTPLATE", "NETHERITE_CHESTPLATE",
                "ELYTRA");

        LEGGINGS = EnumUtil.getAllMatching(Material.class, "LEATHER_LEGGINGS", "CHAINMAIL_LEGGINGS",
                "IRON_LEGGINGS", "GOLDEN_LEGGINGS", "DIAMOND_LEGGINGS", "NETHERITE_LEGGINGS");

        BOOTS = EnumUtil.getAllMatching(Material.class, "LEATHER_BOOTS", "CHAINMAIL_BOOTS", "IRON_BOOTS",
                "GOLDEN_BOOTS", "DIAMOND_BOOTS", "NETHERITE_BOOTS");

        WALL_SIGNS = EnumUtil.getAllMatching(Material.class, "WALL_SIGN",
                "ACACIA_WALL_SIGN", "BIRCH_WALL_SIGN",
                "DARK_OAK_WALL_SIGN", "JUNGLE_WALL_SIGN",
                "OAK_WALL_SIGN", "SPRUCE_WALL_SIGN",
                "CRIMSON_WALL_SIGN", "WARPED_WALL_SIGN",
                "MANGROVE_WALL_SIGN");
    }

    public static boolean isBanner(final Material material) {
        return BANNERS.contains(material);
    }

    public static boolean isEditableBook(final Material material) {
        return EDITABLE_BOOKS.contains(material);
    }

    public static boolean isFirework(final Material material) {
        return FIREWORKS.contains(material);
    }

    public static boolean isFireworkCharge(final Material material) {
        return FIREWORK_CHARGE.contains(material);
    }

    public static boolean isPotion(final Material material) {
        return POTIONS.contains(material);
    }

    public static boolean isLeatherArmor(final Material material) {
        return LEATHER_ARMOR.contains(material);
    }

    public static boolean isHelmet(final Material material) {
        return HELMETS.contains(material);
    }

    public static boolean isChestplate(final Material material) {
        return CHESTPLATES.contains(material);
    }

    public static boolean isLeggings(final Material material) {
        return LEGGINGS.contains(material);
    }

    public static boolean isBoots(final Material material) {
        return BOOTS.contains(material);
    }

    public static boolean isWallSign(final Material material) {
        return WALL_SIGNS.contains(material);
    }

}
