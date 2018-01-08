package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes

/**
 * Expandable Title with Bullet (Bullet + Text) sub items. Being use in layout/view_type_expandable_title_bullet_items.xml
 */
open class ExpandableTitleBulletItemsData(val title: String, items : List<String>) : BaseExpandableData<String>(items) {

    @ColorRes var titleColor : Int = 0

    override fun getViewType(): Int {
        return VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_BULLET_ITEMS
    }
}