package com.oshi.libgenericsettings.data;


import android.support.annotation.ColorRes;

/**
 * Settings Title & Subtitle data. Being use in layout/view_type_title_subtitle.xml
 */
public class TitleSubtitleData extends BaseViewTypeData {

    protected String title;
    protected String subtitle;
    protected @ColorRes int titleColor;
    protected @ColorRes int subtitleColor;

    public TitleSubtitleData() {

    }

    public TitleSubtitleData(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    }

    public TitleSubtitleData(String title, String subtitle, @ColorRes int titleColor, @ColorRes int subtitleColor) {
        this.title = title;
        this.subtitle = subtitle;
        this.titleColor = titleColor;
        this.subtitleColor = subtitleColor;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_TITLE_SUBTITLE;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(@ColorRes int titleColor) {
        this.titleColor = titleColor;
    }

    public int getSubtitleColor() {
        return subtitleColor;
    }

    public void setSubtitleColor(@ColorRes int subtitleColor) {
        this.subtitleColor = subtitleColor;
    }
}
