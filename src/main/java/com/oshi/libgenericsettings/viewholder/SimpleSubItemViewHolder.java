package com.oshi.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.data.ExpandableTitleSimpleItemsData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

/**
 * Created by udioshi on 8/31/2017.
 */

public class SimpleSubItemViewHolder extends RecyclerView.ViewHolder {

    private ViewDataBinding viewDataBinding;

    public SimpleSubItemViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding.getRoot());
        this.viewDataBinding = viewDataBinding;
    }

    public void onBind(ExpandableTitleSimpleItemsData data, int parentPosition, ISettingsPresenter presenter, int subItemPosition) {
        viewDataBinding.setVariable(BR.expandableTitleSimpleItemsData, data);
        viewDataBinding.setVariable(BR.parentPosition, parentPosition);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.setVariable(BR.itemPosition, subItemPosition);

        viewDataBinding.executePendingBindings();
    }

}
