package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes

/**
 * Title, Subtitle & Switch. Being use in layout/view_type_title_subtitle_switch.xml
 */
open class TitleSubtitleSwitchData(title : String, var subtitle : String) : TitleSwitchData(title) {

    @ColorRes var subtitleColor : Int = 0

    override fun getViewType(): Int {
        return VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_SWITCH
    }
}