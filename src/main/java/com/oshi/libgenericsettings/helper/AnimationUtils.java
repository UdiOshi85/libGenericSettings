package com.oshi.libgenericsettings.helper;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by udioshi on 8/31/2017.
 */
public class AnimationUtils {
    public static void expand(final View v) {
        /*v.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (Build.VERSION.SDK_INT < 16) {
                    v.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    v.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }

                final int targetHeight = v.getMeasuredHeight();
                // Older versions of android (pre API 21) cancel animations for views with a height of 0.
                v.getLayoutParams().height = 1;
                Animation a = new Animation() {
                    @Override
                    protected void applyTransformation(float interpolatedTime, Transformation t) {
                        v.getLayoutParams().height = interpolatedTime == 1
                                ? ViewGroup.LayoutParams.WRAP_CONTENT
                                : (int) (targetHeight * interpolatedTime);
                        v.requestLayout();
                    }

                    @Override
                    public boolean willChangeBounds() {
                        return true;
                    }
                };

                // 1dp/ms
//        a.setDuration((int) (targetHeight / v.getContext().getResources().getDisplayMetrics().density));
                a.setDuration(500);
                v.startAnimation(a);
            }
        });*/

        v.setVisibility(View.VISIBLE);

    }

    public static void collapse(final View v) {

        v.setVisibility(View.GONE);

        /*final int initialHeight = v.getMeasuredHeight();

        Animation a = new Animation() {
            @Override
            protected void applyTransformation(float interpolatedTime, Transformation t) {
                if (interpolatedTime == 1) {
                    v.setVisibility(View.GONE);
                } else {
                    v.getLayoutParams().height = initialHeight - (int) (initialHeight * interpolatedTime);
                    v.requestLayout();
                }
            }

            @Override
            public boolean willChangeBounds() {
                return true;
            }
        };

        // 1dp/ms
//        a.setDuration((int) (initialHeight / v.getContext().getResources().getDisplayMetrics().density));
        a.setDuration(500);
        v.startAnimation(a);*/
    }
}
