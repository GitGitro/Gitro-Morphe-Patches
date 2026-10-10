package app.template.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.SupportedAbi

object Constants {
    val COMPATIBILITY_AIDETECTOR = Compatibility(
        name = "AI Detector",
        packageName = "com.aidetector.app",
        targets = listOf(
            AppTarget(
                version = "21.0.0"
            )
        )
    )
}
