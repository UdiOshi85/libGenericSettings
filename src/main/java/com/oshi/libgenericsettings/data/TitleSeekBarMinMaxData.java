package com.oshi.libgenericsettings.data;

import android.support.annotation.ColorRes;

/**
 * Created by udioshi on 9/11/2017.
 */
public class TitleSeekBarMinMaxData extends TitleData {

    protected int maxValue;
    protected int minValue;
    protected int progress = 0;
    protected @ColorRes int seekBarColor;
    protected @ColorRes int seekBarThumbColor;
    protected @ColorRes int minMaxColor;

    public TitleSeekBarMinMaxData(String title, int minValue, int maxValue, int progress) {
        super(title);
        this.maxValue = maxValue;
        this.minValue = minValue;

        if (progress < minValue || progress > maxValue) {
            throw new IllegalArgumentException("Progress must be greater than minValue and lower than maxValue");
        }

        this.progress = progress;
        internalCalculateProgress(progress);
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getInternalProgress() {
        return progress;
    }

    public int getSeekBarColor() {
        return seekBarColor;
    }

    public void setSeekBarColor(int seekBarColor) {
        this.seekBarColor = seekBarColor;
    }

    public int getSeekBarThumbColor() {
        return seekBarThumbColor;
    }

    public void setSeekBarThumbColor(int seekBarThumbColor) {
        this.seekBarThumbColor = seekBarThumbColor;
    }

    public int getCalculatedMaxValue() {
        return maxValue-minValue;
    }

    public int getMinMaxColor() {
        return minMaxColor;
    }

    public void setMinMaxColor(@ColorRes int minMaxColor) {
        this.minMaxColor = minMaxColor;
    }

    public int getRealProgress() {
        return progress + minValue;
    }

    private void internalCalculateProgress(int progress) {
        this.progress = progress;
        this.progress = getCalculatedMaxValue() - (progress-minValue);
    }

    public void setInternalProgress(int progress) {
        this.progress = progress;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE_SETTINGS_TITLE_SEEKBAR_MIN_MAX;
    }
}
