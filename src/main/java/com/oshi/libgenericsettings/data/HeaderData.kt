package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes
import com.oshi.libgenericsettings.data.BaseViewTypeData.Companion.SettingsViewTypes

/**
 * Settings Header data object. Being use in layout/view_type_header.xml
 */
class HeaderData(var headerName : String) : BaseViewTypeData() {

    @ColorRes var headerColor : Int = 0

    override fun getViewType(): SettingsViewTypes {
         return SettingsViewTypes.VIEW_TYPE_HEADER
    }


}