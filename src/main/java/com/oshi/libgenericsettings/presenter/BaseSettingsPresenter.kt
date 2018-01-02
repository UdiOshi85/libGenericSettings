package com.oshi.libgenericsettings.presenter

import android.content.Context
import android.view.View
import com.oshi.libgenericsettings.data.*

/**
 * A custom base settings provider which overrides all available types.
 * You should extend this class and override your specific methods.
 */
class BaseSettingsPresenter : ISettingsPresenter {

    override fun onTitleSubtitleSwitchClick(view: View, data: TitleSubtitleSwitchData, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTitleSubtitleClick(view: View, data: TitleSubtitleData, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTitleSwitchClick(view: View, data: TitleSwitchData, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCheckboxTitleSubtitleClick(view: View, data: TitleSubtitleCheckboxData, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTitleClick(view: View, data: TitleData, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onIconTitleClick(view: View, data: IconTitleData, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTitleSecondaryTitleClick(view: View, data: TitleSecondaryTitleData, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTitleIconSeekBarTextChanged(view: View, data: TitleIconSeekBarTextData, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTitleUpDownValueChanged(view: View, data: TitleUpDownValueData, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onExpandableSimpleItemClicked(view: View, data: ExpandableTitleSimpleItemsData, parentPosition: Int, subItemPosition: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onExpandableCheckableItemClicked(view: View, data: ExpandableTitleCheckableItemsData, parentPosition: Int, subItemPosition: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTitleCheckboxClick(view: View, data: TitleCheckboxData, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTitleSubtitleExtraClick(view: View, data: TitleSubtitleExtraData, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTitleSubtitleExtraCheckboxClick(view: View, data: TitleSubtitleExtraCheckboxData, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTitleSubtitleExtraSwitchClick(view: View, data: TitleSubtitleExtraSwitchData, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTitleSeekBarMinMaxChanged(view: View, data: TitleSeekBarMinMaxData, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItems(context: Context): List<BaseViewTypeData> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}