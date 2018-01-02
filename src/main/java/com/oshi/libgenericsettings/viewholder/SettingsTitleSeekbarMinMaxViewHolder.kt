package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import android.support.v7.widget.AppCompatSeekBar
import android.widget.SeekBar
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.R
import com.oshi.libgenericsettings.data.TitleSeekBarMinMaxData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter

class SettingsTitleSeekbarMinMaxViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<TitleSeekBarMinMaxData>(viewDataBinding) {

    var appCompatSeekBar : AppCompatSeekBar = viewDataBinding.root.findViewById(R.id.seekBar)

    override fun onBind(data: TitleSeekBarMinMaxData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.titleSeekBarMinMaxData, data)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.executePendingBindings()

        appCompatSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                if (fromUser) {
                    data.setInternalProgress(progress)
                    presenter.onTitleSeekBarMinMaxChanged(viewDataBinding.root, data, position)
                    // Do not execute pending binding as progress is need to be initiated only once
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })
    }

}