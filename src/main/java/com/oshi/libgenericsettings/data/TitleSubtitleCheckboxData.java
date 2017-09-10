package com.oshi.libgenericsettings.data;

import android.support.annotation.ColorRes;

/**
 * Settings Title, Subtitle & Checkbox. Being use in layout/view_type_title_subtitle_checkbox.xml
 */

public class TitleSubtitleCheckboxData extends TitleCheckboxData {

    protected String subtitle;
    protected @ColorRes int subtitleColor;

    public TitleSubtitleCheckboxData(String title, String subtitle, int subtitleColor) {
        super(title);
        this.subtitle = subtitle;
        this.subtitleColor = subtitleColor;
    }

    public TitleSubtitleCheckboxData(String title, boolean isEnabled, String subtitle, int subtitleColor) {
        super(title, isEnabled);
        this.subtitle = subtitle;
        this.subtitleColor = subtitleColor;
    }

    public TitleSubtitleCheckboxData(String title, int titleColor, String subtitle, int subtitleColor) {
        super(title, titleColor);
        this.subtitle = subtitle;
        this.subtitleColor = subtitleColor;
    }

    public TitleSubtitleCheckboxData(String title, String subtitle) {
        super(title);
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

    public void setSubtitleColor(@ColorRes int subtitleColor) {
        this.subtitleColor = subtitleColor;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_CHECKBOX_TITLE_SUBTITLE;
    }
}
