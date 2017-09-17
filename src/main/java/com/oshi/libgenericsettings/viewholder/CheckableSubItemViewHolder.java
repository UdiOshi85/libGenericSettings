package com.oshi.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.data.ExpandableTitleCheckableItemsData;
import com.oshi.libgenericsettings.data.ExpandableTitleSimpleItemsData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

public class CheckableSubItemViewHolder extends RecyclerView.ViewHolder {

    private ViewDataBinding viewDataBinding;

    public CheckableSubItemViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding.getRoot());
        this.viewDataBinding = viewDataBinding;
    }

    public void onBind(ExpandableTitleCheckableItemsData data, int parentPosition, ISettingsPresenter presenter, int subItemPosition) {
        viewDataBinding.setVariable(BR.expandableTitleCheckableItemsData, data);
        viewDataBinding.setVariable(BR.parentPosition, parentPosition);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.setVariable(BR.itemPosition, subItemPosition);

        viewDataBinding.executePendingBindings();
    }

}
