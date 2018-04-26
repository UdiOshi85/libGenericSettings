package com.oshi.libgenericsettings.helper

import android.view.View
import android.view.ViewTreeObserver
import kotlin.reflect.KClass


fun <T : KClass<*>> T.tag():String = java.simpleName ?: ""

fun <T : Any> T.tag():String = this::class.tag()


inline fun <T : View> T.onPreDraw(crossinline f: T.() -> Boolean) {
    viewTreeObserver.addOnPreDrawListener(object : ViewTreeObserver.OnPreDrawListener {
        override fun onPreDraw(): Boolean {
            return if (width != 0 && height != 0) {
                viewTreeObserver.removeOnPreDrawListener(this)
                f()

            } else {
                true
            }
        }
    })
}

inline fun <T : View> T.afterMeasured(crossinline f: T.() -> Unit) {
    viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
        override fun onGlobalLayout() {
            if (measuredWidth > 0) {
                viewTreeObserver.removeOnGlobalLayoutListener(this)
                f()
            }
        }
    })
}