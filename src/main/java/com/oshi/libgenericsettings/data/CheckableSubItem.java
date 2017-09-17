package com.oshi.libgenericsettings.data;


import android.support.annotation.ColorRes;

public class CheckableSubItem {

    protected String title;
    protected @ColorRes int titleColor;
    protected @ColorRes int checkboxColor;
    protected boolean isChecked;

    public CheckableSubItem() {
    }

    public CheckableSubItem(String title) {
        this.title = title;
    }

    public CheckableSubItem(String title, int titleColor, int checkboxColor, boolean isChecked) {
        this.title = title;
        this.titleColor = titleColor;
        this.checkboxColor = checkboxColor;
        this.isChecked = isChecked;
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

    public int getCheckboxColor() {
        return checkboxColor;
    }

    public void setCheckboxColor(int checkboxColor) {
        this.checkboxColor = checkboxColor;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
