package com.somacode.labs.item.shield

import com.github.crimsondawn45.fabricshieldlib.lib.`object`.FabricShieldItem
import com.somacode.labs.item.`interface`.Registrable
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.minecraft.item.Items
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object DiamondShield: Registrable {

    private val DIAMOND_SHIELD: Item = FabricShieldItem(
            FabricItemSettings().maxDamage(1000),
            10, 13,
            Items.NETHERITE_INGOT
    )

    override fun register() {
        Registry.register(Registries.ITEM, Identifier("somalabs", "diamond_shield"), DIAMOND_SHIELD)

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register {
            content -> content.add(DIAMOND_SHIELD)
        }

    }
}