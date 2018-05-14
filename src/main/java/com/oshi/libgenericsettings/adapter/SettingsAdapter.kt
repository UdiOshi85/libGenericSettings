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

    private var dataList: List<BaseViewTypeData> = presenter.getItems(context)

    init {
        if (dataList.isEmpty()) {
            throw IllegalStateException("Cannot initiate SettingsAdapter with null items list")
        }
    }

    @Suppress("UNCHECKED_CAST")
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as BaseSettingsViewHolder<BaseViewTypeData>).onBind(dataList[position], presenter, position)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun getItemViewType(position: Int): Int {
        return dataList[position].getViewType().ordinal
    }

    fun replacePresenterAndNotify(newPresenter : ISettingsPresenter) {
        this.presenter = newPresenter
        this.dataList = presenter.getItems(context)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_HEADER.ordinal -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_HEADER.layoutResId, parent, false)
                SettingsHeaderViewHolder(binding)
            }
            BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_SWITCH.ordinal -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_SWITCH.layoutResId, parent, false)
                SettingsTitleSubtitleSwitchViewHolder(binding)
            }
            BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE.ordinal -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, R.layout.view_type_title_subtitle, parent, false)
                SettingsTitleSubtitleViewHolder(binding)
            }
            BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_DIVIDER.ordinal -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_DIVIDER.layoutResId, parent, false)
                SettingsDividerViewHolder(binding)
            }
            BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SWITCH.ordinal -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SWITCH.layoutResId, parent, false)
                SettingsTitleSwitchViewHolder(binding)
            }
            BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_CHECKBOX_TITLE_SUBTITLE.ordinal -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_CHECKBOX_TITLE_SUBTITLE.layoutResId, parent, false)
                SettingsCheckBoxTitleSubtitleViewHolder(binding)
            }
            BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE.ordinal -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE.layoutResId, parent, false)
                SettingsTitleViewHolder(binding)
            }
            BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_ICON_TITLE.ordinal -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_ICON_TITLE.layoutResId, parent, false)
                SettingsIconTitleViewHolder(binding)
            }
            BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SECONDARY_TITLE.ordinal -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SECONDARY_TITLE.layoutResId, parent, false)
                SettingsTitleSecondaryTitleViewHolder(binding)
            }
            BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_ICON_SEEKBAR.ordinal -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_ICON_SEEKBAR.layoutResId, parent, false)
                SettingsTitleIconSeekBarTextViewHolder(binding)
            }
            BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_UP_DOWN_VALUE.ordinal -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_UP_DOWN_VALUE.layoutResId, parent, false)
                SettingsTitleUpDownValueViewHolder(binding)
            }
            BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_CHECKBOX.ordinal -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_CHECKBOX.layoutResId, parent, false)
                SettingsTitleCheckboxViewHolder(binding)
            }
            BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA.ordinal -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA.layoutResId, parent, false)
                SettingsTitleSubtitleExtraViewHolder(binding)
            }
            BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_CHECKBOX.ordinal -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_CHECKBOX.layoutResId, parent, false)
                SettingsTitleSubtitleExtraCheckboxViewHolder(binding)
            }
            BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_SWITCH.ordinal -> {
                val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, BaseViewTypeData.Companion.SettingsViewTypes.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_SWITCH.layoutResId, parent, false)
                SettingsTitleSubtitleExtraSwitchViewHolder(binding)
            }
            else -> {
                // TODO fix this ASAP
                val binding = DataBindingUtil.inflate<ViewDataBinding>(
                        layoutInflater, R.layout.view_type_divider, parent, false)
                SettingsDividerViewHolder(binding)
            }
        }
    }
}

