package net.jinlong.com.okhttp;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author : 贺金龙
 * email : 753355530@qq.com
 * create at 2018/9/5  16:35
 * description : 重定向网址的拦截器
 */
public class ResetInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {

        Request newRequest = new Request.Builder()
                .method("GET", null)
                .url("https://fanyi.baidu.com/translate?aldtype=16047&query=%E8%BF%9B%E5%BA%A6%0D%0A&keyfrom=baidu&smartresult=dict&lang=auto2zh#zh/en/%E9%87%8D%E7%BD%AE")
                .build();

        return chain.proceed(newRequest);
    }
}
