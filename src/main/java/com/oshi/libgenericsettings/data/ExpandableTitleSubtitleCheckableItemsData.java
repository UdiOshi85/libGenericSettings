package com.oshi.libgenericsettings.data;


import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;

import java.util.List;

public class ExpandableTitleSubtitleCheckableItemsData extends ExpandableTitleCheckableItemsData {

    protected String subtitle;
    protected @ColorRes int subtitleColor;

    public ExpandableTitleSubtitleCheckableItemsData(@NonNull String title, @NonNull String subtitle, @NonNull List<CheckableSubItem> items) {
        super(title, items);
        this.subtitle = subtitle;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getSubtitleColor() {
        return subtitleColor;
    }

    public void setSubtitleColor(int subtitleColor) {
        this.subtitleColor = subtitleColor;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS;
    }
}
