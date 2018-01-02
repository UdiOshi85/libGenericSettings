package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes

/**
 * Expandable Title with checkable (Checkbox) sub items. Being use in layout/view_type_expandable_title_checkable_items.xml
 */
open class ExpandableTitleCheckableItemsData(val title: String, items : List<CheckableSubItem>) : BaseExpandableData<CheckableSubItem>(items) {

    @ColorRes var titleColor : Int = 0
    @ColorRes var checkboxColor : Int = 0


    override fun getViewType(): Int {
        return VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_CHECKABLE_ITEMS
    }
}