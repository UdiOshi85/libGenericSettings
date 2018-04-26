package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.R
import com.oshi.libgenericsettings.adapter.SimpleSubItemsAdapter
import com.oshi.libgenericsettings.data.ExpandableTitleSimpleItemsData
import com.oshi.libgenericsettings.data.ExpandableTitleSubtitleSimpleItemsData
import com.oshi.libgenericsettings.helper.ViewExpander
import com.oshi.libgenericsettings.presenter.ISettingsPresenter

class SettingsExpandableTitleSubtitleSimpleItemsViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<ExpandableTitleSubtitleSimpleItemsData>(viewDataBinding), ViewExpander.OnExpandStateChangedListener {

    var clickContainer : View = viewDataBinding.root.findViewById(R.id.clickContainer)
    var expandButton : View = viewDataBinding.root.findViewById(R.id.expandButton)
    var expandableContainer : View = viewDataBinding.root.findViewById(R.id.expandableContainer)
    var itemsList : RecyclerView = viewDataBinding.root.findViewById(R.id.itemsList)
    private val viewExpander = ViewExpander(expandButton, expandableContainer)
    private lateinit var recyclerData: ExpandableTitleSubtitleSimpleItemsData
    private lateinit var recycledPresenter: ISettingsPresenter

    init {
        itemsList.setHasFixedSize(true)
        itemsList.layoutManager = LinearLayoutManager(itemsList.context, LinearLayoutManager.VERTICAL, false)
        viewExpander.onExpandStateChangedListener = this
    }

    override fun onBind(data: ExpandableTitleSubtitleSimpleItemsData, presenter: ISettingsPresenter, position: Int) {
        viewDataBinding.setVariable(BR.expandableTitleSubtitleSimpleItemsData, data)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.executePendingBindings()

        val adapter = SimpleSubItemsAdapter(data, position, presenter)
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