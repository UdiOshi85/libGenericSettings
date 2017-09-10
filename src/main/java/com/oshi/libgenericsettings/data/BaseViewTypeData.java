package com.oshi.libgenericsettings.data;

/**
 * Base POJO for recycling view types handling
 */
public abstract class BaseViewTypeData {

    public static final int VIEW_TYPE_SETTINGS_HEADER = 1;
    public static final int VIEW_TYPE_SETTINGS_TITLE_SUBTITLE = 2;
    public static final int VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_SWITCH = 3;
    public static final int VIEW_TYPE_SETTINGS_DIVIDER = 4;
    public static final int VIEW_TYPE_SETTINGS_TITLE_SWITCH = 5;
    public static final int VIEW_TYPE_CHECKBOX_TITLE_SUBTITLE = 7;
    public static final int VIEW_TYPE_SETTINGS_TITLE = 8;
    public static final int VIEW_TYPE_SETTINGS_ICON_TITLE = 9;
    public static final int VIEW_TYPE_SETTINGS_TITLE_SECONDARY_TITLE = 10;
    public static final int VIEW_TYPE_SETTINGS_TITLE_ICON_SEEKBAR = 11;
    public static final int VIEW_TYPE_SETTINGS_TITLE_UP_DOWN_VALUE = 12;
    public static final int VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_ITEMS_ACTION = 13;
    public static final int VIEW_TYPE_SETTINGS_TITLE_CHECKBOX = 14;
    public static final int VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA = 15;
    public static final int VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_CHECKBOX = 16;
    public static final int VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_SWITCH = 17;


    public abstract int getViewType();

}
