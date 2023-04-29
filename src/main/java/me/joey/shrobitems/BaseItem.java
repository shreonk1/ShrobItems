package me.joey.shrobitems;

import org.bukkit.inventory.ItemStack;

public abstract class BaseItem {
    public String displayName;
    public String name;
    public boolean isStackable;
    public int stackSize;
    public ItemStack itemStack;
    public BaseItem(String name, String displayName, boolean isStackable, int stackSize, ItemStack itemStack) {
        this.name = name;
        this.displayName = displayName;
        this.itemStack = itemStack;
        this.isStackable = isStackable;
        this.stackSize = stackSize;

    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getName() {
        return name;
    }

    public int getStackSize() {
        return 0;
    }

    public boolean isStackable() {
        return false;
    }
}
