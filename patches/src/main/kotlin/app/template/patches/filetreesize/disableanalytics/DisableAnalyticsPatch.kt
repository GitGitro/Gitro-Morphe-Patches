package app.template.patches.filetreesize.disableanalytics

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.template.patches.shared.Constants.COMPATIBILITY_FILETREESIZE

@Suppress("unused")
val disableAnalyticsPatch = bytecodePatch(
    name = "Disable ads and analytics",
    description = "Stops Firebase Analytics event logging.",
    default = true
) {
    compatibleWith(COMPATIBILITY_FILETREESIZE)

    execute {

        AnalyticsLogEventFingerprint.method.addInstructions(
            0,
            "return-void"
        )
    }
}