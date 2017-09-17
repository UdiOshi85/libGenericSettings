package com.oshi.libgenericsettings.presenter;

import android.content.Context;
import android.view.View;

import com.oshi.libgenericsettings.data.BaseViewTypeData;
import com.oshi.libgenericsettings.data.ExpandableTitleCheckableItemsData;
import com.oshi.libgenericsettings.data.ExpandableTitleSimpleItemsData;
import com.oshi.libgenericsettings.data.TitleCheckboxData;
import com.oshi.libgenericsettings.data.TitleIconSeekBarTextData;
import com.oshi.libgenericsettings.data.TitleSecondaryTitleData;
import com.oshi.libgenericsettings.data.TitleSeekBarMinMaxData;
import com.oshi.libgenericsettings.data.TitleSubtitleCheckboxData;
import com.oshi.libgenericsettings.data.IconTitleData;
import com.oshi.libgenericsettings.data.TitleData;
import com.oshi.libgenericsettings.data.TitleSubtitleData;
import com.oshi.libgenericsettings.data.TitleSubtitleExtraCheckboxData;
import com.oshi.libgenericsettings.data.TitleSubtitleExtraData;
import com.oshi.libgenericsettings.data.TitleSubtitleExtraSwitchData;
import com.oshi.libgenericsettings.data.TitleSubtitleSwitchData;
import com.oshi.libgenericsettings.data.TitleSwitchData;
import com.oshi.libgenericsettings.data.TitleUpDownValueData;

import java.util.List;

/**
 * A custom base settings provider which overrides all available types.
 * You should extend this class and override your specific methods.
 */
public class BaseSettingsPresenter implements ISettingsPresenter {

    @Override
    public void onTitleSubtitleSwitchClick(View view, TitleSubtitleSwitchData data, int position) {

    }

    @Override
    public void onTitleSubtitleClick(View view, TitleSubtitleData data, int position) {

    }

    @Override
    public void onTitleSwitchClick(View view, TitleSwitchData data, int position) {

    }

    @Override
    public void onCheckboxTitleSubtitleClick(View view, TitleSubtitleCheckboxData data, int position) {

    }

    @Override
    public void onTitleClick(View view, TitleData data, int position) {

    }

    @Override
    public void onIconTitleClick(View view, IconTitleData data, int position) {

    }

    @Override
    public void onTitleSecondaryTitleClick(View view, TitleSecondaryTitleData data, int position) {

    }

    @Override
    public List<BaseViewTypeData> getItems(Context context) {
        return null;
    }

    @Override
    public void onTitleIconSeekBarTextChanged(View view, TitleIconSeekBarTextData data, int position) {

    }

    @Override
    public void onTitleUpDownValueChanged(View view, TitleUpDownValueData data, int position) {

    }

    @Override
    public void onExpandableSimpleItemClicked(View view, ExpandableTitleSimpleItemsData data, int parentPosition, int subItemPosition) {

    }

    @Override
    public void onTitleCheckboxClick(View view, TitleCheckboxData data, int position) {

    }

    @Override
    public void onTitleSubtitleExtraClick(View view, TitleSubtitleExtraData data, int position) {

    }

    @Override
    public void onTitleSubtitleExtraCheckboxClick(View view, TitleSubtitleExtraCheckboxData data, int position) {

    }

    @Override
    public void onTitleSubtitleExtraSwitchClick(View view, TitleSubtitleExtraSwitchData data, int position) {

    }

    @Override
    public void onTitleSeekBarMinMaxChanged(View view, TitleSeekBarMinMaxData data, int position) {

    }

    @Override
    public void onExpandableCheckableItemClicked(View view, ExpandableTitleCheckableItemsData data, int parentPosition, int subItemPosition) {

    }
}
