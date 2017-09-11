package com.oshi.libgenericsettings.adapter;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import com.oshi.libgenericsettings.R;
import com.oshi.libgenericsettings.data.BaseViewTypeData;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;
import com.oshi.libgenericsettings.viewholder.BaseSettingsViewHolder;
import com.oshi.libgenericsettings.viewholder.SettingsCheckBoxTitleSubtitleViewHolder;
import com.oshi.libgenericsettings.viewholder.SettingsExpandableTitleItemsViewHolder;
import com.oshi.libgenericsettings.viewholder.SettingsIconTitleViewHolder;
import com.oshi.libgenericsettings.viewholder.SettingsDividerViewHolder;
import com.oshi.libgenericsettings.viewholder.SettingsHeaderViewHolder;
import com.oshi.libgenericsettings.viewholder.SettingsTitleCheckboxViewHolder;
import com.oshi.libgenericsettings.viewholder.SettingsTitleIconSeekBarTextViewHolder;
import com.oshi.libgenericsettings.viewholder.SettingsTitleSeekbarMinMaxViewHolder;
import com.oshi.libgenericsettings.viewholder.SettingsTitleSubtitleExtraCheckboxViewHolder;
import com.oshi.libgenericsettings.viewholder.SettingsTitleSubtitleExtraSwitchViewHolder;
import com.oshi.libgenericsettings.viewholder.SettingsTitleSubtitleExtraViewHolder;
import com.oshi.libgenericsettings.viewholder.SettingsTitleSubtitleSwitchViewHolder;
import com.oshi.libgenericsettings.viewholder.SettingsTitleSubtitleViewHolder;
import com.oshi.libgenericsettings.viewholder.SettingsTitleSecondaryTitleViewHolder;
import com.oshi.libgenericsettings.viewholder.SettingsTitleSwitchViewHolder;
import com.oshi.libgenericsettings.viewholder.SettingsTitleUpDownValueViewHolder;
import com.oshi.libgenericsettings.viewholder.SettingsTitleViewHolder;

import java.util.List;


public class SettingsAdapter extends RecyclerView.Adapter<BaseSettingsViewHolder> {

    private List<BaseViewTypeData> dataList;
    private ISettingsPresenter presenter;
    private Context context;

    public SettingsAdapter(Context context, ISettingsPresenter presenter) {
        this.context = context;
        setPresenter(presenter);

    }

    public void setPresenter(@NonNull ISettingsPresenter presenter) {
        this.dataList = presenter.getItems(context);

        if (this.dataList == null) {
            throw new IllegalStateException("Cannot initiate SettingsAdapter with null items list");
        }

        this.presenter = presenter;
    }

    @Override
    public BaseSettingsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_HEADER) {
            ViewDataBinding binding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.view_type_header, parent, false);
            return new SettingsHeaderViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_SWITCH) {
            ViewDataBinding binding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.view_type_title_subtitle_switch, parent, false);
            return new SettingsTitleSubtitleSwitchViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE) {
            ViewDataBinding binding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.view_type_title_subtitle, parent, false);
            return new SettingsTitleSubtitleViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_DIVIDER) {
            ViewDataBinding binding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.view_type_divider, parent, false);
            return new SettingsDividerViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SWITCH) {
            ViewDataBinding binding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.view_type_title_switch, parent, false);

            return new SettingsTitleSwitchViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_CHECKBOX_TITLE_SUBTITLE) {
            ViewDataBinding binding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.view_type_title_subtitle_checkbox, parent, false);
            return new SettingsCheckBoxTitleSubtitleViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE) {
            ViewDataBinding binding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.view_type_title, parent, false);
            return new SettingsTitleViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_ICON_TITLE) {
            ViewDataBinding binding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.view_type_icon_title, parent, false);
            return new SettingsIconTitleViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SECONDARY_TITLE) {
            ViewDataBinding binding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.view_type_title_secondary_title, parent, false);
            return new SettingsTitleSecondaryTitleViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_ICON_SEEKBAR) {
            ViewDataBinding binding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.view_type_title_icon_seekbar_text, parent, false);
            return new SettingsTitleIconSeekBarTextViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_UP_DOWN_VALUE) {
            ViewDataBinding binding = DataBindingUtil.inflate(
                    layoutInflater, R.layout.view_type_title_up_down_value, parent, false);
            return new SettingsTitleUpDownValueViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_EXPANDABLE_TITLE_ITEMS_ACTION) {
            ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.view_type_expandable_title_items, parent, false);
            return new SettingsExpandableTitleItemsViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_CHECKBOX) {
            ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.view_type_title_checkbox, parent, false);
            return new SettingsTitleCheckboxViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA) {
            ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.view_type_title_subtitle_extra, parent, false);
            return new SettingsTitleSubtitleExtraViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_CHECKBOX) {
            ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.view_type_title_subtitle_extra_checkbox, parent, false);
            return new SettingsTitleSubtitleExtraCheckboxViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SUBTITLE_EXTRA_SWITCH) {
            ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.view_type_title_subtitle_extra_switch, parent, false);
            return new SettingsTitleSubtitleExtraSwitchViewHolder(binding);
        } else if (viewType == BaseViewTypeData.VIEW_TYPE_SETTINGS_TITLE_SEEKBAR_MIN_MAX) {
            ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.view_type_title_seekbar_min_max, parent, false);
            return new SettingsTitleSeekbarMinMaxViewHolder(binding);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(BaseSettingsViewHolder holder, int position) {
        BaseViewTypeData item = dataList.get(position);
        holder.onBind(item, presenter, position);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return dataList.get(position).getViewType();
    }
}
