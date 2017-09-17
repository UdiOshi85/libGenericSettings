package com.oshi.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.R;
import com.oshi.libgenericsettings.adapter.CheckableSubItemsAdapter;
import com.oshi.libgenericsettings.data.ExpandableTitleSubtitleCheckableItemsData;
import com.oshi.libgenericsettings.helper.AnimationUtils;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

public class SettingsExpandableTitleSubtitleCheckableItemsViewHolder extends BaseSettingsViewHolder<ExpandableTitleSubtitleCheckableItemsData> {

    private View clickContainer;
    private View expandButton;
    private View expandableContainer;
    private RecyclerView itemsList;
    private CheckableSubItemsAdapter adapter;

    public SettingsExpandableTitleSubtitleCheckableItemsViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);

        clickContainer = viewDataBinding.getRoot().findViewById(R.id.clickContainer);
        expandButton = viewDataBinding.getRoot().findViewById(R.id.expandButton);
        expandableContainer = viewDataBinding.getRoot().findViewById(R.id.expandableContainer);
        itemsList = viewDataBinding.getRoot().findViewById(R.id.itemsList);
        itemsList.setHasFixedSize(true);
        itemsList.setLayoutManager(new LinearLayoutManager(itemsList.getContext(), LinearLayoutManager.VERTICAL, false));
    }

    @Override
    public void onBind(final ExpandableTitleSubtitleCheckableItemsData data, ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.expandableTitleSubtitleCheckableItemsData, data);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.setVariable(BR.itemPosition, position);
        viewDataBinding.executePendingBindings();

        adapter = new CheckableSubItemsAdapter(data, position, presenter);
        itemsList.setAdapter(adapter);

        clickContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean isExpanded = data.isExpanded();
                expandButton.animate().rotation(isExpanded ? 0 : 180).start();
                if (isExpanded) {
                    AnimationUtils.collapse(expandableContainer);
                } else {
                    AnimationUtils.expand(expandableContainer);
                }
                data.setExpanded(!isExpanded);
            }
        });

    }

}
