package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes

/**
 * Title, Subtitle & an extra text. Being use in layout/view_type_title_subtitle_extra.xml
 */
class TitleSubtitleExtraSwitchData(title : String, subtitle : String, var extra : String) : TitleSubtitleSwitchData(title, subtitle) {

    @ColorRes var extraColor : Int = 0

    override fun getViewType(): Int {
        return VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_SWITCH
    }
}