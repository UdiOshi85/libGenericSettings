package com.oshi.libgenericsettings.data;

import java.util.List;

/**
 * Expandable Title with simple (Only String) sub items. Being use in layout/view_type_expandable_title_items.xml
 */
public class ExpandableTitleSimpleItemsData extends BaseViewTypeData {

    protected String title;
    protected int titleColor;
    protected int iconColor;
    protected List<String> items;
    protected int itemsColor;
    protected boolean shouldShowDivider = true;
    protected int dividerColor;
    protected boolean isExpanded = false;


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

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public int getItemsColor() {
        return itemsColor;
    }

    public void setItemsColor(int itemsColor) {
        this.itemsColor = itemsColor;
    }

    public boolean isShouldShowDivider() {
        return shouldShowDivider;
    }

    public void setShouldShowDivider(boolean shouldShowDivider) {
        this.shouldShowDivider = shouldShowDivider;
    }

    public int getDividerColor() {
        return dividerColor;
    }

    public void setDividerColor(int dividerColor) {
        this.dividerColor = dividerColor;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }

    public int getIconColor() {
        return iconColor;
    }

    public void setIconColor(int iconColor) {
        this.iconColor = iconColor;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_ITEMS_ACTION;
    }
}
