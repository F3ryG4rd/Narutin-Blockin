
package net.mcreator.narutoblock.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.narutoblock.item.MiniChakraItem;
import net.mcreator.narutoblock.NarutoBlockModElements;

@NarutoBlockModElements.ModElement.Tag
public class NarutoBlockItemsItemGroup extends NarutoBlockModElements.ModElement {
	public NarutoBlockItemsItemGroup(NarutoBlockModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnaruto_block_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MiniChakraItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
