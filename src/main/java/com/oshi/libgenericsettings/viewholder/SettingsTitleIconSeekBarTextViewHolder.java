package com.oshi.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;
import android.widget.SeekBar;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.R;
import com.oshi.libgenericsettings.data.TitleIconSeekBarTextData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

public class SettingsTitleIconSeekBarTextViewHolder extends BaseSettingsViewHolder<TitleIconSeekBarTextData> {

    public SettingsTitleIconSeekBarTextViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
    }

    @Override
    public void onBind(final TitleIconSeekBarTextData data, ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.titleIconSeekBarTextData, data);
        viewDataBinding.setVariable(BR.itemPosition, position);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.executePendingBindings();

        SeekBar seekBar = (SeekBar) viewDataBinding.getRoot().findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    data.setSeekBarCurrentProgress(progress);
                    viewDataBinding.setVariable(BR.titleIconSeekBarTextData, data);
                    viewDataBinding.executePendingBindings();
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

    }
}
