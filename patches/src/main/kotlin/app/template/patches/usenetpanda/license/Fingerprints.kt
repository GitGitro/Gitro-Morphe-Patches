package app.template.patches.usenetpanda.license

import app.morphe.patcher.Fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

val LicenseClientCheckInternalFingerprint = Fingerprint(
    definingClass = "Lcom/pairip/licensecheck/LicenseClient;",
    name = "checkLicenseInternal",
    parameters = listOf("Landroid/os/IBinder;"),
    returnType = "V",
    accessFlags = listOf(AccessFlags.PRIVATE)
)