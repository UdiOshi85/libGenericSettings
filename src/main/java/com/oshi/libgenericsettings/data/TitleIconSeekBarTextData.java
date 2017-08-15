package com.oshi.libgenericsettings.data;

/**
 * Title, Icon & SeekBar. Being use in layout/view_type_title_icon_seekbar.xml
 */
public class TitleIconSeekBarTextData extends IconTitleData {

    private int seekBarMaximumValue;
    private int seekBarCurrentProgress = 0;
    private int seekBarColor;

    public TitleIconSeekBarTextData(int iconResId, String title, int titleColor) {
        super(iconResId, title, titleColor);
    }

    public TitleIconSeekBarTextData(int iconResId, String title) {
        super(iconResId, title);
    }

    public int getSeekBarMaximumValue() {
        return seekBarMaximumValue;
    }

    public void setSeekBarMaximumValue(int seekBarMaximumValue) {
        this.seekBarMaximumValue = seekBarMaximumValue;
    }

    public int getSeekBarCurrentProgress() {
        return seekBarCurrentProgress;
    }

    public void setSeekBarCurrentProgress(int seekBarCurrentProgress) {
        this.seekBarCurrentProgress = seekBarCurrentProgress;
    }

    public int getSeekBarColor() {
        return seekBarColor;
    }

    public void setSeekBarColor(int seekBarColor) {
        this.seekBarColor = seekBarColor;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_TITLE_ICON_SEEKBAR;
    }

    /*public void onValueChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
        if (fromUser) {
            setSeekBarCurrentProgress(progresValue);
        }
    }*/
}