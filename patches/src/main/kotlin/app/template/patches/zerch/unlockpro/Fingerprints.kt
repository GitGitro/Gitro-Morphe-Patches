package app.template.patches.zerch.unlockpro

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.literal
import com.android.tools.smali.dexlib2.AccessFlags

object ProManagerClassFingerprint : Fingerprint(
    name = "<clinit>",
    returnType = "V",
    strings = listOf("zerchpro_lifetime", "zerchpro_lifetime_newuser_35")
)

object IsProFingerprint : Fingerprint(
    classFingerprint = ProManagerClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Landroid/content/Context;"),
    filters = listOf(literal(300000L))
)