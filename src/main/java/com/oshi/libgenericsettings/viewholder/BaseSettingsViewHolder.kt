package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


abstract class BaseSettingsViewHolder<T>(var viewDataBinding : ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {

    abstract fun onBind(data: T, presenter: ISettingsPresenter, position: Int)

}