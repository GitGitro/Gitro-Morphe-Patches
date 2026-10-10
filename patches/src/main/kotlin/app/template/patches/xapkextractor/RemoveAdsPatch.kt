package app.template.patches.xapkextractor

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.template.patches.shared.Constants.COMPATIBILITY_XAPKEXTRACTOR

@Suppress("unused")
val unlockSupporterPatch = bytecodePatch(
    name = "Remove ads",
    description = "Remove ads by unlocking the supporter status.",
    default = true
) {
    compatibleWith(COMPATIBILITY_XAPKEXTRACTOR)

    execute {
        SupporterOnCreateFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x1
                sput-boolean v0, Lcom/ytheekshana/apkextractor/MainActivity;->G:Z
            """
        )
    }
}