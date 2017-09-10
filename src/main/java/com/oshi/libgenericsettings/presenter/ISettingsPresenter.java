package com.oshi.libgenericsettings.presenter;

import android.content.Context;
import android.view.View;

import com.oshi.libgenericsettings.data.BaseViewTypeData;
import com.oshi.libgenericsettings.data.ExpandableTitleSimpleItemsData;
import com.oshi.libgenericsettings.data.TitleCheckboxData;
import com.oshi.libgenericsettings.data.TitleIconSeekBarTextData;
import com.oshi.libgenericsettings.data.TitleSecondaryTitleData;
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


public interface ISettingsPresenter {

    interface OnSettingsChangedListener {
        void notifyItemChanged(int position);
    }

    void onTitleSubtitleSwitchClick(View view, TitleSubtitleSwitchData data, int position);

    void onTitleSubtitleClick(View view, TitleSubtitleData data, int position);

    void onTitleSwitchClick(View view, TitleSwitchData data, int position);

    void onCheckboxTitleSubtitleClick(View view, TitleSubtitleCheckboxData data, int position);

    void onTitleClick(View view, TitleData data, int position);

    void onIconTitleClick(View view, IconTitleData data, int position);

    void onTitleSecondaryTitleClick(View view, TitleSecondaryTitleData data, int position);

    void onTitleIconSeekBarTextChanged(View view, TitleIconSeekBarTextData data, int position);

    void onTitleUpDownValueChanged(View view, TitleUpDownValueData data, int position);

    void onExpandableSimpleItemClicked(View view, ExpandableTitleSimpleItemsData data, int parentPosition, int subItemPosition);

    void onTitleCheckboxClick(View view, TitleCheckboxData data, int position);

    void onTitleSubtitleExtraClick(View view, TitleSubtitleExtraData data, int position);

    void onTitleSubtitleExtraCheckboxClick(View view, TitleSubtitleExtraCheckboxData data, int position);

    void onTitleSubtitleExtraSwitchClick(View view, TitleSubtitleExtraSwitchData data, int position);

    List<BaseViewTypeData> getItems(Context context);

}
