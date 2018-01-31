package com.oshi.libgenericsettings;

import android.content.Context;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.oshi.libgenericsettings.helper.ANALYTICS_ACTIONS;
import com.oshi.libgenericsettings.helper.ANALYTICS_CATEGORIES;

/**
 * Created by udioshi on 1/31/2018.
 */

public class GenericSettingsAnalytics {

    private static GenericSettingsAnalytics genericSettingsAnalytics;
    private Tracker tracker;

    private GenericSettingsAnalytics(Context context) {
        tracker = GoogleAnalytics.getInstance(context).newTracker(R.xml.global_tracker);
    }

    public static GenericSettingsAnalytics getInstance(Context context) {
        if (genericSettingsAnalytics == null) {
            genericSettingsAnalytics = new GenericSettingsAnalytics(context);
            genericSettingsAnalytics.sendInitAnalytics(context);
        }
        return genericSettingsAnalytics;
    }

    public void sendEvent(String category, String action) {
        tracker.send(new HitBuilders.EventBuilder().setCategory(category).setAction(action).build());
    }

    public void sendInitAnalytics(Context context) {
        tracker.send(new HitBuilders.EventBuilder()
                .setCategory(ANALYTICS_CATEGORIES.CATEGORY_APP_INFO.getCategoryName())
                .setAction(ANALYTICS_ACTIONS.ACTION_APP_INIT.getActionName())
                .setLabel(context.getPackageName())
                .build())   ;
    }
}
