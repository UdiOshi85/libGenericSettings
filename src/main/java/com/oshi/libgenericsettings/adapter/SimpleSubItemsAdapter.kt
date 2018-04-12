package com.oshi.libgenericsettings.adapter

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.oshi.libgenericsettings.R
import com.oshi.libgenericsettings.data.ExpandableTitleSimpleItemsData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter
import com.oshi.libgenericsettings.viewholder.SimpleSubItemViewHolder


class SimpleSubItemsAdapter(var data : ExpandableTitleSimpleItemsData, var parentPosition : Int, var presenter : ISettingsPresenter) : RecyclerView.Adapter<SimpleSubItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleSubItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val viewDataBinding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, R.layout.view_type_simple_sub_item, parent, false)

        return SimpleSubItemViewHolder(viewDataBinding)
    }

    override fun getItemCount(): Int {
        return data.items.size
    }

    override fun onBindViewHolder(holder: SimpleSubItemViewHolder, position: Int) {
        holder.onBind(data, parentPosition, presenter, position)
    }


}