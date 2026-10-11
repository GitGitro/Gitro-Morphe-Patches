package app.template.patches.usenetpanda.premium

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.template.patches.shared.Constants.COMPATIBILITY_USENETPANDA

@Suppress("unused")
val unlockPremiumPatch = bytecodePatch(
    name = "Unlock premium",
    description = "Unlocks all premium features.",
    default = true
) {
    compatibleWith(COMPATIBILITY_USENETPANDA)

    execute {
        IsPremiumFingerprint.method.addInstructions(
            0,
            """
                const-string v0, "premium"
                return-object v0
            """
        )

        RevokePremiumFingerprint.method.addInstructions(
            0,
            "return-void"
        )
    }
}