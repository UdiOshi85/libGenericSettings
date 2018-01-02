package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.data.HeaderData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter

class SettingsHeaderViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<HeaderData>(viewDataBinding) {

    override fun onBind(data: HeaderData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.headerData, data)
        viewDataBinding.executePendingBindings()
    }

}