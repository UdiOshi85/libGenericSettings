package com.oshi.libgenericsettings.data;

/**
 * Title, Up & Down Button and Value text. Being use in layout/view_type_title_up_down_value.xml
 */
public class TitleUpDownValueData extends TitleData {

    protected int currentValue;
    protected int valueTextColor;
    protected int upDownColor;

    public TitleUpDownValueData(String title) {
        super(title);
    }

    public TitleUpDownValueData(String title, int titleColor) {
        super(title, titleColor);
    }

    public TitleUpDownValueData(String title, int currentValue, int valueTextColor) {
        super(title);
        this.currentValue = currentValue;
        this.valueTextColor = valueTextColor;
    }

    public TitleUpDownValueData(String title, int titleColor, int currentValue, int valueTextColor) {
        super(title, titleColor);
        this.currentValue = currentValue;
        this.valueTextColor = valueTextColor;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public int getValueTextColor() {
        return valueTextColor;
    }

    public void setValueTextColor(int valueTextColor) {
        this.valueTextColor = valueTextColor;
    }

    public int getUpDownColor() {
        return upDownColor;
    }

    public void setUpDownColor(int upDownColor) {
        this.upDownColor = upDownColor;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_TITLE_UP_DOWN_VALUE;
    }
}
