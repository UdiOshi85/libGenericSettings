package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.data.ExpandableTitleBulletItemsData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class BulletsSubItemViewHolder(var viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {

    fun onBind(data: ExpandableTitleBulletItemsData, parentPosition: Int, presenter: ISettingsPresenter, subItemPosition: Int) {
        viewDataBinding.setVariable(BR.expandableTitleBulletItemsData, data)
        viewDataBinding.setVariable(BR.parentPosition, parentPosition)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.setVariable(BR.itemPosition, subItemPosition)

        viewDataBinding.executePendingBindings()
    }

}