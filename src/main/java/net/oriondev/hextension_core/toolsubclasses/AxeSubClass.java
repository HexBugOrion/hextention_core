package net.oriondev.hextension_core.toolsubclasses;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class AxeSubClass extends AxeItem {
    public AxeSubClass(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
