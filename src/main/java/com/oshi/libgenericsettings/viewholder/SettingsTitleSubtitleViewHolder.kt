package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.data.TitleSubtitleData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class SettingsTitleSubtitleViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<TitleSubtitleData>(viewDataBinding) {

    override fun onBind(data: TitleSubtitleData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.titleSubtitleData, data)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.executePendingBindings()
    }

}