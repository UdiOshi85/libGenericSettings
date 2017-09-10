package com.oshi.libgenericsettings.data;

import android.support.annotation.ColorRes;

/**
 * Title & Switch. Being use in layout/view_type_title_switch.xml
 */
public class TitleSwitchData extends TitleData {

    protected boolean isSwitchOn;
    protected @ColorRes int switchTrackCheckedColor = 0;
    protected @ColorRes int switchTrackUncheckedColor = 0;
    protected @ColorRes int switchThumbCheckedColor = 0;
    protected @ColorRes int switchThumbUncheckedColor = 0;

    public TitleSwitchData(String title) {
        super(title);
    }

    public TitleSwitchData(String title, boolean isSwitchOn) {
        super(title);
        this.title = title;
        this.isSwitchOn = isSwitchOn;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_TITLE_SWITCH;
    }

    public boolean isSwitchOn() {
        return isSwitchOn;
    }

    public void setSwitchOn(boolean switchOn) {
        isSwitchOn = switchOn;
    }

    public int getSwitchTrackCheckedColor() {
        return switchTrackCheckedColor;
    }

    public int getSwitchTrackUncheckedColor() {
        return switchTrackUncheckedColor;
    }

    public int getSwitchThumbCheckedColor() {
        return switchThumbCheckedColor;
    }

    public int getSwitchThumbUncheckedColor() {
        return switchThumbUncheckedColor;
    }

    public void setSwitchTrackCheckedColor(int switchTrackCheckedColor) {
        this.switchTrackCheckedColor = switchTrackCheckedColor;
    }

    public void setSwitchTrackUncheckedColor(int switchTrackUncheckedColor) {
        this.switchTrackUncheckedColor = switchTrackUncheckedColor;
    }

    public void setSwitchThumbCheckedColor(int switchThumbCheckedColor) {
        this.switchThumbCheckedColor = switchThumbCheckedColor;
    }

    public void setSwitchThumbUncheckedColor(int switchThumbUncheckedColor) {
        this.switchThumbUncheckedColor = switchThumbUncheckedColor;
    }
}
