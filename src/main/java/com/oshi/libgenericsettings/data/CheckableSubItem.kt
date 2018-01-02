package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes

/**
 * Checkable sub item.
 */
class CheckableSubItem(val title : String) {

    var isChecked : Boolean = false
    @ColorRes var titleColor : Int = 0
    @ColorRes var checkboxColor : Int = 0

}