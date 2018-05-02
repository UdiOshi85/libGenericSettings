package com.oshi.libgenericsettings.helper

import java.util.*

/**
 * Created by udioshi on 1/17/2018.
 */
enum class VERSIONS(val versionName : String, val versionSubtitle : String, val whatsNewItems : List<String>) {

    VERSION_1_0("Version 1.0", "Released Oct. 2017", Arrays.asList("Library created!", "Added Basic types", "Added Checkable types", "Added Switchable types")),
    VERSION_1_1("Version 1.1", "Released Nov. 2017",  Arrays.asList("Added Expandable types", "New SeekBar views available")),
    VERSION_1_2("Version 1.2", "Released Dec. 2017", Arrays.asList("Performance & Bug fixing", "Update to Google last revisions")),
    VERSION_1_3("Version 1.3", "Released Jan. 2018", Arrays.asList("Library migrated to Kotlin!", "Tutorial app UI change")),
    VERSION_1_4("Version 1.3.1", "Released Jan. 2018", Arrays.asList("Upgrade to Kotlin 1.2.20", "Bug fixing", "Performance improve")),
    VERSION_1_5_1("Version 1.5.1", "Released Apr. 2018", Arrays.asList())
}