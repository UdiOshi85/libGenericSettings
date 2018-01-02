package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes

/**
 * Expandable Title & Subtitle with Checkables sub items. Being use in layout/view_type_expandable_title_subtitle_checkable_items.xml
 */
class ExpandableTitleSubtitleCheckableItemsData(title : String, var subtitle : String, items : List<CheckableSubItem>) : ExpandableTitleCheckableItemsData(title, items) {

    @ColorRes var subtitleColor : Int = 0

    override fun getViewType(): Int {
        return VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS
    }

}