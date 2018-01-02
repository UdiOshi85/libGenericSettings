package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes

/**
 * Settings Title data object. Being use in layout/view_type_title.xml
 */
open class TitleData(var title: String) : BaseViewTypeData() {

    @ColorRes var titleColor: Int = 0

    override fun getViewType(): Int {
        return VIEW_TYPE_SETTINGS_TITLE
    }

}