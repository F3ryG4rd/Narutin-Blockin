
package net.mcreator.narutoblock.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.narutoblock.itemgroup.NarutoBlockArmorsItemGroup;
import net.mcreator.narutoblock.NarutoBlockModElements;

@NarutoBlockModElements.ModElement.Tag
public class Sharinga3Item extends NarutoBlockModElements.ModElement {
	@ObjectHolder("naruto_block:sharinga_3_helmet")
	public static final Item helmet = null;
	@ObjectHolder("naruto_block:sharinga_3_chestplate")
	public static final Item body = null;
	@ObjectHolder("naruto_block:sharinga_3_leggings")
	public static final Item legs = null;
	@ObjectHolder("naruto_block:sharinga_3_boots")
	public static final Item boots = null;
	public Sharinga3Item(NarutoBlockModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 50;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 20}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 10;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ChakraItem.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "sharinga_3";
			}

			public float getToughness() {
				return 2.5f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(NarutoBlockArmorsItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naruto_block:textures/models/armor/sharingan__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("sharinga_3_helmet"));
	}
}
