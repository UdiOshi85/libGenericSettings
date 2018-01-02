package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes

/**
 * Expandable Title & Subtitle with Simple (String) sub items. Being use in layout/view_type_expandable_title_subtitle_simple_items.xml
 */
class ExpandableTitleSubtitleSimpleItemsData(title : String, var subtitle: String, items : List<String>) : ExpandableTitleSimpleItemsData(title, items) {

    @ColorRes var subtitleColor : Int = 0


    override fun getViewType(): Int {
        return VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS
    }
}