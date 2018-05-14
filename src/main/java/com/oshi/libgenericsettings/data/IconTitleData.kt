package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import com.oshi.libgenericsettings.data.BaseViewTypeData.Companion.SettingsViewTypes

/**
 * Settings Icon & Title data object. Being use in layout/view_type_icon_title.xml
 */
open class IconTitleData(@DrawableRes var iconResId : Int, title : String) : TitleData(title) {

    @ColorRes var iconColor: Int = 0

    override fun getViewType(): SettingsViewTypes {
        return SettingsViewTypes.VIEW_TYPE_SETTINGS_ICON_TITLE
    }
}