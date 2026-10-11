package app.template.patches.filetreesize.disableanalytics

import app.morphe.patcher.Fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

object AnalyticsLogEventFingerprint : Fingerprint(
    definingClass = "Lcom/google/android/gms/internal/measurement/zzez;",
    name = "zzX",
    accessFlags = listOf(AccessFlags.PRIVATE, AccessFlags.FINAL),
    returnType = "V",
    parameters = listOf(
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        "Landroid/os/Bundle;",
        "Z",
        "Z",
        "Ljava/lang/Long;",
        "Ljava/lang/Long;"
    )
)