package net.oriondev.hextension_core.toolsubclasses;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeSubClass extends PickaxeItem {
    public PickaxeSubClass(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
