package net.mandl.oxidizedarmor;

import java.util.LinkedHashMap;
import java.util.Map;

import net.mandl.oxidizedarmor.armor.RoseGoldArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import safro.oxidized.Oxidized;

public class OxidizedArmorItems {
	private static final Map<Identifier, Item> ITEMS = new LinkedHashMap<>();

	public static final ArmorMaterial ROSE_GOLD_ARMOR = new RoseGoldArmorMaterial();
	public static final Item ROSE_GOLD_HELMET = add("rose_gold_helmet", new ArmorItem(ROSE_GOLD_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(Oxidized.ITEMGROUP)));
	public static final Item ROSE_GOLD_CHESTPLATE = add("rose_gold_chestplate", new ArmorItem(ROSE_GOLD_ARMOR, EquipmentSlot.CHEST, new Item.Settings().group(Oxidized.ITEMGROUP)));
	public static final Item ROSE_GOLD_LEGGINGS = add("rose_gold_leggings", new ArmorItem(ROSE_GOLD_ARMOR, EquipmentSlot.LEGS, new Item.Settings().group(Oxidized.ITEMGROUP)));
	public static final Item ROSE_GOLD_BOOTS = add("rose_gold_boots", new ArmorItem(ROSE_GOLD_ARMOR, EquipmentSlot.FEET, new Item.Settings().group(Oxidized.ITEMGROUP)));


	private static <I extends Item> I add(String name, I item) {
		ITEMS.put(new Identifier(OxidizedArmorMod.MODID, name), item);
		return item;
	}

	public static void registerItems() {
		for (Identifier id : ITEMS.keySet()) {
			Registry.register(Registry.ITEM, id, ITEMS.get(id));
		}
	}
}