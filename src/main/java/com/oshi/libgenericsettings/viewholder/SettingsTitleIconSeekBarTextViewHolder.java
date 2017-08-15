package com.oshi.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.data.TitleIconSeekBarTextData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

/**
 * Title, Icon, SeekBar & Progress Text
 */
public class SettingsTitleIconSeekBarTextViewHolder extends BaseSettingsViewHolder<TitleIconSeekBarTextData> {

    public SettingsTitleIconSeekBarTextViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
    }

    @Override
    public void onBind(TitleIconSeekBarTextData data, ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.titleIconSeekBarTextData, data);
        viewDataBinding.setVariable(BR.itemPosition, position);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.executePendingBindings();
    }
}
