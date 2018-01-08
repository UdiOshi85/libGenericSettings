package com.oshi.libgenericsettings.data

/**
 * Expandable Title, Subtitle with Bullet (Bullet + Text) sub items. Being use in layout/view_type_expandable_title_subtitle_bullet_items.xml
*/
class ExpandableTitleSubtitleBulletItemsData(title : String, var subtitle : String, items : List<String>) : ExpandableTitleBulletItemsData(title, items) {

    var subtitleColor : Int = 0

    override fun getViewType(): Int {
        return VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_SUBTITLE_BULLET_ITEMS
    }

}