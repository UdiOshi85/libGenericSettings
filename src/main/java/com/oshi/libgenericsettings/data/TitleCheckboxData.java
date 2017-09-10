package com.oshi.libgenericsettings.data;

import android.support.annotation.ColorRes;

/**
 * Title & Checkbox data object. Being use in layout/view_type_title_checkbox.xml
 */
public class TitleCheckboxData extends TitleData {

    protected boolean isEnabled;
    protected @ColorRes int checkboxColor;

    public TitleCheckboxData(String title) {
        super(title);
    }

    public TitleCheckboxData(String title, boolean isEnabled) {
        super(title);
        this.isEnabled = isEnabled;
    }

    public TitleCheckboxData(String title, int titleColor, boolean isEnabled) {
        super(title, titleColor);
        this.isEnabled = isEnabled;
    }

    public TitleCheckboxData(String title, @ColorRes int titleColor) {
        super(title, titleColor);
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public int getCheckboxColor() {
        return checkboxColor;
    }

    public void setCheckboxColor(@ColorRes int checkboxColor) {
        this.checkboxColor = checkboxColor;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_TITLE_CHECKBOX;
    }
}
