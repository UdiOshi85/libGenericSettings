package com.oshi.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.data.TitleSecondaryTitleData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;


public class SettingsTitleSecondaryTitleViewHolder extends BaseSettingsViewHolder<TitleSecondaryTitleData> {

    public SettingsTitleSecondaryTitleViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
    }

    @Override
    public void onBind(TitleSecondaryTitleData data, ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.titleSecondaryTitleData, data);
        viewDataBinding.setVariable(BR.itemPosition, position);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.executePendingBindings();
    }
}
