package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.data.TitleCheckboxData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter

class SettingsTitleCheckboxViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<TitleCheckboxData>(viewDataBinding) {

    override fun onBind(data: TitleCheckboxData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.titleCheckboxData, data)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.executePendingBindings()
    }
}