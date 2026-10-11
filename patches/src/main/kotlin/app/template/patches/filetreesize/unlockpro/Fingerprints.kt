package app.template.patches.filetreesize.unlockpro

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.fieldAccess

object QueryPurchasesCallbackFingerprint : Fingerprint(
    strings = listOf("Query purchases failed: "),
    filters = listOf(
        fieldAccess(definingClass = "Ly40;", name = "b", type = "Lnl6;"),
        fieldAccess(smali = "Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;"),
    )
)