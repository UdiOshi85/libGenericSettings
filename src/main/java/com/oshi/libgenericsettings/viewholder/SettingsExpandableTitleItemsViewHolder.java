package com.oshi.libgenericsettings.viewholder;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.oshi.libgenericsettings.BR;
import com.oshi.libgenericsettings.R;
import com.oshi.libgenericsettings.adapter.SimpleSubItemsAdapter;
import com.oshi.libgenericsettings.data.ExpandableTitleSimpleItemsData;
import com.oshi.libgenericsettings.helper.AnimationUtils;
import com.oshi.libgenericsettings.presenter.ISettingsPresenter;

/**
 * Created by udioshi on 8/29/2017.
 */
public class SettingsExpandableTitleItemsViewHolder extends BaseSettingsViewHolder<ExpandableTitleSimpleItemsData> {

    private View clickContainer;
    private View expandButton;
    private View expandableContainer;
    private RecyclerView itemsList;
    private SimpleSubItemsAdapter adapter;

    public SettingsExpandableTitleItemsViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);

        clickContainer = viewDataBinding.getRoot().findViewById(R.id.clickContainer);
        expandButton = viewDataBinding.getRoot().findViewById(R.id.expandButton);
        expandableContainer = viewDataBinding.getRoot().findViewById(R.id.expandableContainer);
        itemsList = (RecyclerView) viewDataBinding.getRoot().findViewById(R.id.itemsList);
        itemsList.setHasFixedSize(true);
        itemsList.setLayoutManager(new LinearLayoutManager(itemsList.getContext(), LinearLayoutManager.VERTICAL, false));
    }

    @Override
    public void onBind(final ExpandableTitleSimpleItemsData data, ISettingsPresenter presenter, int position) {
        viewDataBinding.setVariable(BR.expandableTitleSimpleItemsData, data);
        viewDataBinding.setVariable(BR.settingsPresenter, presenter);
        viewDataBinding.setVariable(BR.itemPosition, position);
        viewDataBinding.executePendingBindings();

        adapter = new SimpleSubItemsAdapter(data, position, presenter);
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
