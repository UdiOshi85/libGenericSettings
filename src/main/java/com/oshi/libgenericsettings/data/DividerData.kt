package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes
import com.oshi.libgenericsettings.R

/**
 * Divider line. Being use in layout/view_type_divider.xml
 */


class DividerData : BaseViewTypeData() {

    @ColorRes var dividerColor : Int = R.color.divider

    companion object {

        @JvmStatic
        fun create() : DividerData {
            return DividerData()
        }

        @JvmStatic
        fun create(@ColorRes color : Int) : DividerData {
            var dividerData = DividerData()
            dividerData.dividerColor = color
            return dividerData
        }
    }

    override fun getViewType(): Int {
       return VIEW_TYPE_SETTINGS_DIVIDER
    }

}