package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import android.support.v7.widget.AppCompatSeekBar
import android.widget.SeekBar
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.R
import com.oshi.libgenericsettings.data.TitleSeekBarMinMaxData
import com.oshi.libgenericsettings.databinding.ViewTypeTitleSeekbarMinMaxBinding
import com.oshi.libgenericsettings.presenter.ISettingsPresenter

class SettingsTitleSeekbarMinMaxViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<TitleSeekBarMinMaxData>(viewDataBinding), SeekBar.OnSeekBarChangeListener {

    private var binding = viewDataBinding as ViewTypeTitleSeekbarMinMaxBinding

    private lateinit var recycledData : TitleSeekBarMinMaxData
    private lateinit var recycledPresenter: ISettingsPresenter

    init {
        binding.seekBar.setOnSeekBarChangeListener(this)
    }

    override fun onBind(data: TitleSeekBarMinMaxData, presenter: ISettingsPresenter, position: Int) {
        recycledData = data
        recycledPresenter = presenter

        viewDataBinding.setVariable(BR.titleSeekBarMinMaxData, data)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.executePendingBindings()

    }

    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        if (fromUser) {
            recycledData.setInternalProgress(progress)
            recycledPresenter.onTitleSeekBarMinMaxChanged(viewDataBinding.root, recycledData, adapterPosition)
            // Do not execute pending binding as progress is need to be initiated only once
        }
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {}

    override fun onStopTrackingTouch(seekBar: SeekBar?) {}
}