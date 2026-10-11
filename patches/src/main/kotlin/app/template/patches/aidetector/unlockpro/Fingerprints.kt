package app.template.patches.aidetector.unlockpro

import app.morphe.patcher.Fingerprint

object ProStatusFingerprint : Fingerprint(
    definingClass = "Ln1/l;",
    name = "f",
    returnType = "Z",
    parameters = emptyList()
)

object ProPersistenceFingerprint : Fingerprint(
    definingClass = "Ln1/l;",
    name = "a",
    returnType = "Ljava/lang/Object;",
    parameters = listOf(
        "Ln1/l;",
        "LU3/c;"
    )
)

object ProWriteFingerprint : Fingerprint(
    definingClass = "Ln1/l;",
    name = "g",
    returnType = "Ljava/lang/Object;",
    parameters = listOf(
        "Z",
        "LU3/c;"
    )
)