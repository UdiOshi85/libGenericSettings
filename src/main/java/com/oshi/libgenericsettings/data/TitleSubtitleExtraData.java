package com.oshi.libgenericsettings.data;

import android.support.annotation.ColorRes;

/**
 * Created by udioshi on 9/4/2017.
 */
public class TitleSubtitleExtraData extends TitleSubtitleData {

    protected String extraText;
    protected @ColorRes int extraColor;

    public TitleSubtitleExtraData(String title, String subtitle, String extraText) {
        super(title, subtitle);
        this.extraText = extraText;
    }

    public TitleSubtitleExtraData(String extraText, @ColorRes int extraColor) {
        this.extraText = extraText;
        this.extraColor = extraColor;
    }

    public TitleSubtitleExtraData(String title, String subtitle, String extraText, @ColorRes int extraColor) {
        super(title, subtitle);
        this.extraText = extraText;
        this.extraColor = extraColor;
    }

    public TitleSubtitleExtraData(String title, String subtitle, @ColorRes int titleColor, @ColorRes int subtitleColor, String extraText, @ColorRes int extraColor) {
        super(title, subtitle, titleColor, subtitleColor);
        this.extraText = extraText;
        this.extraColor = extraColor;
    }

    public String getExtraText() {
        return extraText;
    }

    public void setExtraText(String extraText) {
        this.extraText = extraText;
    }

    public int getExtraColor() {
        return extraColor;
    }

    public void setExtraColor(@ColorRes int extraColor) {
        this.extraColor = extraColor;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA;
    }
}
