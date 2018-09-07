package net.jinlong.com.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;

import net.jinlong.com.R;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;

/**
 * @author : 贺金龙
 * email : 753355530@qq.com
 * create at 2018/9/6  11:56
 * description : 演示Retrofit的网络请求
 */
public class RetrofitActivity extends AppCompatActivity {

    private String TAG = RetrofitActivity.class.getSimpleName();
    private TextView mTvSHow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);

        mTvSHow = findViewById(R.id.tvShow);
    }


    /**
     * @author : 贺金龙
     * email : 753355530@qq.com
     * create at 2018/9/6  11:57
     * description : Retrofit的简单使用
     */
    public void retrofitDefault(View view) {
        /*1.创建Retrofit的实例*/
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.jisuapi.com/news/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        /*2.定义相应的接口,获取代理对象*/
        NewsService newsService = retrofit.create(NewsService.class);
        /*3.发送请求*/
        Map<String, String> map = new HashMap<>();
        //channel = 头条 & start = 0 & num = 10 & appkey = 274f f62c9225cfa9
        map.put("channel", "头条");
        map.put("start", "0");
        map.put("num", "1");
        map.put("appkey", "274ff62c9225cfa9");

        Call<News> news = newsService.getNews(map);
        /*4.创建请求的回调*/
        news.enqueue(new Callback<News>() {
            @Override
            public void onResponse(Call<News> call, Response<News> response) {
                Log.e(TAG, "成功的回调: " + response.body());

                Request request = call.request();
                HttpUrl url = request.url();
                Log.e(TAG, "onResponse: " + url);

                News news = response.body();

                mTvSHow.setText(news.toString());
            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {
                Request request = call.request();
                HttpUrl url = request.url();
                Log.e(TAG, "onResponse: " + url);

                Log.e(TAG, "失败的回调: " + t.toString());
            }
        });
    }

    /**
     * @author : 贺金龙
     * email : 753355530@qq.com
     * create at 2018/9/7  9:48
     * description : Retrofit更改请求网址的演示
     */
    public void retrofitChange(View view) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.jisuapi.com/news/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        NewsService newsService = retrofit.create(NewsService.class);
        Call<StationBean> trainStation = newsService.getTrainStation("http://api.jisuapi.com/train/station2s?appkey=274ff62c9225cfa9&start=杭州&end=北京&ishigh=0");
        trainStation.enqueue(new Callback<StationBean>() {
            @Override
            public void onResponse(Call<StationBean> call, Response<StationBean> response) {
                Log.e(TAG, "请求成功的话证明URL地址已经修改了" + response.body().toString());
            }

            @Override
            public void onFailure(Call<StationBean> call, Throwable t) {
                Request request = call.request();
                HttpUrl url = request.url();

                Log.e(TAG, "请求失败的话打印一下URL地址" + url);
                Log.e(TAG, "onFailure: " + t);
            }
        });
    }

    /**
     * @author : 贺金龙
     * email : 753355530@qq.com
     * create at 2018/9/7  11:15
     * description : 演示@Path注解
     */
    public void retrofitPath(View view) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.jisuapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        NewsService newsService = retrofit.create(NewsService.class);
        Call<StationBean> train = newsService.getTrainStation("train", "0");
        train.enqueue(new Callback<StationBean>() {
            @Override
            public void onResponse(Call<StationBean> call, Response<StationBean> response) {
                Log.e(TAG, "成功的话打印出相应的结果 " + response.body());
                mTvSHow.setText(response.body().toString());
            }

            @Override
            public void onFailure(Call<StationBean> call, Throwable t) {
                Log.e(TAG, "失败的话打印出相应的异常 " + t);
            }
        });
    }


    /**
     * @author : 贺金龙
     * email : 753355530@qq.com
     * create at 2018/9/7  11:44
     * description : post请求的演示
     */
    public void retrofitPost(View view) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.jisuapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        NewsService newsService = retrofit.create(NewsService.class);
        Map<String, String> map = new HashMap<>();
        map.put("appkey", "274ff62c9225cfa9");
        map.put("start", "杭州");
        map.put("end", "北京");
        map.put("ishigh", "0");
        Call<StationBean> trainStation = newsService.getPostTrainStation(map);
        trainStation.enqueue(new Callback<StationBean>() {
            @Override
            public void onResponse(Call<StationBean> call, Response<StationBean> response) {
                Log.e(TAG, "成功的话打印出相应的结果 " + response.body());
                mTvSHow.setText(response.body().toString());
            }

            @Override
            public void onFailure(Call<StationBean> call, Throwable t) {
                Log.e(TAG, "失败的话打印出相应的异常 " + t);
            }
        });
    }

    /**
     * @author : 贺金龙
     * email : 753355530@qq.com
     * create at 2018/9/7  14:28
     * description : Retrofit文件上传的演示
     */
    public void retrofitBody(View view) {
        //http://api.jisuapi.com/train/station2s?appkey=274ff62c9225cfa9&start=杭州&end=北京&ishigh=0");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.jisuapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NewsService newsService = retrofit.create(NewsService.class);

        BodyBean bodyBean = new BodyBean("274ff62c9225cfa9", "杭州", "北京", "0");
        Call<StationBean> postTrainStationBody = newsService.getPostTrainStationBody(bodyBean);

        postTrainStationBody.enqueue(new Callback<StationBean>() {
            @Override
            public void onResponse(Call<StationBean> call, Response<StationBean> response) {
                Log.e(TAG, "成功的话打印出相应的结果 " + response.body());
                mTvSHow.setText(response.body().toString());
            }

            @Override
            public void onFailure(Call<StationBean> call, Throwable t) {

                Request request = call.request();

                Headers headers = request.headers();
                Set<String> names = headers.names();
                for (String name :
                        names) {
                    Log.e(TAG, "请求的名称为: " + name);
                    Log.e(TAG, "请求的值为: " + headers.get(name));
                }

                Log.e(TAG, "失败的话打印出相应的异常 " + t);
            }
        });

    }
}
