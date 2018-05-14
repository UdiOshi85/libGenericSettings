package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes
import com.oshi.libgenericsettings.data.BaseViewTypeData.Companion.SettingsViewTypes


/**
 * Settings Title & Subtitle data. Being use in layout/view_type_title_subtitle.xml
 */
open class TitleSubtitleData(title : String, var subtitle : String) : TitleData(title) {

    @ColorRes var subtitleColor : Int = 0

    override fun getViewType(): SettingsViewTypes {
        return SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE
    }
}