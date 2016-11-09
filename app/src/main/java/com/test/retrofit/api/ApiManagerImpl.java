package com.test.retrofit.api;

import com.test.retrofit.model.ClassfyBean;

import org.greenrobot.eventbus.EventBus;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 网络管理实现类
 * Created by michael on 16/11/9.
 */

public class ApiManagerImpl implements ApiManager {

    private static Retrofit mRetrofit;

    /**
     * 构造函数，初始化网络
     *
     * @author michael
     * @time 16/11/9 上午11:19
     */
    public ApiManagerImpl() {
        initNet();
    }

    /**
     * 初始化网络请求
     *
     * @author michael
     * @time 16/11/9 上午11:13
     */
    @Override
    public void initNet() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder().baseUrl(ApiContants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
    }

    /**
     * 获取类型数据
     *
     * @author michael
     * @time 16/11/9 上午11:15
     */
    @Override
    public void getClassfyData() {
        ApiService apiService = mRetrofit.create(ApiService.class);
        Call<ClassfyBean> call = apiService.getClassfyData();
        call.enqueue(new Callback<ClassfyBean>() {
            @Override
            public void onResponse(Call<ClassfyBean> call, Response<ClassfyBean> response) {
                if (response != null) {
                    ClassfyBean classfyBean = response.body();
                    EventBus.getDefault().post(classfyBean);
                }

            }

            @Override
            public void onFailure(Call<ClassfyBean> call, Throwable t) {

            }
        });

    }


}
