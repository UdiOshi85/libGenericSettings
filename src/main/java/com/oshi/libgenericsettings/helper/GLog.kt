package com.oshi.libgenericsettings.helper

import android.util.Log
import com.oshi.libgenericsettings.BuildConfig

class GLog {

    companion object {
        private const val TAG = "GenericSettingsLibrary"

        fun d(str: String) {
            if (BuildConfig.DEBUG) {
                val log = getClassAndMethodName() + ": " + str
                Log.d(TAG, log)
            }
        }

        fun error(str: String) {
            if (BuildConfig.DEBUG) {
                val log = getClassAndMethodName() + ": " + str
                Log.e(TAG, log)
            }
        }

        fun warning(str: String) {
            if (BuildConfig.DEBUG) {
                val log = getClassAndMethodName() + ": " + str
                Log.w(TAG, log)
            }
        }


        private fun getClassAndMethodName(): String {
            try {
                val stackTraceElement = Thread.currentThread().stackTrace[4]

                var className = stackTraceElement.className
                val index1 = className.lastIndexOf('.')
                if (index1 > -1) {
                    val index2 = className.lastIndexOf('.', index1 - 1)
                    if (index2 > -1) {
                        val index3 = className.lastIndexOf('.', index2 - 1)
                        if (index3 > -1) {
                            //Logger.debug("index123: " + index1 + " " + index2 + " " + index3 + " " + className + ":" + className.substring(index3 + 1));
                            className = className.substring(index3 + 1)
                        }
                    }
                }
                val methodName = stackTraceElement.methodName

                return "$className.$methodName"
            } catch (e: Exception) {
                return "unknown"
            }

        }
    }
}