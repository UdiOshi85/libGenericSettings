package com.oshi.libgenericsettings.data;


import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;

import java.util.List;

public class ExpandableTitleCheckableItemsData extends BaseExpandableData<CheckableSubItem> {

    protected String title;
    protected @ColorRes int titleColor;
    protected @ColorRes int checkboxColor;

    public ExpandableTitleCheckableItemsData(@NonNull String title, @NonNull List<CheckableSubItem> items) {
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

    public int getCheckboxColor() {
        return checkboxColor;
    }

    public void setCheckboxColor(@ColorRes int checkboxColor) {
        this.checkboxColor = checkboxColor;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_CHECKABLE_ITEMS;
    }
}
