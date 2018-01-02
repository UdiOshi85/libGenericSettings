package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import android.view.View
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.R
import com.oshi.libgenericsettings.data.TitleUpDownValueData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter

class SettingsTitleUpDownValueViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<TitleUpDownValueData>(viewDataBinding) {

    override fun onBind(data: TitleUpDownValueData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.titleUpDownValueDataData, data)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.executePendingBindings()

        val downView = viewDataBinding.root.findViewById<View>(R.id.downIcon)
        downView.setOnClickListener {
            var currentValue = data.currentValue
            --currentValue
            data.currentValue = currentValue
            viewDataBinding.setVariable(BR.titleUpDownValueDataData, data)
            viewDataBinding.executePendingBindings()

            presenter.onTitleUpDownValueChanged(viewDataBinding.root, data, adapterPosition)
        }

        val upView = viewDataBinding.root.findViewById<View>(R.id.upIcon)
        upView.setOnClickListener {
            var currentValue = data.currentValue
            ++currentValue
            data.currentValue = currentValue
            viewDataBinding.setVariable(BR.titleUpDownValueDataData, data)
            viewDataBinding.executePendingBindings()

            presenter.onTitleUpDownValueChanged(viewDataBinding.root, data, adapterPosition)
        }
    }

}