package net.bryanleonard1984.vanenhanced.item;

import net.bryanleonard1984.vanenhanced.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial
{
    EMERALD(ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL, 1561, 12.0F, 3.0F, 22, () -> Ingredient.ofItems(Items.EMERALD));


    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag,
                     final int itemDurability,
                     final float miningSpeed,
                     final float attackDamage,
                     final int enchantability,
                     final Supplier<Ingredient> repairIngredient)
    {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {return this.itemDurability;}

    @Override
    public float getMiningSpeedMultiplier() {return this.miningSpeed;}

    @Override
    public float getAttackDamage() {return this.attackDamage;}

    @Override
    public TagKey<Block> getInverseTag() {return this.inverseTag;}

    @Override
    public int getEnchantability() {return this.enchantability;}

    @Override
    public Ingredient getRepairIngredient() {return this.repairIngredient.get();}

    @Override
    public ToolComponent createComponent(TagKey<Block> tag) {return ToolMaterial.super.createComponent(tag);}
}
