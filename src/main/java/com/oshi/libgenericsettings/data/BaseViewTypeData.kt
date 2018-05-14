package com.oshi.libgenericsettings.data

import android.support.annotation.LayoutRes
import com.oshi.libgenericsettings.R

/**
 * Base POKO for recycling view types handling
 */
abstract class BaseViewTypeData() {

    var key : String? = null

    companion object {

        enum class SettingsViewTypes(@LayoutRes val layoutResId : Int) {
            VIEW_TYPE_HEADER(R.layout.view_type_header),
            VIEW_TYPE_SETTINGS_TITLE_SUBTITLE(R.layout.view_type_title_subtitle),
            VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_SWITCH(R.layout.view_type_title_subtitle_switch),
            VIEW_TYPE_SETTINGS_DIVIDER(R.layout.view_type_divider),
            VIEW_TYPE_SETTINGS_TITLE_SWITCH(R.layout.view_type_title_switch),
            VIEW_TYPE_CHECKBOX_TITLE_SUBTITLE(R.layout.view_type_title_subtitle_checkbox),
            VIEW_TYPE_SETTINGS_TITLE(R.layout.view_type_title),
            VIEW_TYPE_SETTINGS_ICON_TITLE(R.layout.view_type_icon_title),
            VIEW_TYPE_SETTINGS_TITLE_SECONDARY_TITLE(R.layout.view_type_title_secondary_title),
            VIEW_TYPE_SETTINGS_TITLE_ICON_SEEKBAR(R.layout.view_type_title_icon_seekbar_text),
            VIEW_TYPE_SETTINGS_TITLE_UP_DOWN_VALUE(R.layout.view_type_title_up_down_value),
            VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA(R.layout.view_type_title_subtitle_extra),
            VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_CHECKBOX(R.layout.view_type_title_subtitle_extra_checkbox),
            VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_SWITCH(R.layout.view_type_title_subtitle_extra_switch),
            VIEW_TYPE_SETTINGS_TITLE_CHECKBOX(R.layout.view_type_title_checkbox)
        }
    }

    abstract fun getViewType(): SettingsViewTypes

}