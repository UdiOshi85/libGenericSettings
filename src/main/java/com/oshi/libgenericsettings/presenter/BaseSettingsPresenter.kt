package com.oshi.libgenericsettings.presenter

import android.content.Context
import android.preference.PreferenceManager
import android.support.v7.widget.AppCompatCheckBox
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import com.oshi.libgenericsettings.R
import com.oshi.libgenericsettings.data.*
import com.oshi.libgenericsettings.helper.GLog
import com.oshi.libgenericsettings.helper.tag

/**
 * A custom base settings provider which overrides all available types.
 * You should extend this class and override your specific methods.
 */
open class BaseSettingsPresenter(val recyclerView : RecyclerView) : ISettingsPresenter {

    override fun onTitleSubtitleSwitchClick(view: View, data: TitleSubtitleSwitchData, position: Int) {
        updateSwitchChange(view, data.key, position)
    }

    override fun onTitleSubtitleClick(view: View, data: TitleSubtitleData, position: Int) {}

    override fun onTitleSwitchClick(view: View, data: TitleSwitchData, position: Int) {
        updateSwitchChange(view, data.key, position)
    }

    override fun onCheckboxTitleSubtitleClick(view: View, data: TitleSubtitleCheckboxData, position: Int) {
        updateCheckboxChange(view, data.key, position)
    }

    override fun onTitleClick(view: View, data: TitleData, position: Int) {}

    override fun onIconTitleClick(view: View, data: IconTitleData, position: Int) {}

    override fun onTitleSecondaryTitleClick(view: View, data: TitleSecondaryTitleData, position: Int) {}

    override fun onTitleIconSeekBarTextChanged(view: View, data: TitleIconSeekBarTextData, position: Int) {}

    override fun onTitleUpDownValueChanged(view: View, data: TitleUpDownValueData, position: Int) {}

    override fun onExpandableSimpleItemClicked(view: View, data: ExpandableTitleSimpleItemsData, parentPosition: Int, subItemPosition: Int) {}

    override fun onExpandableCheckableItemClicked(view: View, data: ExpandableTitleCheckableItemsData, parentPosition: Int, subItemPosition: Int) {
        val oldVal = data.items[subItemPosition].isChecked
        val newVal = !oldVal
        data.items[subItemPosition].isChecked = newVal
        recyclerView.adapter.notifyItemChanged(parentPosition)
    }

    override fun onCheckboxTitleClick(view: View, data: TitleCheckboxData, position: Int) {
        updateCheckboxChange(view, data.key, position)
    }

    override fun onTitleSubtitleExtraClick(view: View, data: TitleSubtitleExtraData, position: Int) {}

    override fun onCheckboxTitleSubtitleExtraClick(view: View, data: TitleSubtitleExtraCheckboxData, position: Int) {
        updateCheckboxChange(view, data.key, position)
    }

    override fun onTitleSubtitleExtraSwitchClick(view: View, data: TitleSubtitleExtraSwitchData, position: Int) {
        updateSwitchChange(view, data.key, position)
    }

    override fun onTitleSeekBarMinMaxChanged(view: View, data: TitleSeekBarMinMaxData, position: Int) {}

    override fun onExpandableBulletItemClicked(view: View, data: ExpandableTitleBulletItemsData, parentPosition: Int, subItemPosition: Int) {}

    override fun getItems(context: Context): List<BaseViewTypeData> {
        return emptyList()
    }

    override fun onExpandCollapseClicked(position: Int) {
        recyclerView.smoothScrollToPosition(position)
    }

    private fun updateCheckboxChange(view : View, key : String?, position : Int) {
        if (!key.isNullOrBlank()) {
            val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(view.context)
            val oldValue = sharedPreferences.getBoolean(key, false)
            sharedPreferences.edit().putBoolean(key, !oldValue).apply()
            GLog.d("Updated $key with ${!oldValue}")
            recyclerView.adapter.notifyItemChanged(position)
        }
    }

    private fun updateSwitchChange(view : View, key : String?, position : Int) {
        if (!key.isNullOrBlank()) {
            val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(view.context)
            val oldValue = sharedPreferences.getBoolean(key, false)
            sharedPreferences.edit().putBoolean(key, !oldValue).apply()
            GLog.d("Updated $key with ${!oldValue}")
            recyclerView.adapter.notifyItemChanged(position)
        }
    }
}