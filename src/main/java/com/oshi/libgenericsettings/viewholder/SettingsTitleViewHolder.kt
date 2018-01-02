package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.data.TitleData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class SettingsTitleViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<TitleData>(viewDataBinding) {

    override fun onBind(data: TitleData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.titleData, data)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.executePendingBindings()
    }

}