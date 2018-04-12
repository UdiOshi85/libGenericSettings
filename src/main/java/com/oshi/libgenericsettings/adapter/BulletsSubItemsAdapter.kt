package com.oshi.libgenericsettings.adapter

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.oshi.libgenericsettings.R
import com.oshi.libgenericsettings.data.ExpandableTitleBulletItemsData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter
import com.oshi.libgenericsettings.viewholder.BulletsSubItemViewHolder

class BulletsSubItemsAdapter(var data : ExpandableTitleBulletItemsData, var parentPosition : Int, var presenter : ISettingsPresenter) : RecyclerView.Adapter<BulletsSubItemViewHolder>() {

    override fun getItemCount(): Int {
        return data.items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BulletsSubItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val viewDataBinding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, R.layout.view_type_bullet_sub_item, parent, false)
        return BulletsSubItemViewHolder(viewDataBinding)
    }

    override fun onBindViewHolder(holder: BulletsSubItemViewHolder, position: Int) {
        holder.onBind(data, parentPosition, presenter, position)
    }
}