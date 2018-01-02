package com.oshi.libgenericsettings.data

/**
 * Base POJO for recycling view types handling
 */
abstract class BaseViewTypeData {

    companion object {
        @JvmField
        val VIEW_TYPE_SETTINGS_HEADER = 1
        @JvmField
        val VIEW_TYPE_SETTINGS_TITLE_SUBTITLE = 2
        @JvmField
        val VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_SWITCH = 3
        @JvmField
        val VIEW_TYPE_SETTINGS_DIVIDER = 4
        @JvmField
        val VIEW_TYPE_SETTINGS_TITLE_SWITCH = 5
        @JvmField
        val VIEW_TYPE_CHECKBOX_TITLE_SUBTITLE = 7
        @JvmField
        val VIEW_TYPE_SETTINGS_TITLE = 8
        @JvmField
        val VIEW_TYPE_SETTINGS_ICON_TITLE = 9
        @JvmField
        val VIEW_TYPE_SETTINGS_TITLE_SECONDARY_TITLE = 10
        @JvmField
        val VIEW_TYPE_SETTINGS_TITLE_ICON_SEEKBAR = 11
        @JvmField
        val VIEW_TYPE_SETTINGS_TITLE_UP_DOWN_VALUE = 12
        @JvmField
        val VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_SIMPLE_ITEMS = 13
        @JvmField
        val VIEW_TYPE_SETTINGS_TITLE_CHECKBOX = 14
        @JvmField
        val VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA = 15
        @JvmField
        val VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_CHECKBOX = 16
        @JvmField
        val VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_SWITCH = 17
        @JvmField
        val VIEW_TYPE_SETTINGS_TITLE_SEEKBAR_MIN_MAX = 18
        @JvmField
        val VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS = 19
        @JvmField
        val VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_CHECKABLE_ITEMS = 20
        @JvmField
        val VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS = 21

    }

    abstract fun getViewType(): Int

}