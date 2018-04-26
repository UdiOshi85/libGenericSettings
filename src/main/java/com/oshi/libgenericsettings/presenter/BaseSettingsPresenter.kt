package com.oshi.libgenericsettings.presenter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import com.oshi.libgenericsettings.data.*

/**
 * A custom base settings provider which overrides all available types.
 * You should extend this class and override your specific methods.
 */
open class BaseSettingsPresenter(val recyclerView : RecyclerView) : ISettingsPresenter {

    override fun onTitleSubtitleSwitchClick(view: View, data: TitleSubtitleSwitchData, position: Int) {}

    override fun onTitleSubtitleClick(view: View, data: TitleSubtitleData, position: Int) {}

    override fun onTitleSwitchClick(view: View, data: TitleSwitchData, position: Int) {}

    override fun onCheckboxTitleSubtitleClick(view: View, data: TitleSubtitleCheckboxData, position: Int) {}

    override fun onTitleClick(view: View, data: TitleData, position: Int) {}

    override fun onIconTitleClick(view: View, data: IconTitleData, position: Int) {}

    override fun onTitleSecondaryTitleClick(view: View, data: TitleSecondaryTitleData, position: Int) {}

    override fun onTitleIconSeekBarTextChanged(view: View, data: TitleIconSeekBarTextData, position: Int) {}

    override fun onTitleUpDownValueChanged(view: View, data: TitleUpDownValueData, position: Int) {}

    override fun onExpandableSimpleItemClicked(view: View, data: ExpandableTitleSimpleItemsData, parentPosition: Int, subItemPosition: Int) {}

    override fun onExpandableCheckableItemClicked(view: View, data: ExpandableTitleCheckableItemsData, parentPosition: Int, subItemPosition: Int) {}

    override fun onTitleCheckboxClick(view: View, data: TitleCheckboxData, position: Int) {}

    override fun onTitleSubtitleExtraClick(view: View, data: TitleSubtitleExtraData, position: Int) {}

    override fun onTitleSubtitleExtraCheckboxClick(view: View, data: TitleSubtitleExtraCheckboxData, position: Int) {}

    override fun onTitleSubtitleExtraSwitchClick(view: View, data: TitleSubtitleExtraSwitchData, position: Int) {}

    override fun onTitleSeekBarMinMaxChanged(view: View, data: TitleSeekBarMinMaxData, position: Int) {}

    override fun onExpandableBulletItemClicked(view: View, data: ExpandableTitleBulletItemsData, parentPosition: Int, subItemPosition: Int) {}

    override fun getItems(context: Context): List<BaseViewTypeData> {
        return emptyList()
    }

    override fun onExpandCollapseClicked(position: Int) {
        recyclerView.smoothScrollToPosition(position)
    }
}