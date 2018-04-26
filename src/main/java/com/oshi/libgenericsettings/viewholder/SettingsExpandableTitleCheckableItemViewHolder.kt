package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.R
import com.oshi.libgenericsettings.adapter.CheckableSubItemsAdapter
import com.oshi.libgenericsettings.data.ExpandableTitleCheckableItemsData
import com.oshi.libgenericsettings.helper.ViewExpander
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class SettingsExpandableTitleCheckableItemViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<ExpandableTitleCheckableItemsData>(viewDataBinding), ViewExpander.OnExpandStateChangedListener {

    var clickContainer : View = viewDataBinding.root.findViewById(R.id.clickContainer)
    var expandButton : View = viewDataBinding.root.findViewById(R.id.expandButton)
    var expandableContainer : View = viewDataBinding.root.findViewById(R.id.expandableContainer)
    var itemsList : RecyclerView = viewDataBinding.root.findViewById(R.id.itemsList)
    private val viewExpander = ViewExpander(expandButton, expandableContainer)
    private lateinit var recyclerData: ExpandableTitleCheckableItemsData
    private lateinit var recycledPresenter: ISettingsPresenter

    init {
        itemsList.setHasFixedSize(true)
        itemsList.layoutManager = LinearLayoutManager(itemsList.context, LinearLayoutManager.VERTICAL, false)
        viewExpander.onExpandStateChangedListener = this
    }

    override fun onBind(data: ExpandableTitleCheckableItemsData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.expandableTitleCheckableItemsData, data)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.executePendingBindings()

        val adapter = CheckableSubItemsAdapter(data, position, presenter)
        itemsList.adapter = adapter

        clickContainer.setOnClickListener {
            viewExpander.toggle()
        }
    }
    override fun onExpandStateChanged(isExpanded: Boolean) {
        recyclerData.isExpanded = isExpanded
        recycledPresenter.onExpandCollapseClicked(adapterPosition)
    }
}