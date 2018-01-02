package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes

/**
 * Title, Subtitle, Extra text & Checkbox data object. Being use in layout/view_type_title_subtitle_extra_checkbox.xml
 */
class TitleSubtitleExtraCheckboxData(title : String, subtitle : String, var extraText : String) : TitleSubtitleCheckboxData(title, subtitle) {

    @ColorRes var extraColor = 0

    override fun getViewType(): Int {
        return VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_CHECKBOX
    }

}