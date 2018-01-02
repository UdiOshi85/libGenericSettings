package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import android.view.View
import android.widget.SeekBar
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.R
import com.oshi.libgenericsettings.data.TitleIconSeekBarTextData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class SettingsTitleIconSeekBarTextViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<TitleIconSeekBarTextData>(viewDataBinding) {

    override fun onBind(data: TitleIconSeekBarTextData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.titleIconSeekBarTextData, data)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.executePendingBindings()

        var seekBar = viewDataBinding.root.findViewById<View>(R.id.seekBar) as SeekBar
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                if (fromUser) {
                    data.seekBarCurrentProgress = progress
                    viewDataBinding.setVariable(BR.titleIconSeekBarTextData, data)
                    viewDataBinding.executePendingBindings()
                    presenter.onTitleIconSeekBarTextChanged(viewDataBinding.root, data, adapterPosition)
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })

    }

}