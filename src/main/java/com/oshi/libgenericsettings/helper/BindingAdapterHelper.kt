package com.oshi.libgenericsettings.helper

import android.content.res.ColorStateList
import android.databinding.BindingAdapter
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.os.Build
import android.preference.PreferenceManager
import android.support.v4.content.ContextCompat
import android.support.v4.graphics.drawable.DrawableCompat
import android.support.v4.widget.CompoundButtonCompat
import android.support.v7.widget.AppCompatCheckBox
import android.support.v7.widget.AppCompatImageView
import android.support.v7.widget.AppCompatSeekBar
import android.support.v7.widget.SwitchCompat
import android.view.View
import android.widget.TextView
import com.oshi.libgenericsettings.R
import com.oshi.libgenericsettings.data.BaseViewTypeData
import com.oshi.libgenericsettings.data.ExpandableTitleBulletItemsData
import com.oshi.libgenericsettings.data.TitleSwitchData

/**
 * Created by udioshi on 12/28/2017.
 */
class BindingAdapterHelper {

    companion object {
        @JvmStatic private var states = arrayOf(intArrayOf(-android.R.attr.state_checked), intArrayOf(android.R.attr.state_checked))

        @JvmStatic
        @BindingAdapter("srcCompat")
        fun setImageViewResource(imageView: AppCompatImageView, resId: Int) {
            imageView.setImageResource(resId)
        }

        @JvmStatic
        @BindingAdapter("seekBarColor")
        fun setSeekBarColor(seekBar: AppCompatSeekBar, seekBarColor: Int) {

            if (seekBarColor != 0) {
                val color = ContextCompat.getColor(seekBar.context, seekBarColor)
                seekBar.progressDrawable.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY)
            }
        }

        @JvmStatic
        @BindingAdapter("seekBarThumbColor")
        fun setSeekBarThumbColor(seekBar: AppCompatSeekBar, seekBarThumbColor: Int) {
            if (seekBarThumbColor != 0 && Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                val color = ContextCompat.getColor(seekBar.context, seekBarThumbColor)
                seekBar.thumb.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN)
            }
        }

        @JvmStatic
        @BindingAdapter("tint")
        fun tintAppCompatImageViewColor(imageView: AppCompatImageView, color: Int) {
            if (color != 0) {
                imageView.setColorFilter(ContextCompat.getColor(imageView.context, color), PorterDuff.Mode.SRC_IN)
            }
        }

        @JvmStatic
        @BindingAdapter("textColor")
        fun setTextColor(textView: TextView, color: Int) {
            if (color != 0) {
                textView.setTextColor(ContextCompat.getColor(textView.context, color))
            }
        }

        @JvmStatic
        @BindingAdapter("buttonTint")
        fun setButtonTint(checkbox: AppCompatCheckBox, color: Int) {
            if (color != 0) {
                CompoundButtonCompat.setButtonTintList(checkbox, ContextCompat.getColorStateList(checkbox.context, color))
            }
        }

        @JvmStatic
        @BindingAdapter("backgroundColor")
        fun setBackgroundColor(view: View, backgroundColor: Int) {
            if (backgroundColor != 0) {
                view.setBackgroundColor(ContextCompat.getColor(view.context, backgroundColor))
            }
        }

        @JvmStatic
        @BindingAdapter("switchThumbColors")
        fun setSwitchThumbColor(switchCompat: SwitchCompat, data: TitleSwitchData?) {

            if (data != null) {

                val switchThumbCheckedColor = data.switchThumbCheckedColor
                val switchThumbUncheckedColor = data.switchThumbUncheckedColor

                if (switchThumbCheckedColor != 0 && switchThumbUncheckedColor != 0) {
                    val context = switchCompat.context
                    val thumbColors = intArrayOf(ContextCompat.getColor(context, switchThumbUncheckedColor), ContextCompat.getColor(context, switchThumbCheckedColor))
                    DrawableCompat.setTintList(DrawableCompat.wrap(switchCompat.thumbDrawable), ColorStateList(states, thumbColors))
                }
            }
        }

        @JvmStatic
        @BindingAdapter("switchTrackColors")
        fun setSwitchTrackColor(switchCompat: SwitchCompat, data: TitleSwitchData?) {

            if (data != null) {

                val switchTrackCheckedColor = data.switchTrackCheckedColor
                val switchTrackUncheckedColor = data.switchTrackUncheckedColor

                if (switchTrackCheckedColor != 0 && switchTrackUncheckedColor != 0) {

                    val context = switchCompat.context
                    val trackColors = intArrayOf(ContextCompat.getColor(context, switchTrackUncheckedColor), ContextCompat.getColor(context, switchTrackCheckedColor))
                    DrawableCompat.setTintList(DrawableCompat.wrap(switchCompat.trackDrawable), ColorStateList(states, trackColors))
                }
            }
        }

        @JvmStatic
        @BindingAdapter("textWithBullet")
        fun setTextWithBullet(textView : TextView, text: String) {
            textView.text = textView.context.getString(R.string.bullet).plus(" ").plus(text)
        }

        @JvmStatic
        @BindingAdapter("checked")
        fun setChecked(checkbox: AppCompatCheckBox, key : String?) {
            if (!key.isNullOrBlank()) {
                val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(checkbox.context)
                val value = sharedPreferences.getBoolean(key, false)
                GLog.d("Fetch $key with $value")
                checkbox.isChecked = value
            }
        }

        @JvmStatic
        @BindingAdapter("checked")
        fun setChecked(switch: SwitchCompat, key : String?) {
            if (!key.isNullOrBlank()) {
                val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(switch.context)
                val value = sharedPreferences.getBoolean(key, false)
                GLog.d("Fetch $key with $value")
                switch.isChecked = value
            }
        }
    }

}