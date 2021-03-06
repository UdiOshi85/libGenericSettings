package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.R
import com.oshi.libgenericsettings.adapter.SimpleSubItemsAdapter
import com.oshi.libgenericsettings.data.ExpandableTitleSubtitleSimpleItemsData
import com.oshi.libgenericsettings.helper.AnimationUtils
import com.oshi.libgenericsettings.presenter.ISettingsPresenter

class SettingsExpandableTitleSubtitleSimpleItemsViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<ExpandableTitleSubtitleSimpleItemsData>(viewDataBinding) {

    var clickContainer : View = viewDataBinding.root.findViewById(R.id.clickContainer)
    var expandButton : View = viewDataBinding.root.findViewById(R.id.expandButton)
    var expandableContainer : View = viewDataBinding.root.findViewById(R.id.expandableContainer)
    var itemsList : RecyclerView = viewDataBinding.root.findViewById(R.id.itemsList)

    init {
        itemsList.setHasFixedSize(true)
        itemsList.layoutManager = LinearLayoutManager(itemsList.context, LinearLayoutManager.VERTICAL, false)
    }

    override fun onBind(data: ExpandableTitleSubtitleSimpleItemsData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.expandableTitleSubtitleSimpleItemsData, data)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.executePendingBindings()

        val adapter = SimpleSubItemsAdapter(data, position, presenter)
        itemsList.adapter = adapter

        clickContainer.setOnClickListener {
            val isExpanded = data.isExpanded
            expandButton.animate().rotation((if (isExpanded) 0 else 180).toFloat()).start()
            if (isExpanded) {
                AnimationUtils.collapse(expandableContainer)
            } else {
                AnimationUtils.expand(expandableContainer)
            }
            data.isExpanded = !isExpanded
        }
    }
}