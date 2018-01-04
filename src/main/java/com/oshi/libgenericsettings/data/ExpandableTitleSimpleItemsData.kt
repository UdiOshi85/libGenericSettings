package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes

/**
 * Expandable Title with simple (Only String) sub items. Being use in layout/view_type_expandable_title_simple_items.xml
 */
open class ExpandableTitleSimpleItemsData(val title: String, items : List<String>) : BaseExpandableData<String>(items) {

    @ColorRes var titleColor : Int = 0


    override fun getViewType(): Int {
        return VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_SIMPLE_ITEMS
    }
}