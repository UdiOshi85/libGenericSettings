package com.oshi.libgenericsettings.data;


import java.util.List;

public abstract class BaseExpandableData<T> extends BaseViewTypeData {

    protected List<T> items;
    protected int itemsColor;
    protected boolean shouldShowDivider = true;
    protected int dividerColor;
    protected boolean isExpanded = false;
    protected int iconColor;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
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
}
