package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes
import com.oshi.libgenericsettings.data.BaseViewTypeData.Companion.SettingsViewTypes

/**
 * Title, Up & Down Button and Value text. Being use in layout/view_type_title_up_down_value.xml
 */
class TitleUpDownValueData(title : String, var currentValue : Int) : TitleData(title) {

    @ColorRes var valueTextColor : Int = 0
    @ColorRes var upDownColor : Int = 0

    override fun getViewType(): SettingsViewTypes {
        return SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_UP_DOWN_VALUE
    }

}