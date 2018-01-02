package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes

/**
 * Title, SeekBar with minimum & maximum values. Being use in layout/view_type_title_seekbar_min_max.xml
 */
class TitleSeekBarMinMaxData(title : String, var minValue : Int, var maxValue : Int, var progress : Int) : TitleData(title) {

    @ColorRes var seekBarColor = 0
    @ColorRes var seekBarThumbColor = 0
    @ColorRes var minMaxColor = 0

    init {
        if (progress < minValue || progress > maxValue) {
            throw IllegalArgumentException("Progress must be greater than minValue and lower than maxValue")
        }
        internalCalculateProgress(progress)
    }

    fun setInternalProgress(progress: Int) {
        this.progress = progress
    }

    fun getInternalProgress() : Int {
        return progress
    }

    fun internalCalculateProgress(progress: Int)  {
        this.progress = progress
        this.progress = getCalculatedMaxValue() - (progress - minValue)
    }

    fun getCalculatedMaxValue() : Int {
        return maxValue - minValue
    }

    fun getRealProgress() : Int {
        return progress + minValue
    }

    override fun getViewType(): Int {
        return VIEW_TYPE_SETTINGS_TITLE_SEEKBAR_MIN_MAX
    }

}