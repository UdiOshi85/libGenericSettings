package com.oshi.libgenericsettings;

import android.databinding.BindingAdapter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatSeekBar;

public class BindingAdapterHelper {

    @BindingAdapter({"app:srcCompat"})
    public static void setImageViewResource(AppCompatImageView imageView, int resId) {
        imageView.setImageResource(resId);
    }

    @BindingAdapter({"app:seekBarColor"})
    public static void setSeekBarColor(AppCompatSeekBar seekBar, int seekBarColor) {

        if (seekBarColor != 0) {
            seekBar.getProgressDrawable().setColorFilter(new PorterDuffColorFilter(seekBarColor, PorterDuff.Mode.MULTIPLY));
        }
    }

    @BindingAdapter({"app:seekBarThumbColor"})
    public static void setSeekBarThumbColor(AppCompatSeekBar seekBar, int seekBarThumbColor) {
        if (seekBarThumbColor != 0 && Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            seekBar.getThumb().setColorFilter(new PorterDuffColorFilter(seekBarThumbColor, PorterDuff.Mode.SRC_IN));
        }
    }

    @BindingAdapter({"app:tint"})
    public static void tintAppCompatImageViewColor(AppCompatImageView imageView, int color) {
        if (color != 0) {
            imageView.setColorFilter(ContextCompat.getColor(imageView.getContext(), color), android.graphics.PorterDuff.Mode.MULTIPLY);
        }
    }
}
