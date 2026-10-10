package app.template.patches.shared

import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

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
