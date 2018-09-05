package net.jinlong.com;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author : 贺金龙
 * email : 753355530@qq.com
 * create at 2018/9/5  17:29
 * description : 演示公共请求参数的
 */
public class PublicInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();

        if ("GET".equals(request.method())) {
            //GET请求的处理
            HttpUrl build = request.url().newBuilder()
                    .addQueryParameter("key1", "value1")
                    .addQueryParameter("key2", "value2")
                    .addQueryParameter("key3", "value3")
                    .addQueryParameter("key4", "value4")
                    .addQueryParameter("key5", "value5")
                    .build();

            request = request.newBuilder().url(build).build();
        } else if ("POST".equals(request.method())) {
            request = request.newBuilder()
                    .addHeader("key1", "value1")
                    .addHeader("key2", "value2")
                    .addHeader("key3", "value3")
                    .addHeader("key4", "value4")
                    .addHeader("key5", "value5")
                    .build();
        }

        return chain.proceed(request);
    }
}
