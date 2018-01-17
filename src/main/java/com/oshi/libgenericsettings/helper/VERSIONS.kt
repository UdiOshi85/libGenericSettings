package com.oshi.libgenericsettings.helper

import java.util.*

/**
 * Created by udioshi on 1/17/2018.
 */
enum class VERSIONS(val versionName : String, val whatsNewItems : List<String>) {

    VERSION_1_0("1.0", Arrays.asList("Library created!", "Added Basic types", "Added Checkable types", "Added Switchable types")),
    VERSION_1_1("1.1", Arrays.asList("Added Expandable types", "New SeekBar views available")),
    VERSION_1_2("1.2", Arrays.asList("Performance & Bug fixing", "Update to Google last revisions")),
    VERSION_1_3("1.3", Arrays.asList("Library migrated to Kotlin!", "Tutorial app UI change"))

}