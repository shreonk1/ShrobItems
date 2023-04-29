package me.joey.shrobitems.items;

import me.joey.shrobitems.BaseItem;
import me.joey.shrobitems.ItemBuilder;
import me.joey.shrobitems.Utils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class InfiniteTorch extends BaseItem {
    public InfiniteTorch(String displayName, String name, boolean isStackable, int stackSize, ItemStack itemStack) {
        super("InfiniteTorch", Utils.addColour( "&b&lInfinite Torch"), false, new ItemBuilder(Material.TORCH, "&bWatch, as this torch keeps lighting!").toItemStack());
    }
}
