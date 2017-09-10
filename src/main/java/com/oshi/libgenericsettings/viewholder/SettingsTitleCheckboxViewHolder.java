package com.oshi.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.data.TitleCheckboxData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

public class SettingsTitleCheckboxViewHolder extends BaseSettingsViewHolder<TitleCheckboxData> {


    public SettingsTitleCheckboxViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
    }

    @Override
    public void onBind(TitleCheckboxData data, ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.titleCheckboxData, data);
        viewDataBinding.setVariable(BR.itemPosition, position);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.executePendingBindings();
    }
}
