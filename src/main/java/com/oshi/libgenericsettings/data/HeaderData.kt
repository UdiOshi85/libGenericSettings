package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes

/**
 * Settings Header data object. Being use in layout/view_type_header.xml
 */
class HeaderData(var headerName : String) : BaseViewTypeData() {

    @ColorRes var headerColor : Int = 0

    override fun getViewType(): Int {
         return VIEW_TYPE_SETTINGS_HEADER
    }


}