package com.oshi.libgenericsettings.data;

import android.support.annotation.ColorRes;

import java.util.List;


public class ExpandableTitleSubtitleSimpleItemsData extends ExpandableTitleSimpleItemsData {

    protected String subtitle;
    protected @ColorRes int subtitleColor;

    public ExpandableTitleSubtitleSimpleItemsData(String title, String subtitle, List<String> items) {
        super(title, items);
        this.subtitle = subtitle;
    }

    public int getSubtitleColor() {
        return subtitleColor;
    }

    public void setSubtitleColor(int subtitleColor) {
        this.subtitleColor = subtitleColor;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS;
    }
}
