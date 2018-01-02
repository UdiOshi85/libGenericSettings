package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes

/**
 * Settings Title & Secondary title data object. Being use in layout/view_type_title_secondary_title.xml
 */
class TitleSecondaryTitleData(title : String, var secondaryTitle : String) : TitleData(title) {

    @ColorRes var secondaryTitleColor : Int = 0

    override fun getViewType(): Int {
        return VIEW_TYPE_SETTINGS_TITLE_SECONDARY_TITLE
    }

}