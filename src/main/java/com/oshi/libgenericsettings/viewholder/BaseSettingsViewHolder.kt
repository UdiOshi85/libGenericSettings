package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import com.oshi.libgenericsettings.GenericSettingsAnalytics
import com.oshi.libgenericsettings.GenericSettingsLib
import com.oshi.libgenericsettings.data.BaseViewTypeData
import com.oshi.libgenericsettings.helper.ANALYTICS_CATEGORIES
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


abstract class BaseSettingsViewHolder<in T : BaseViewTypeData>(var viewDataBinding : ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {

    init {
        GenericSettingsAnalytics.getInstance(itemView.context).sendEvent(ANALYTICS_CATEGORIES.CATEGORY_VIEW.categoryName, javaClass.simpleName)
    }

    abstract fun onBind(data: T, presenter: ISettingsPresenter, position: Int)

}