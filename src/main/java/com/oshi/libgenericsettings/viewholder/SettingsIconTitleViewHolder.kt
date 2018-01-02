package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import android.webkit.WebViewDatabase
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.data.IconTitleData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class SettingsIconTitleViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<IconTitleData>(viewDataBinding) {

    override fun onBind(data: IconTitleData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.iconTitleData, data)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.executePendingBindings()
    }
}