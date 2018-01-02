package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.data.TitleSubtitleExtraSwitchData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class SettingsTitleSubtitleExtraSwitchViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<TitleSubtitleExtraSwitchData>(viewDataBinding) {

    override fun onBind(data: TitleSubtitleExtraSwitchData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.titleSubtitleExtraSwitchData, data)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.executePendingBindings()
    }

}