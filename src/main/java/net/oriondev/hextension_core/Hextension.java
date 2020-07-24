package net.oriondev.hextension_core;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.oriondev.hextension_core.toolmaterials.HextensionToolMaterials;

public class Hextension implements ModInitializer {
	//ItemGroups
	public static final ItemGroup HEXTENSION_MISC = FabricItemGroupBuilder.create(
			new Identifier("hextension_core", "hextension_misc"))
			.icon(() -> new ItemStack(Hextension.COPPER_INGOT))
			.build();
	public static final ItemGroup HEXTENSION_COMBAT = FabricItemGroupBuilder.create(
			new Identifier("hextension_core", "hextension_combat"))
			.icon(() -> new ItemStack(Hextension.COPPER_SWORD))
			.build();
	//blocks
	public static final Block QUARTZITE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).hardness(1.25f).resistance(0.8f));
	//items
	public static final Item COPPER_INGOT = new Item(new Item.Settings().group(Hextension.HEXTENSION_MISC));
	//tools
	public static final Item COPPER_SWORD = new SwordItem(HextensionToolMaterials.COPPER, 3,-2.4F, new Item.Settings().group(HEXTENSION_COMBAT));
	@Override
	public void onInitialize() {
		//blocks
		Registry.register(Registry.BLOCK, new Identifier("hextension_core", "quartzite"), QUARTZITE);
		//items
		Registry.register(Registry.ITEM, new Identifier("hextension_core", "copper_ingot"), COPPER_INGOT);
		Registry.register(Registry.ITEM, new Identifier("hextension_core", "copper_sword"), COPPER_SWORD);
		//blockitems
		Registry.register(Registry.ITEM, new Identifier("hextension_core", "quartzite"), new BlockItem(QUARTZITE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
