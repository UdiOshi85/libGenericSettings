package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.data.ExpandableTitleSimpleItemsData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class SimpleSubItemViewHolder(var viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {

    fun onBind(data: ExpandableTitleSimpleItemsData, parentPosition: Int, presenter: ISettingsPresenter, subItemPosition: Int) {
        viewDataBinding.setVariable(BR.expandableTitleSimpleItemsData, data)
        viewDataBinding.setVariable(BR.parentPosition, parentPosition)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.setVariable(BR.itemPosition, subItemPosition)

        viewDataBinding.executePendingBindings()
    }

}