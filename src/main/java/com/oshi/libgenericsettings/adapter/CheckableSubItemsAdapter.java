package com.oshi.libgenericsettings.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.oshi.libgenericsettings.R;
import com.oshi.libgenericsettings.data.ExpandableTitleCheckableItemsData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;
import com.oshi.libgenericsettings.viewholder.CheckableSubItemViewHolder;

public class CheckableSubItemsAdapter extends RecyclerView.Adapter<CheckableSubItemViewHolder> {

    private final ExpandableTitleCheckableItemsData data;
    private final int parentPosition;
    private final ISettingsPresenter presenter;

    public CheckableSubItemsAdapter(ExpandableTitleCheckableItemsData data, int parentPosition, ISettingsPresenter presenter) {
        this.data = data;
        this.parentPosition = parentPosition;
        this.presenter = presenter;
    }

    @Override
    public CheckableSubItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        ViewDataBinding viewDataBinding = DataBindingUtil.inflate(layoutInflater, R.layout.view_type_checkable_sub_item, parent, false);
        return new CheckableSubItemViewHolder(viewDataBinding);
    }

    @Override
    public void onBindViewHolder(CheckableSubItemViewHolder holder, int position) {
        holder.onBind(data, parentPosition, presenter, position);
    }

    @Override
    public int getItemCount() {
        return data.getItems().size();
    }
}
