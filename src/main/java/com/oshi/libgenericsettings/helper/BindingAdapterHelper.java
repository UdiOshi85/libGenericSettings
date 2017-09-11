package com.oshi.libgenericsettings.helper;

import android.content.Context;
import android.content.res.ColorStateList;
import android.databinding.BindingAdapter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.TextView;

import com.oshi.libgenericsettings.data.TitleSwitchData;

public class BindingAdapterHelper {

    static int[][] states = new int[][] {
            new int[] {-android.R.attr.state_checked},
            new int[] {android.R.attr.state_checked},
    };

    @BindingAdapter({"srcCompat"})
    public static void setImageViewResource(AppCompatImageView imageView, int resId) {
        imageView.setImageResource(resId);
    }

    @BindingAdapter({"seekBarColor"})
    public static void setSeekBarColor(AppCompatSeekBar seekBar, int seekBarColor) {

        if (seekBarColor != 0) {
            int color = ContextCompat.getColor(seekBar.getContext(), seekBarColor);
            seekBar.getProgressDrawable().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
        }
    }

    @BindingAdapter({"seekBarThumbColor"})
    public static void setSeekBarThumbColor(AppCompatSeekBar seekBar, int seekBarThumbColor) {
        if (seekBarThumbColor != 0 && Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            int color = ContextCompat.getColor(seekBar.getContext(), seekBarThumbColor);
            seekBar.getThumb().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        }
    }

    @BindingAdapter({"tint"})
    public static void tintAppCompatImageViewColor(AppCompatImageView imageView, int color) {
        if (color != 0) {
            imageView.setColorFilter(ContextCompat.getColor(imageView.getContext(), color), PorterDuff.Mode.SRC_IN);
        }
    }

    @BindingAdapter({"textColor"})
    public static void setTextColor(TextView textView, int color) {
        if (color != 0) {
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), color));
        }
    }

    @BindingAdapter({"checkboxColor"})
    public static void setCheckboxColor(AppCompatCheckBox checkbox, int color) {
        if (color != 0) {
            checkbox.setSupportButtonTintList(ContextCompat.getColorStateList(checkbox.getContext(), color));
        }
    }

    @BindingAdapter({"backgroundColor"})
    public static void setBackgroundColor(View view, int backgroundColor) {
        if (backgroundColor != 0) {
            view.setBackgroundColor(ContextCompat.getColor(view.getContext(), backgroundColor));
        }
    }

    @BindingAdapter({"switchThumbColors"})
    public static void setSwitchThumbColor(SwitchCompat switchCompat, TitleSwitchData data) {

        if (data != null) {

            int switchThumbCheckedColor = data.getSwitchThumbCheckedColor();
            int switchThumbUncheckedColor = data.getSwitchThumbUncheckedColor();

            if (switchThumbCheckedColor != 0 && switchThumbUncheckedColor != 0) {
                Context context = switchCompat.getContext();
                int[] thumbColors = {ContextCompat.getColor(context, switchThumbUncheckedColor), ContextCompat.getColor(context, switchThumbCheckedColor)};
                DrawableCompat.setTintList(DrawableCompat.wrap(switchCompat.getThumbDrawable()), new ColorStateList(states, thumbColors));
            }
        }
    }

    @BindingAdapter({"switchTrackColors"})
    public static void setSwitchTrackColor(SwitchCompat switchCompat, TitleSwitchData data) {

        if (data != null) {

            int switchTrackCheckedColor = data.getSwitchTrackCheckedColor();
            int switchTrackUncheckedColor = data.getSwitchTrackUncheckedColor();

            if (switchTrackCheckedColor != 0 && switchTrackUncheckedColor != 0) {

                Context context =  switchCompat.getContext();
                int[] trackColors = {ContextCompat.getColor(context, switchTrackUncheckedColor), ContextCompat.getColor(context, switchTrackCheckedColor)};
                DrawableCompat.setTintList(DrawableCompat.wrap(switchCompat.getTrackDrawable()), new ColorStateList(states, trackColors));
//                int trackColor = switchCompat.isChecked() ? ContextCompat.getColor(context, switchTrackUncheckedColor) : ContextCompat.getColor(context, switchTrackCheckedColor);
//                DrawableCompat.setTint(switchCompat.getTrackDrawable(), trackColor);
            }
        }
    }
}
