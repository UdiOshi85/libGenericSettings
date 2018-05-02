package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes


/**
 * Title, Icon & SeekBar. Being use in layout/view_type_title_icon_seekbar_text.xml
 */
class TitleIconSeekBarTextData(var seekBarMaximumValue : Int, @DrawableRes iconResId : Int, title : String) : IconTitleData(iconResId, title) {

    @ColorRes var seekBarColor : Int = 0
    @ColorRes var seekBarThumbColor : Int = 0
    @ColorRes var progressTextColor : Int = 0

    var initialSeekBarValue : Int = 0
    set(value) {
        if (value > seekBarMaximumValue) {
            throw IllegalArgumentException("Initial value ($value) cannot be longer than maximum value ($seekBarMaximumValue)")
        } else {
            field = value
        }
    }

    override fun getViewType(): Int {
        return VIEW_TYPE_SETTINGS_TITLE_ICON_SEEKBAR
    }


}