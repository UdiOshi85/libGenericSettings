package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import com.oshi.libgenericsettings.BR

import com.oshi.libgenericsettings.data.ExpandableTitleCheckableItemsData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter

class CheckableSubItemViewHolder(var viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {

    fun onBind(data: ExpandableTitleCheckableItemsData, parentPosition: Int, presenter: ISettingsPresenter, subItemPosition: Int) {

        viewDataBinding.setVariable(BR.expandableTitleCheckableItemsData, data)
        viewDataBinding.setVariable(BR.parentPosition, parentPosition)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.setVariable(BR.itemPosition, subItemPosition)

        viewDataBinding.executePendingBindings()
    }
}