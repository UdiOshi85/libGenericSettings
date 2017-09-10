package com.oshi.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.data.TitleSubtitleCheckboxData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

public class SettingsCheckBoxTitleSubtitleViewHolder extends BaseSettingsViewHolder<TitleSubtitleCheckboxData> {

    public SettingsCheckBoxTitleSubtitleViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
    }

    @Override
    public void onBind(TitleSubtitleCheckboxData data, ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.itemPosition, position);
        viewDataBinding.setVariable(BR.checkboxTitleSubtitle, data);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.executePendingBindings();
    }
}
