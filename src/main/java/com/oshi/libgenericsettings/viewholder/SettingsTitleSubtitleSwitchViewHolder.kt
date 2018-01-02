package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.data.TitleSubtitleSwitchData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class SettingsTitleSubtitleSwitchViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<TitleSubtitleSwitchData>(viewDataBinding) {

    override fun onBind(data: TitleSubtitleSwitchData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.titleSubtitleSwitchData, data)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.executePendingBindings()
    }

}