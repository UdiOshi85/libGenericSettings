package com.oshi.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.data.TitleSubtitleExtraCheckboxData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

/**
 * Created by udioshi on 9/6/2017.
 */

public class SettingsTitleSubtitleExtraCheckboxViewHolder extends BaseSettingsViewHolder<TitleSubtitleExtraCheckboxData> {


    public SettingsTitleSubtitleExtraCheckboxViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
    }

    @Override
    public void onBind(TitleSubtitleExtraCheckboxData data, ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.titleSubtitleExtraCheckboxData, data);
        viewDataBinding.setVariable(BR.itemPosition, position);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.executePendingBindings();
    }
}
