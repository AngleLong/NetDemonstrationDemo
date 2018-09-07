package net.jinlong.com.retrofit;

import java.util.Map;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * @author : 贺金龙
 * email : 753355530@qq.com
 * create at 2018/9/6  12:02
 * description : Retrofit对相应的相应接口
 */
public interface NewsService {
    /**
     * @author : 贺金龙
     * email : 753355530@qq.com
     * create at 2018/9/7  9:47
     * description : 获取新闻信息的接口
     */
    @GET("get?channel=头条&start=0&num=10&appkey=274ff62c9225cfa9")
    Call<News> getNews();

    /**
     * @author : 贺金龙
     * email : 753355530@qq.com
     * create at 2018/9/7  10:50
     * description : 演示@Query的示例
     */
    @GET("get?channel=头条&start=0&num=10")
    Call<News> getNews(@Query("appkey") String qppKey);


    /**
     * @author : 贺金龙
     * email : 753355530@qq.com
     * create at 2018/9/7  10:50
     * description : 演示@QueryMap的示例
     */
    @GET("get?")
    Call<News> getNews(@QueryMap Map<String, String> map);

    /**
     * @author : 贺金龙
     * email : 753355530@qq.com
     * create at 2018/9/7  9:47
     * description : 获取铁路信息的接口
     */
    @GET
    Call<StationBean> getTrainStation(@Url String url);


    /**
     * @author : 贺金龙
     * email : 753355530@qq.com
     * create at 2018/9/7  9:47
     * description : 演示@Path注解的示例
     */
    @GET("{path}/station2s?appkey=274ff62c9225cfa9&start=杭州&end=北京")
    Call<StationBean> getTrainStation(@Path("path") String path, @Query("ishigh") String ishigh);


    /**
     * @author : 贺金龙
     * email : 753355530@qq.com
     * create at 2018/9/7  11:51
     * description : 演示POST的请求内容
     */
    @FormUrlEncoded
    @POST("train/station2s?")
    Call<StationBean> getPostTrainStation(@FieldMap Map<String, String> map);


//    /**
//     * @author : 贺金龙
//     * email : 753355530@qq.com
//     * create at 2018/9/7  14:51
//     * description : 下面两个是关于文件上传的，因为没有可用的地址，所以这里注释了  你可以按照下面的方式测试一下！
//     */
//    @Multipart
//    @POST("/form")
//    Call<ResponseBody> testLoadFile(@Part("name") RequestBody name, @Part("age") RequestBody age, @Part MultipartBody.Part file);
//
//
//    @Multipart
//    @POST("/form")
//    Call<ResponseBody> testLoadFileMore(@Part Map<String, RequestBody> map, @Part MultipartBody.Part file);
//
//    -------------------------------------—下面是调用的方案—————————————————————————————————————————————————————————
//    Retrofit retrofit = new Retrofit.Builder()
//            .baseUrl("http://api.jisuapi.com/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build();
//    NewsService newsService = retrofit.create(NewsService.class);
//    MediaType textType = MediaType.parse("text/plain");
//    RequestBody name = RequestBody.create(textType, "Carson");
//    RequestBody age = RequestBody.create(textType, "24");
//    RequestBody file = RequestBody.create(MediaType.parse("application/octet-stream"), "这里是模拟文件的路径");
//    MultipartBody.Part body = MultipartBody.Part.createFormData("picture", "文件名称", file);
//
//    Call<ResponseBody> responseBodyCall = newsService.testLoadFile(name, age, body);
//        responseBodyCall.enqueue(new Callback<ResponseBody>() {
//        @Override
//        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//
//        }
//
//        @Override
//        public void onFailure(Call<ResponseBody> call, Throwable t) {
//
//        }
//    });


    /**
     * @author : 贺金龙
     * email : 753355530@qq.com
     * create at 2018/9/7  14:57
     * description : 演示@Body注解的使用
     */
    @POST("train/station2s?")
    Call<StationBean> getPostTrainStationBody(@Body BodyBean bodyBean);
}
