package com.oshi.libgenericsettings.viewholder

import android.databinding.ViewDataBinding
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.oshi.libgenericsettings.BR
import com.oshi.libgenericsettings.R
import com.oshi.libgenericsettings.adapter.BulletsSubItemsAdapter
import com.oshi.libgenericsettings.data.ExpandableTitleSubtitleBulletItemsData
import com.oshi.libgenericsettings.helper.ViewExpander
import com.oshi.libgenericsettings.presenter.ISettingsPresenter


class SettingsExpandableTitleSubtitleBulletItemsViewHolder(viewDataBinding: ViewDataBinding) : BaseSettingsViewHolder<ExpandableTitleSubtitleBulletItemsData>(viewDataBinding), ViewExpander.OnExpandStateChangedListener {

    var clickContainer : View = viewDataBinding.root.findViewById(R.id.clickContainer)
    var expandButton : View = viewDataBinding.root.findViewById(R.id.expandButton)
    var expandableContainer : View = viewDataBinding.root.findViewById(R.id.expandableContainer)
    var itemsList : RecyclerView  = viewDataBinding.root.findViewById(R.id.itemsList)
    private lateinit var recyclerData : ExpandableTitleSubtitleBulletItemsData
    private lateinit var recycledPresenter : ISettingsPresenter
    private val viewExpander = ViewExpander(expandButton, expandableContainer)

    init {
        itemsList.setHasFixedSize(true)
        itemsList.layoutManager = LinearLayoutManager(itemsList.context, LinearLayoutManager.VERTICAL, false)
        viewExpander.onExpandStateChangedListener = this
    }

    override fun onBind(data: ExpandableTitleSubtitleBulletItemsData, presenter: ISettingsPresenter, position: Int) {
        recyclerData = data
        recycledPresenter = presenter

        viewDataBinding.setVariable(BR.expandableTitleSubtitleBulletItemsData, data)
        viewDataBinding.setVariable(BR.settingsPresenter, presenter)
        viewDataBinding.setVariable(BR.itemPosition, position)
        viewDataBinding.executePendingBindings()

        val adapter = BulletsSubItemsAdapter(data, position, presenter)
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