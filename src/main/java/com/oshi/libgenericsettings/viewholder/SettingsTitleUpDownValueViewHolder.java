package com.oshi.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;
import android.view.View;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.R;
import com.oshi.libgenericsettings.data.TitleUpDownValueData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

public class SettingsTitleUpDownValueViewHolder extends BaseSettingsViewHolder<TitleUpDownValueData> {

    public SettingsTitleUpDownValueViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
    }

    @Override
    public void onBind(final TitleUpDownValueData data, final ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.titleUpDownValueDataData, data);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.setVariable(BR.itemPosition, position);
        viewDataBinding.executePendingBindings();

        View downView =  viewDataBinding.getRoot().findViewById(R.id.downIcon);
        downView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentValue = data.getCurrentValue();
                --currentValue;
                data.setCurrentValue(currentValue);
                viewDataBinding.setVariable(BR.titleUpDownValueDataData, data);
                viewDataBinding.executePendingBindings();

                presenter.onTitleUpDownValueChanged(viewDataBinding.getRoot(), data, getAdapterPosition());
            }
        });

        View upView =  viewDataBinding.getRoot().findViewById(R.id.upIcon);
        upView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentValue = data.getCurrentValue();
                ++currentValue;
                data.setCurrentValue(currentValue);
                viewDataBinding.setVariable(BR.titleUpDownValueDataData, data);
                viewDataBinding.executePendingBindings();

                presenter.onTitleUpDownValueChanged(viewDataBinding.getRoot(), data, getAdapterPosition());
            }
        });

    }
}
