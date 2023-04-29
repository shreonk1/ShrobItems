package me.joey.shrobitems;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemBuilder {
    public String name;
    public ItemStack item;
    public Material m;
    public ArrayList<String> lore = new ArrayList<>();
    ItemMeta meta;

    public ItemBuilder(Material m, String...lore) {
        this.item = new ItemStack(m);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(Arrays.asList(lore));

        this.item.setItemMeta(meta);
        this.m = m;
    }

    public Material getMaterial() {
        return m;
    }

    public String getDisplayName() {
        return name;
    }

    public ArrayList<String> getLore() { return lore; }


    public ItemBuilder addItemFlags(ItemFlag flag) {
        meta.addItemFlags();
        return this;
    }

    public ItemBuilder setDisplayName(String name) {
        meta.setDisplayName(name);
        return this;
    }

    public ItemBuilder addEnchants(Enchantment enchantment, int level) {
        meta.addEnchant(enchantment, level, true);
        return this;
    }

    public ItemStack toItemStack() {
        return item;
    }
}
