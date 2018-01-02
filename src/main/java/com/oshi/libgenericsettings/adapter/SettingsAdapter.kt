package com.oshi.libgenericsettings.adapter

import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.oshi.libgenericsettings.R
import com.oshi.libgenericsettings.data.BaseViewTypeData
import com.oshi.libgenericsettings.presenter.ISettingsPresenter
import com.oshi.libgenericsettings.viewholder.*


class SettingsAdapter(var context: Context, var presenter: ISettingsPresenter) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    var dataList: List<BaseViewTypeData> = presenter.getItems(context)

    init {
        if (dataList.isEmpty()) {
            throw IllegalStateException("Cannot initiate SettingsAdapter with null items list")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as BaseSettingsViewHolder<BaseViewTypeData>).onBind(dataList[position], presenter, position)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder? {
        val layoutInflater = LayoutInflater.from(parent?.context)
        return when (viewType) {
            BaseViewTypeData.VIEW_TYPE_SETTINGS_HEADER -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, R.layout.view_type_header, parent, false)
                SettingsHeaderViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_SWITCH -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, R.layout.view_type_title_subtitle_switch, parent, false)
                SettingsTitleSubtitleSwitchViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, R.layout.view_type_title_subtitle, parent, false)
                SettingsTitleSubtitleViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_DIVIDER -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, R.layout.view_type_divider, parent, false)
                SettingsDividerViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SWITCH -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, R.layout.view_type_title_switch, parent, false)
                SettingsTitleSwitchViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_CHECKBOX_TITLE_SUBTITLE -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, R.layout.view_type_title_subtitle_checkbox, parent, false)
                SettingsCheckBoxTitleSubtitleViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, R.layout.view_type_title, parent, false)
                SettingsTitleViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_ICON_TITLE -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, R.layout.view_type_icon_title, parent, false)
                SettingsIconTitleViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SECONDARY_TITLE -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, R.layout.view_type_title_secondary_title, parent, false)
                SettingsTitleSecondaryTitleViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_ICON_SEEKBAR -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, R.layout.view_type_title_icon_seekbar_text, parent, false)
                SettingsTitleIconSeekBarTextViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_UP_DOWN_VALUE -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, R.layout.view_type_title_up_down_value, parent, false)
                SettingsTitleUpDownValueViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_SIMPLE_ITEMS -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, R.layout.view_type_expandable_title_simple_items, parent, false)
                SettingsExpandableTitleSimpleItemsViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_CHECKBOX -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, R.layout.view_type_title_checkbox, parent, false)
                SettingsTitleCheckboxViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, R.layout.view_type_title_subtitle_extra, parent, false)
                SettingsTitleSubtitleExtraViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_CHECKBOX -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, R.layout.view_type_title_subtitle_extra_checkbox, parent, false)
                SettingsTitleSubtitleExtraCheckboxViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_SWITCH -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, R.layout.view_type_title_subtitle_extra_switch, parent, false)
                SettingsTitleSubtitleExtraSwitchViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SEEKBAR_MIN_MAX -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, R.layout.view_type_title_seekbar_min_max, parent, false)
                SettingsTitleSeekbarMinMaxViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_SUBTITLE_SIMPLE_ITEMS -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, R.layout.view_type_expandable_title_subtitle_simple_items, parent, false)
                SettingsExpandableTitleSubtitleSimpleItemsViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_CHECKABLE_ITEMS -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, R.layout.view_type_expandable_title_checkable_items, parent, false)
                SettingsExpandableTitleCheckableItemViewHolder(binding)
            }
            BaseViewTypeData.VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_SUBTITLE_CHECKABLE_ITEMS -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, R.layout.view_type_expandable_title_subtitle_checkable_items, parent, false)
                SettingsExpandableTitleSubtitleCheckableItemsViewHolder(binding)
            }
            else -> {
                null
            }
        }
    }
}

