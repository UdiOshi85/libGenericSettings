package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes
import com.oshi.libgenericsettings.data.BaseViewTypeData.Companion.SettingsViewTypes

/**
 * Title & Switch. Being use in layout/view_type_title_switch.xml
 */
open class TitleSwitchData(title : String) : TitleData(title) {

    var isSwitchOn : Boolean = false
    @ColorRes var switchTrackCheckedColor = 0
    @ColorRes var switchTrackUncheckedColor = 0
    @ColorRes var switchThumbCheckedColor = 0
    @ColorRes var switchThumbUncheckedColor = 0

    override fun getViewType(): SettingsViewTypes {
        return SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SWITCH
    }

}