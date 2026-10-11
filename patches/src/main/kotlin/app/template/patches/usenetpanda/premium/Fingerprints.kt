package app.template.patches.usenetpanda.premium

import app.morphe.patcher.Fingerprint

object IsPremiumFingerprint : Fingerprint(
    definingClass = "Lat/mann/usenetpanda/preference/a;",
    name = "k",
    returnType = "Ljava/lang/String;",
    parameters = listOf()
)

object RevokePremiumFingerprint : Fingerprint(
    definingClass = "Lk3/i;",
    name = "u",
    returnType = "V",
    parameters = listOf("Lat/mann/usenetpanda/MainActivity;")
)