package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes

/**
 * Settings Title & Subtitle data. Being use in layout/view_type_title_subtitle.xml
 */
open class TitleSubtitleData(title : String, var subtitle : String) : TitleData(title) {

    @ColorRes var subtitleColor : Int = 0

    override fun getViewType(): Int {
        return VIEW_TYPE_SETTINGS_TITLE_SUBTITLE
    }
}