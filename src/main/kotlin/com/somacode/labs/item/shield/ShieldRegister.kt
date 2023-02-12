package com.somacode.labs.item.shield

import com.somacode.labs.item.`interface`.Registrable

object ShieldRegister: Registrable {
    override fun register() {
        DiamondShield.register()
        NetheriteShield.register()
    }
}