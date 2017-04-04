package com.sy.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Sy on 2017/4/4 0004.
 */

public class HttpUtil {
    /*
    当我们发起一条HTTP请求只需要调用sendOkHttpRequest（）方法
    传入请求地址address，然后注册一个回调相应服务器
     */
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
