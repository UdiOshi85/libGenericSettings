package com.oshi.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.AppCompatSeekBar;
import android.widget.SeekBar;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.R;
import com.oshi.libgenericsettings.data.TitleSeekBarMinMaxData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

public class SettingsTitleSeekbarMinMaxViewHolder extends BaseSettingsViewHolder<TitleSeekBarMinMaxData> {

    private AppCompatSeekBar appCompatSeekBar;

    public SettingsTitleSeekbarMinMaxViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);

        appCompatSeekBar = viewDataBinding.getRoot().findViewById(R.id.seekBar);
    }

    @Override
    public void onBind(final TitleSeekBarMinMaxData data, final ISettingsPresenter presenter, final int position) {
        viewDataBinding.setVariable(BR.titleSeekBarMinMaxData, data);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.setVariable(BR.itemPosition, position);
        viewDataBinding.executePendingBindings();

        appCompatSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    data.setInternalProgress(progress);
                    presenter.onTitleSeekBarMinMaxChanged(viewDataBinding.getRoot(), data, position);
                    // Do not execute pending binding as progress is need to be initiated only once
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
