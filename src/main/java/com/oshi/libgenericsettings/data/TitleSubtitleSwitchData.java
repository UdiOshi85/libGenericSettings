package com.oshi.libgenericsettings.data;

import android.support.annotation.ColorRes;

/**
 * Title, Subtitle & Switch. Being use in layout/view_type_title_subtitle_switch.xml
 */
public class TitleSubtitleSwitchData extends TitleSwitchData {

    protected String subtitle;
    protected @ColorRes int subtitleColor;

    public TitleSubtitleSwitchData(String title, String subtitle) {
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

    public void setSubtitleColor(int subtitleColor) {
        this.subtitleColor = subtitleColor;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_SWITCH;
    }
}
