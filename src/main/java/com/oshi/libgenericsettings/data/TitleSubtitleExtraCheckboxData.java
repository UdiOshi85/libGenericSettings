package com.oshi.libgenericsettings.data;

import android.support.annotation.ColorRes;

/**
 * Title, Subtitle, Extra text & Checkbox data object. Being use in layout/view_type_title_subtitle_extra_checkbox.xml
 */
public class TitleSubtitleExtraCheckboxData extends TitleSubtitleCheckboxData {

    protected String extraText;
    protected @ColorRes int extraColor;


    public TitleSubtitleExtraCheckboxData(String title, String subtitle) {
        super(title, subtitle);
    }

    public TitleSubtitleExtraCheckboxData(String title, String subtitle, String extraText, @ColorRes int extraTextColor) {
        super(title, subtitle);
        this.extraText = extraText;
        this.extraColor = extraTextColor;
    }

    public TitleSubtitleExtraCheckboxData(String title, String subtitle, boolean isEnabled, String extraText, @ColorRes int extraTextColor) {
        super(title, subtitle);
        this.isEnabled = isEnabled;
        this.extraText = extraText;
        this.extraColor = extraTextColor;
    }

    public TitleSubtitleExtraCheckboxData(String title, String subtitle, String extra) {
        super(title, subtitle);
        this.extraText = extra;
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

    public void setExtraColor( @ColorRes int extraColor) {
        this.extraColor = extraColor;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_CHECKBOX;
    }
}
