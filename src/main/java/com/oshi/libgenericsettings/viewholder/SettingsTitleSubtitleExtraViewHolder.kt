package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.data.TitleSubtitleExtraData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class SettingsTitleSubtitleExtraViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<TitleSubtitleExtraData>(viewDataBinding) {

    override fun onBind(data: TitleSubtitleExtraData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.titleSubtitleExtraData, data)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.executePendingBindings()
    }

}