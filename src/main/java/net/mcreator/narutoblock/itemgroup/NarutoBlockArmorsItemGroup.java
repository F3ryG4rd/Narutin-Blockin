
package net.mcreator.narutoblock.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.narutoblock.item.ChakraItem;
import net.mcreator.narutoblock.NarutoBlockModElements;

@NarutoBlockModElements.ModElement.Tag
public class NarutoBlockArmorsItemGroup extends NarutoBlockModElements.ModElement {
	public NarutoBlockArmorsItemGroup(NarutoBlockModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnaruto_block_armors") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ChakraItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
