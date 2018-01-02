package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.data.TitleSecondaryTitleData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter

class SettingsTitleSecondaryTitleViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<TitleSecondaryTitleData>(viewDataBinding) {

    override fun onBind(data: TitleSecondaryTitleData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.titleSecondaryTitleData, data)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.executePendingBindings()
    }

}