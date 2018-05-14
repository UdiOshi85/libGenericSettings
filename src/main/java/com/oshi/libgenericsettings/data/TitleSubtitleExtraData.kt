package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes
import com.oshi.libgenericsettings.data.BaseViewTypeData.Companion.SettingsViewTypes

/**
 * Settings Title, Subtitle & an Extra text. Being use in layout/view_type_title_subtitle_extra.xml
 */
class TitleSubtitleExtraData(title : String, subtitle : String, var extraText : String) : TitleSubtitleData(title, subtitle) {

    @ColorRes var extraColor : Int = 0

    override fun getViewType(): SettingsViewTypes {
        return SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA
    }
}