package com.oshi.libgenericsettings.data

import android.support.annotation.ColorRes

/**
 * Created by udioshi on 12/24/2017.
 */
abstract class BaseExpandableData<T>(var items : List<T>) : BaseViewTypeData() {

    @ColorRes var itemsColor : Int = 0
    @ColorRes var dividerColor : Int = 0
    @ColorRes var iconColor : Int = 0
    var isExpanded : Boolean = false
    var shouldShowDivider : Boolean = false


}