package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.data.TitleSubtitleCheckboxData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class SettingsCheckBoxTitleSubtitleViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<TitleSubtitleCheckboxData>(viewDataBinding) {

    override fun onBind(data: TitleSubtitleCheckboxData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.setVariable(BR.checkboxTitleSubtitle, data)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.executePendingBindings()
    }


}