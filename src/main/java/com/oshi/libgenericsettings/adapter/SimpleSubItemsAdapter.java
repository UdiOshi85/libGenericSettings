package com.oshi.libgenericsettings.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.oshi.libgenericsettings.R;
import com.oshi.libgenericsettings.data.ExpandableTitleSimpleItemsData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;
import com.oshi.libgenericsettings.viewholder.SimpleSubItemViewHolder;

import java.util.List;

/**
 * Created by udioshi on 8/31/2017.
 */

public class SimpleSubItemsAdapter extends RecyclerView.Adapter<SimpleSubItemViewHolder> {

    private ExpandableTitleSimpleItemsData data;
    private int parentPosition;
    private ISettingsPresenter presenter;

    public SimpleSubItemsAdapter(ExpandableTitleSimpleItemsData data, int parentPosition, ISettingsPresenter presenter) {
        this.data = data;
        this.parentPosition = parentPosition;
        this.presenter = presenter;
    }


    @Override
    public SimpleSubItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        ViewDataBinding viewDataBinding = DataBindingUtil.inflate(layoutInflater, R.layout.view_type_simple_sub_item, parent, false);

        return new SimpleSubItemViewHolder(viewDataBinding);
    }

    @Override
    public void onBindViewHolder(SimpleSubItemViewHolder holder, int position) {
        holder.onBind(data, parentPosition, presenter, position);
    }

    @Override
    public int getItemCount() {
        return data.getItems().size();
    }

}
