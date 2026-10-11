package app.template.patches.zerch.license

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.template.patches.shared.Constants.COMPATIBILITY_ZERCH

@Suppress("unused")
val bypassLicenseCheckPatch = bytecodePatch(
    name = "Bypass license check",
    description = "Bypasses the PairIP license check.",
    default = true
) {
    compatibleWith(COMPATIBILITY_ZERCH)

    execute {
        CheckLicenseFingerprint.method.addInstructions(0, "return-void")
    }
}