package app.template.patches.rightgallery

import app.morphe.patcher.Fingerprint

object IsProFingerprint : Fingerprint(
    definingClass = "Lcom/goodwy/commons/extensions/ContextKt;",
    name = "isPro",
    returnType = "Z",
    parameters = listOf("Landroid/content/Context;")
)