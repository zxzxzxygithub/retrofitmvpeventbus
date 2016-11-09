package com.test.retrofit;

import com.test.retrofit.api.ApiManagerImpl;
import com.test.retrofit.model.ClassfyBean;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Created by michael on 16/11/9.
 */

public class ApiTestPresenter implements ApiContract.Presenter {

    private final ApiContract.View mView;

    public ApiTestPresenter(ApiContract.View view) {

        this.mView = view;

    }

    @Override
    public void clickButton() {
        mView.showWaitingClassfyDataView();
        new ApiManagerImpl().getClassfyData();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    @Override
    public void onGetClassfyDataSuccess(ClassfyBean classfyBean) {

        mView.showGetClassfyDataSuccess(classfyBean);

    }

    @Override
    public void start() {



    }
}
