package com.oshi.libgenericsettings.adapter

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.oshi.libgenericsettings.R
import com.oshi.libgenericsettings.data.ExpandableTitleCheckableItemsData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter
import com.oshi.libgenericsettings.viewholder.CheckableSubItemViewHolder


class CheckableSubItemsAdapter(var data : ExpandableTitleCheckableItemsData, var parentPosition : Int, var presenter : ISettingsPresenter) : RecyclerView.Adapter<CheckableSubItemViewHolder>() {


    override fun getItemCount(): Int {
        return data.items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CheckableSubItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val viewDataBinding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, R.layout.view_type_checkable_sub_item, parent, false)

        return CheckableSubItemViewHolder(viewDataBinding)
    }

    override fun onBindViewHolder(holder: CheckableSubItemViewHolder, position: Int) {
        holder?.onBind(data, parentPosition, presenter, position)
    }

}