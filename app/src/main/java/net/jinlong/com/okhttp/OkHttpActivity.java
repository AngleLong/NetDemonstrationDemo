package net.jinlong.com.okhttp;

import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import net.jinlong.com.R;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.ConnectionPool;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkHttpActivity extends AppCompatActivity {

    private TextView mTvShow;
    private String TAG = OkHttpActivity.class.getSimpleName();
    private Handler mHandler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ok_http);

        mTvShow = findViewById(R.id.tvShow);
    }


    public void okHttpGET(View view) {
        requestDataGet();
    }

    public void okHttpPOST(View view) {
        requestDataPost();
    }

    public void okHttpFile(View view) {
        requestFile();
    }

    /**
     * @author : 贺金龙
     * email : 753355530@qq.com
     * create at 2018/9/5  10:49
     * description : 这里演示的是OkHttp的普通的GET基本使用
     */
    private void requestDataGet() {
        /*1.创建OkHttpClient对象*/
        OkHttpClient httpClient = new OkHttpClient.Builder()
                //设置相应的连接池
                .connectionPool(new ConnectionPool())
                //连接超时
                .connectTimeout(15, TimeUnit.SECONDS)
                //写入超时
                .writeTimeout(15, TimeUnit.SECONDS)
                //读取超时
                .readTimeout(20, TimeUnit.SECONDS)
                //添加日志拦截器
                .addInterceptor(new LogInterceptor())
                .build();
        /*2.创建请求Request内容*/
        Request request = new Request.Builder()
                .method("GET", null)
                .url("https://www.baidu.com/")
                .build();

        /*3.发送请求*/
        Call call = httpClient.newCall(request);
        /*4.创建请求的回调*/
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e(TAG, "请求失败的原因：" + e);
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                Headers headers = response.headers();
                Set<String> names = headers.names();
                for (String name : names) {
                    Log.e(TAG, "请求的header" + name);
                    String value = headers.get(name);
                    Log.e(TAG, "值为： " + value + "\n----------------------------------");
                }


                final String date = response.body().string();
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        mTvShow.setText(date);
                    }
                });
            }
        });
    }

    /**
     * @author : 贺金龙
     * email : 753355530@qq.com
     * create at 2018/9/5  11:54
     * description :  这里演示的是OkHttp的普通的POST基本使用
     */
    private void requestDataPost() {
        /*1.创建OkHttpClient对象*/
        OkHttpClient httpClient = new OkHttpClient.Builder()
                //添加重置网址的拦截
                .addInterceptor(new ResetInterceptor())
                .build();
        /*2.创建相应的表单内容*/
        FormBody formBody = new FormBody.Builder()
                .add("key", "value")
                .build();
        /*3.创建请求Request内容*/
        Request request = new Request.Builder()
                .url("https://www.baidu.com/")
                .post(formBody)
                .build();
        /*4.发送请求*/
        Call call = httpClient.newCall(request);
        /*5.创建请求的回调*/
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e(TAG, "请求失败的原因：" + e);
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                Headers headers = response.headers();
                Set<String> names = headers.names();
                for (String name : names) {
                    Log.e(TAG, "请求的header" + name);
                    String value = headers.get(name);
                    Log.e(TAG, "值为： " + value + "\n----------------------------------");
                }


                final String date = response.body().string();
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        mTvShow.setText(date);
                    }
                });
            }
        });
    }

    /**
     * @author : 贺金龙
     * email : 753355530@qq.com
     * create at 2018/9/5  14:11
     * description : 文件上传操作
     */
    private void requestFile() {
        /*1.创建OkHttpClient对象*/
        OkHttpClient httpClient = new OkHttpClient();
        /*2.创建相应的表单内容*/
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("title", "张三")
                .addFormDataPart("image", "zhangsan.jpg", RequestBody.create(MediaType.parse("application/octet-stream"), new File(Environment.getExternalStorageDirectory().getParent() + "/0/123.png")))
                .build();

        /*3.创建请求Request内容*/
        Request request = new Request.Builder()
                .header("key", "value")
                .url("https://www.baidu.com/")
                .post(requestBody)
                .build();

        /*4.发送请求*/
        Call call = httpClient.newCall(request);
        /*5.创建请求的回调*/
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e(TAG, "onFailure: " + e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.e(TAG, "onResponse: " + response.body().string());
            }
        });
    }
}
