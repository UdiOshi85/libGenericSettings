/*
package com.oshi.libgenericsettings

import android.content.Context
import com.google.android.gms.analytics.GoogleAnalytics
import com.google.android.gms.analytics.HitBuilders
import com.oshi.libgenericsettings.helper.ANALYTICS_ACTIONS
import com.oshi.libgenericsettings.helper.ANALYTICS_CATEGORIES


class GenericSettingsAnalytics private constructor(context : Context) {

    private val tracker = GoogleAnalytics.getInstance(context).newTracker(R.xml.global_tracker)

    companion object {

        private var instance : GenericSettingsAnalytics? = null

        fun getInstance(context: Context) : GenericSettingsAnalytics {
            if (instance == null) {
                instance = GenericSettingsAnalytics(context)
                instance!!.sendInitAnalytics(context)
            }
            return instance!!
        }
    }

    fun sendEvent(category: String, action: String) {
        tracker.send(HitBuilders.EventBuilder().setCategory(category).setAction(action).build())
    }

    fun sendInitAnalytics(context: Context) {
        tracker.send(HitBuilders.EventBuilder()
                .setCategory(ANALYTICS_CATEGORIES.CATEGORY_APP_INFO.categoryName)
                .setAction(ANALYTICS_ACTIONS.ACTION_APP_INIT.actionName)
                .setLabel(context.packageName)
                .build())
    }

}*/
