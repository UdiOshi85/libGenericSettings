package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes
import com.oshi.libgenericsettings.data.BaseViewTypeData.Companion.SettingsViewTypes


/**
 * Settings Title & Secondary title data object. Being use in layout/view_type_title_secondary_title.xml
 */
class TitleSecondaryTitleData(title : String, var secondaryTitle : String) : TitleData(title) {

    @ColorRes var secondaryTitleColor : Int = 0

    override fun getViewType(): SettingsViewTypes {
        return SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SECONDARY_TITLE
    }

}