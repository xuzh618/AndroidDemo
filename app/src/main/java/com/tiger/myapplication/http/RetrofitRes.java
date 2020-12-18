package com.tiger.myapplication.http;

import com.bumptech.glide.Glide;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/***
 * Retrofit 使用
 * 步骤1：添加Retrofit库的依赖
 * 步骤2：创建 接收服务器返回数据 的类
 * 步骤3：创建 用于描述网络请求 的接口
 * 步骤4：创建 Retrofit 实例
 * 步骤5：创建 网络请求接口实例 并 配置网络请求参数
 * 步骤6：发送网络请求（采用最常用的异步方式）
 */
public class RetrofitRes {

    private static void test() {


        //步骤4:创建Retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://fy.iciba.com/") // 设置 网络请求 Url
                .addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
                .build();
    }

}
