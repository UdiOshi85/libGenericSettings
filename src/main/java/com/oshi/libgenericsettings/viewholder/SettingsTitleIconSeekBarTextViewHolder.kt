package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import android.preference.PreferenceManager
import android.view.View
import android.widget.SeekBar
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.R
import com.oshi.libgenericsettings.data.TitleIconSeekBarTextData
import com.oshi.libgenericsettings.databinding.ViewTypeTitleIconSeekbarTextBinding
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class SettingsTitleIconSeekBarTextViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<TitleIconSeekBarTextData>(viewDataBinding), SeekBar.OnSeekBarChangeListener {

    private var binding = viewDataBinding as ViewTypeTitleIconSeekbarTextBinding
    private val sharedPrefs = PreferenceManager.getDefaultSharedPreferences(viewDataBinding.root.context)

    private lateinit var recycledData : TitleIconSeekBarTextData
    private lateinit var recycledPresenter: ISettingsPresenter

    init {
        binding.seekBar.setOnSeekBarChangeListener(this)
    }


    override fun onBind(data: TitleIconSeekBarTextData, presenter: ISettingsPresenter, position: Int) {
        recycledData = data
        recycledPresenter = presenter

        binding.setVariable(BR.titleIconSeekBarTextData, data)
        binding.setVariable(BR.itemPosition, position)
        binding.setVariable(BR.settingsPresenter, presenter)
        binding.executePendingBindings()

        updateProgressText()
    }

    override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
        if (fromUser && !recycledData.key.isNullOrEmpty()) {
            updateProgressText()
            sharedPrefs.edit().putInt(recycledData.key, seekBar.progress).apply()
            recycledPresenter.onTitleIconSeekBarTextChanged(viewDataBinding.root, recycledData, adapterPosition)
        }
    }

    private fun updateProgressText() {
        binding.progressText.text = binding.seekBar.progress.toString()
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {}

    override fun onStopTrackingTouch(seekBar: SeekBar?) {}
}