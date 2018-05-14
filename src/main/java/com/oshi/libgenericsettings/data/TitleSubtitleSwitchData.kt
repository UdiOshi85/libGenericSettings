package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes
import com.oshi.libgenericsettings.data.BaseViewTypeData.Companion.SettingsViewTypes

/**
 * Title, Subtitle & Switch. Being use in layout/view_type_title_subtitle_switch.xml
 */
open class TitleSubtitleSwitchData(title : String, var subtitle : String) : TitleSwitchData(title) {

    @ColorRes var subtitleColor : Int = 0

    override fun getViewType(): SettingsViewTypes {
        return SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_SWITCH
    }
}