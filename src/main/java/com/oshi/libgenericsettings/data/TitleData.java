package com.oshi.libgenericsettings.data;

/**
 * Settings Title data object. Being use in layout/view_type_title.xml
 */
public class TitleData extends BaseViewTypeData {

    protected String title;
    protected int titleColor;

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_TITLE;
    }

    public TitleData(String title) {
        this.title = title;
    }

    public TitleData(String title, int titleColor) {
        this.title = title;
        this.titleColor = titleColor;
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
}
