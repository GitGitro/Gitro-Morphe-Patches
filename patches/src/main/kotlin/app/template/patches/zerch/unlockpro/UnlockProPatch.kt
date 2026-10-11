package app.template.patches.zerch.unlockpro

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.template.patches.shared.Constants.COMPATIBILITY_ZERCH

@Suppress("unused")
val unlockProPatch = bytecodePatch(
    name = "Unlock pro",
    description = "Unlocks all pro features.",
    default = true
) {
    compatibleWith(COMPATIBILITY_ZERCH)

    execute {
        IsProFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x1
                return v0
            """
        )
    }
}