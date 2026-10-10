package app.template.patches.xapkextractor

import app.morphe.patcher.Fingerprint

object SupporterOnCreateFingerprint : Fingerprint(
    definingClass = "Lcom/ytheekshana/apkextractor/MainActivity;",
    name = "onCreate",
    returnType = "V",
    parameters = listOf(
        "Landroid/os/Bundle;"
    )
)