package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.data.DividerData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class SettingsDividerViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<DividerData>(viewDataBinding) {

    override fun onBind(data: DividerData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.dividerData, data)
        viewDataBinding.executePendingBindings()
    }

}