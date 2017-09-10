package com.oshi.libgenericsettings.data;

import android.support.annotation.ColorRes;

/**
 * Title, Subtitle & an extra text. Being use in layout/
 */
public class TitleSubtitleExtraSwitchData extends TitleSubtitleSwitchData {

    protected String extra;
    protected @ColorRes int extraColor;

    public TitleSubtitleExtraSwitchData(String title, String subtitle, String extra) {
        super(title, subtitle);
        this.extra = extra;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public int getExtraColor() {
        return extraColor;
    }

    public void setExtraColor(int extraColor) {
        this.extraColor = extraColor;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_SWITCH;
    }
}
