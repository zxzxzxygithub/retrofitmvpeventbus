package com.test.retrofit.api;

import com.test.retrofit.model.CateItemBean;
import com.test.retrofit.model.ClassfyBean;
import com.test.retrofit.model.DetailBean;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * 接口类
 * Created by michael on 16/11/9.
 */

public interface ApiService {

    //  获取tablayout上的数据
    @GET("api/lore/classify")
    Call<ClassfyBean> getClassfyData();

    //   获取首页列表的数据
    @GET("api/lore/list")
    Call<CateItemBean> getListData(@Query("id") int id);

    //   获取详情数据
    @GET("api/lore/show")
    Call<DetailBean> getDetailData(@Query("id") int id);

    //     如果是以post方式请求则按照下面的例子
    @FormUrlEncoded
    @POST("api/lore/list")
    Call<CateItemBean> getListData2(@Field("id") int id);





}
