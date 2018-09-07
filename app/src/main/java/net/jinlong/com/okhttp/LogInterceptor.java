package net.jinlong.com.okhttp;

import android.util.Log;

import java.io.IOException;
import java.util.Set;

import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author : 贺金龙
 * email : 753355530@qq.com
 * create at 2018/9/5  16:06
 * description : 日志拦截器
 */
public class LogInterceptor implements Interceptor {

    private static final String TAG = LogInterceptor.class.getSimpleName();

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        /*打印之前的请求内容*/
        HttpUrl url = request.url();
        Log.e(TAG, "之前的请求地址为" + url.toString());
        Headers headers = request.headers();
        Set<String> names = headers.names();
        for (String name : names) {
            Log.e(TAG, "之前的heard中的key为：" + name);
            String value = headers.get(name);
            Log.e(TAG, "之前的heard中的value为：" + value + "\n----------------------------");
        }


        /*这样就能在请求之前打印相应的内容了*/
        Log.e("url", String.format("Sending request %s on %s %n %s", request.url(), chain.connection(), request.headers()));

        /*其实下面这个chain.proceed(request)这个方法，代表请求前和请求后*/
        return chain.proceed(request);
    }
}
