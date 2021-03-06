
package net.mcreator.narutoblock.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.narutoblock.itemgroup.NarutoBlockItemsItemGroup;
import net.mcreator.narutoblock.NarutoBlockModElements;

import java.util.List;

@NarutoBlockModElements.ModElement.Tag
public class ChakraHyuugaItem extends NarutoBlockModElements.ModElement {
	@ObjectHolder("naruto_block:chakra_hyuuga")
	public static final Item block = null;
	public ChakraHyuugaItem(NarutoBlockModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NarutoBlockItemsItemGroup.tab).maxStackSize(64));
			setRegistryName("chakra_hyuuga");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Utilizado para Crafts!"));
		}
	}
}
