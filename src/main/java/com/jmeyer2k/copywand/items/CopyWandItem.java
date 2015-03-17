package com.jmeyer2k.copywand.items;

import com.jmeyer2k.copywand.CopyWand;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CopyWandItem extends Item{
	public CopyWandItem() {
		super();
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("copyWand");
		this.setMaxDamage(1600);
	}
	
	private int uses;
	
	@Override
	public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
		uses += 1;
		CopyWand.instance.logger.info(uses);
		this.d
		return true;
	}
}
