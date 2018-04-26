package com.oshi.libgenericsettings.helper

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.util.Log
import android.view.View
import android.view.ViewGroup

class ViewExpander(private val arrowView : View, val expandableContainer : View) {

    var isAnimating = false
    var onExpandStateChangedListener : OnExpandStateChangedListener? = null
    var animator : Animator? = null
    var initialFixHeight = -1

    fun toggle() {
        Log.d(tag(), "Toggling...")

        if (isAnimating) {
            isAnimating = false

            animator?.end()

            expandableContainer.post { toggle() }
        } else {
            isAnimating = true

            val shouldExpand = expandableContainer.visibility == View.GONE

            if (shouldExpand) {
                expandableContainer.afterMeasured {
                    // Hide the view for preventing a flash
                    if (expandableContainer.layoutParams.height > 0) {
                        initialFixHeight = expandableContainer.layoutParams.height
                    }

                    expandableContainer.layoutParams.height = 0
                    expandableContainer.requestLayout()

                    animate(true)

                }
                expandableContainer.visibility = View.VISIBLE

            } else {
                    animate(false)
            }
        }
    }

    private fun animate(shouldExpand : Boolean) {
        val startHeight = if (shouldExpand) 0 else expandableContainer.height
        val endHeight = if (shouldExpand) expandableContainer.height else 0

        Log.d(tag(), "Starting animate from $startHeight to $endHeight")

        val valueAnimator = ValueAnimator.ofInt(startHeight, endHeight)
        valueAnimator.addUpdateListener { animation ->
            expandableContainer.layoutParams.height = animation.animatedValue as Int
            expandableContainer.requestLayout()
        }

        valueAnimator.addListener(object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator?) {}

            override fun onAnimationEnd(animation: Animator) {
                expandableContainer.post {
                    if (!shouldExpand) {
                        expandableContainer.visibility = View.GONE
                    }

                    expandableContainer.layoutParams.height = if (initialFixHeight > -1) initialFixHeight else ViewGroup.LayoutParams.WRAP_CONTENT
                    expandableContainer.post { onExpandStateChangedListener?.onExpandStateChanged(shouldExpand) }

                    isAnimating = false
                }
            }

            override fun onAnimationCancel(animation: Animator?) {}

            override fun onAnimationStart(animation: Animator?) {}

        })

        val arrowObjectAnimator = ObjectAnimator.ofFloat(arrowView, View.ROTATION, if (shouldExpand) 0F else 180F, if (shouldExpand) 180F else 0F)
        val animatorSet = AnimatorSet().apply {
            playTogether(valueAnimator, arrowObjectAnimator)
            duration = ANIMATION_DURATION
        }

        animator = animatorSet
        animatorSet.start()

    }

    companion object {
        const val ANIMATION_DURATION = 100L
    }

    interface OnExpandStateChangedListener {
        fun onExpandStateChanged(isExpanded : Boolean)
    }

}