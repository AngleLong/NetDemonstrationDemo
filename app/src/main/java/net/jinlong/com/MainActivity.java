package net.jinlong.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * @author : 贺金龙
     * email : 753355530@qq.com
     * create at 2018/9/5  10:46
     * description :  演示OkHttp的网络请求
     */
    public void okHttp(View view) {
        Intent intent = new Intent(this, OkHttpActivity.class);
        startActivity(intent);
    }
}
