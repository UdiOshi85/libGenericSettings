package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import android.widget.SeekBar
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.GenericSettings
import com.oshi.libgenericsettings.data.TitleIconSeekBarTextData
import com.oshi.libgenericsettings.databinding.ViewTypeTitleIconSeekbarTextBinding
import com.oshi.libgenericsettings.presenter.ISettingsPresenter
import com.oshi.libgenericsettings.GenericSettings.get
import com.oshi.libgenericsettings.GenericSettings.set


class SettingsTitleIconSeekBarTextViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<TitleIconSeekBarTextData>(viewDataBinding), SeekBar.OnSeekBarChangeListener {

    private var binding = viewDataBinding as ViewTypeTitleIconSeekbarTextBinding

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
            val prefs = GenericSettings.defaultPrefs(seekBar.context)
            prefs[recycledData.key!!] = seekBar.progress

//            sharedPrefs.edit().putInt(recycledData.key, seekBar.progress).apply()
            recycledPresenter.onTitleIconSeekBarTextChanged(viewDataBinding.root, recycledData, adapterPosition)
        } else {
            // No key, lets just update the text near seek bar
            updateProgressText()
        }
    }

    private fun updateProgressText() {
        binding.progressText.text = binding.seekBar.progress.toString()
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {}

    override fun onStopTrackingTouch(seekBar: SeekBar?) {}
}