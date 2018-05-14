package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes
import com.oshi.libgenericsettings.data.BaseViewTypeData.Companion.SettingsViewTypes


/**
 * Settings Title, Subtitle & Checkbox. Being use in layout/view_type_title_subtitle_checkbox.xml
 */
open class TitleSubtitleCheckboxData(title : String, var subtitle : String) : TitleCheckboxData(title) {

    @ColorRes var subtitleColor: Int = 0

    override fun getViewType(): SettingsViewTypes {
        return SettingsViewTypes.VIEW_TYPE_CHECKBOX_TITLE_SUBTITLE
    }

}