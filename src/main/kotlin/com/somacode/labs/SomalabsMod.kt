package com.somacode.labs

import com.somacode.labs.item.ItemRegister
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory


object SomalabsMod : ModInitializer {
	private val logger = LoggerFactory.getLogger("somalabs")

	override fun onInitialize() {
		// Register all items
		ItemRegister.register()
		logger.info("Initialize Somalabs!")
	}
}