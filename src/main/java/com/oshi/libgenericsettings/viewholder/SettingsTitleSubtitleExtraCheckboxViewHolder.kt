package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.data.TitleSubtitleExtraCheckboxData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class SettingsTitleSubtitleExtraCheckboxViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<TitleSubtitleExtraCheckboxData>(viewDataBinding) {

    override fun onBind(data: TitleSubtitleExtraCheckboxData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.titleSubtitleExtraCheckboxData, data)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.executePendingBindings()
    }

}