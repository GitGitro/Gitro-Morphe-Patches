package app.template.patches.aidetector.unlockpro

import app.morphe.patcher.Fingerprint

object ProStatusFingerprint : Fingerprint(
    definingClass = "Ln1/m;",
    name = "f",
    returnType = "Z",
    parameters = emptyList()
)

object ProPersistenceFingerprint : Fingerprint(
    definingClass = "Ln1/m;",
    name = "a",
    returnType = "Ljava/lang/Object;",
    parameters = listOf(
        "Ln1/m;",
        "LT3/c;"
    )
)

object ProWriteFingerprint : Fingerprint(
    definingClass = "Ln1/m;",
    name = "g",
    returnType = "Ljava/lang/Object;",
    parameters = listOf(
        "Z",
        "LT3/c;"
    )
)