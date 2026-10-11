package app.template.patches.usenetpanda.license

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.template.patches.shared.Constants.COMPATIBILITY_USENETPANDA


@Suppress("unused")
val bypassLicenseCheckPatch = bytecodePatch(
    name = "Bypass license check",
    description = "Bypasses the PairIP license.",
    default = true
) {
    compatibleWith(COMPATIBILITY_USENETPANDA)

    execute {
        LicenseClientCheckInternalFingerprint.method.addInstructions(
            0,
            "return-void"
        )
    }
}