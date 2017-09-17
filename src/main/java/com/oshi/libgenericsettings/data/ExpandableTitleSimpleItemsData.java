package com.oshi.libgenericsettings.data;

import java.util.List;

/**
 * Expandable Title with simple (Only String) sub items. Being use in layout/view_type_expandable_title_simple_itemse_items.xml
 */
public class ExpandableTitleSimpleItemsData extends BaseExpandableData<String> {

    protected String title;
    protected int titleColor;

    public ExpandableTitleSimpleItemsData(String title, List<String> items) {
        this.title = title;
        this.items = items;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(int titleColor) {
        this.titleColor = titleColor;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_SIMPLE_ITEMS;
    }
}
