package com.somacode.labs.item

import com.somacode.labs.item.`interface`.Registrable
import com.somacode.labs.item.shield.ShieldRegister

object ItemRegister: Registrable {
    override fun register() {
        ShieldRegister.register()
    }
}