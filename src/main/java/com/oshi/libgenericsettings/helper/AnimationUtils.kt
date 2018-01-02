package com.oshi.libgenericsettings.helper

import android.view.View

/**
 * Created by udioshi on 12/28/2017.
 */
class AnimationUtils {

    companion object {

        @JvmStatic
        fun expand(view : View) {
            view.visibility = View.VISIBLE
        }

        @JvmStatic
        fun collapse(view : View) {
            view.visibility = View.GONE
        }

    }

}