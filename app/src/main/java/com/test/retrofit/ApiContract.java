package com.test.retrofit;

import com.test.retrofit.model.ClassfyBean;

/**
 * Created by michael on 16/11/9.
 */

public interface ApiContract {

    interface View extends BaseView<Presenter> {

        void showGetClassfyDataSuccess(ClassfyBean classfyBean);

        void showWaitingClassfyDataView();

    }

    interface Presenter extends BasePresenter {

        void clickButton();

        void onGetClassfyDataSuccess(ClassfyBean classfyBean);

    }


}
