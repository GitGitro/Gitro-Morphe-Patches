package app.template.patches.aidetector.unlockpro

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.template.patches.shared.Constants.COMPATIBILITY_AIDETECTOR

@Suppress("unused")
val unlockPremiumPatch = bytecodePatch(
    name = "Unlocks pro",
    description = "Unlocks pro and remove the ads.",
    default = true
) {
    compatibleWith(COMPATIBILITY_AIDETECTOR)

    execute {
        ProStatusFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x1
                return v0
            """
        )

        ProPersistenceFingerprint.method.addInstructions(
            0,
            """
                sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
                return-object v0
            """
        )

        ProWriteFingerprint.method.addInstructions(
            0,
            """
                const/4 p1, 0x1
            """
        )
    }
}