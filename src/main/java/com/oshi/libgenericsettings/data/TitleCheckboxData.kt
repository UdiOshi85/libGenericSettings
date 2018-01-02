package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes

/**
 * Settings Title, Subtitle & Checkbox. Being use in layout/view_type_title_subtitle_checkbox.xml
 */
open class TitleCheckboxData(title: String) : TitleData(title) {

    var isEnabled : Boolean = false
    @ColorRes var checkboxColor : Int = 0

    override fun getViewType(): Int {
        return VIEW_TYPE_SETTINGS_TITLE_CHECKBOX
    }
}