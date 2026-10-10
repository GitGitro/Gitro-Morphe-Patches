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

    val COMPATIBILITY_REVERSO = Compatibility(
        name = "Reverso Context",
        packageName = "com.softissimo.reverso.context",
        targets = listOf(
            AppTarget(
                version = "16.5.0",
            )
        )
    )

    val COMPATIBILITY_RIGHTGALLERY = Compatibility(
        name = "RightGallery",
        packageName = "dev.goodwy.gallery",
        targets = listOf(
            AppTarget(
                version = "8.3.1"
            )
        )
    )

    val COMPATIBILITY_RILLPHONE = Compatibility(
        name = "RillPhone",
        packageName = "dev.goodwy.rphone",
        targets = listOf(
            AppTarget(
                version = "0.5.6"
            )
        )
    )

    val COMPATIBILITY_XAPKEXTRACTOR = Compatibility(
        name = "XAPK Extractor",
        packageName = "com.ytheekshana.apkextractor",
        targets = listOf(
            AppTarget(
                version = "1.8.9",
            )
        )
    )
}
