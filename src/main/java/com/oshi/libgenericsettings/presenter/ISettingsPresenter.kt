package com.oshi.libgenericsettings.presenter

import android.content.Context
import android.view.View
import com.oshi.libgenericsettings.data.*


interface ISettingsPresenter {

    fun onTitleSubtitleSwitchClick(view: View, data: TitleSubtitleSwitchData, position: Int)

    fun onTitleSubtitleClick(view: View, data: TitleSubtitleData, position: Int)

    fun onTitleSwitchClick(view: View, data: TitleSwitchData, position: Int)

    fun onCheckboxTitleClick(view: View, data: TitleCheckboxData, position: Int)

    fun onCheckboxTitleSubtitleClick(view: View, data: TitleSubtitleCheckboxData, position: Int)

    fun onCheckboxTitleSubtitleExtraClick(view: View, data: TitleSubtitleExtraCheckboxData, position: Int)

    fun onTitleClick(view: View, data: TitleData, position: Int)

    fun onIconTitleClick(view: View, data: IconTitleData, position: Int)

    fun onTitleSecondaryTitleClick(view: View, data: TitleSecondaryTitleData, position: Int)

    fun onTitleIconSeekBarTextChanged(view: View, data: TitleIconSeekBarTextData, position: Int)

    fun onTitleUpDownValueChanged(view: View, data: TitleUpDownValueData, position: Int)

    fun onTitleSubtitleExtraClick(view: View, data: TitleSubtitleExtraData, position: Int)

    fun onTitleSubtitleExtraSwitchClick(view: View, data: TitleSubtitleExtraSwitchData, position: Int)

    fun getItems(context: Context): List<BaseViewTypeData>

    fun onExpandCollapseClicked(position: Int)

}