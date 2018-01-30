package com.oshi.libgenericsettings

import android.content.Context

/**
 * Created by udioshi on 1/30/2018.
 */
class GenericSettingsLib {


    companion object {

        private lateinit var genericSettingsAnalytics : GenericSettingsAnalytics

        fun init(context: Context) {
            initAnalytics(context)
        }

        private fun initAnalytics(context: Context) {
            genericSettingsAnalytics = GenericSettingsAnalytics.getInstance(context.applicationContext)
        }

        fun getGenericSettingsAnalytics(context: Context) : GenericSettingsAnalytics  {
            if (genericSettingsAnalytics == null) {
                initAnalytics(context)
            }
            return genericSettingsAnalytics
        }
    }


}