group = "app.template"

patches {
    about {
        name = "Gitro's Morphe Patches"
        description = "Patches for fun/to learn, nothing serious"
        source = "git@github.com:GitGitro/Gitro-Morphe-Patches.git"
        author = "Gitro"
        contact = "contact@gitro.xyz"
        website = "https://gitro.xyz"
        license = "GPLv3"
    }
}

// Separate configuration so gson is available at runtime for the
// generatePatchesList task but never bundled into the APK.
val patchListGeneratorClasspath = configurations.create("patchListGeneratorClasspath")

dependencies {
    compileOnly(libs.gson)
    patchListGeneratorClasspath(libs.gson)
}

tasks {
    register<JavaExec>("generatePatchesList") {
        description = "Build patch with patch list"

        dependsOn(build)

        classpath = sourceSets["main"].runtimeClasspath + patchListGeneratorClasspath
        mainClass.set("util.PatchListGeneratorKt")
    }

    // Used by gradle-semantic-release-plugin.
    publish {
        dependsOn("generatePatchesList")
    }
}
