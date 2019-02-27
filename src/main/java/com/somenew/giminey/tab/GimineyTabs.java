package com.somenew.giminey.tab;

import com.somenew.giminey.Item.SomenewItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GimineyTabs extends CreativeTabs {
	public GimineyTabs(String lab) {
		super(lab);
	}
	@Override
	public Item getTabIconItem() {
		
		return SomenewItem.obsidian_somenew_lab_logo;
	}

}
