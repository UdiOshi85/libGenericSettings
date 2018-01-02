package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.data.TitleSwitchData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class SettingsTitleSwitchViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<TitleSwitchData>(viewDataBinding) {

    override fun onBind(data: TitleSwitchData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.titleSwitchData, data)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.executePendingBindings()
    }
}