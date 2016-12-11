package com.example.httprequestexample.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.httprequestexample.R;
import com.example.httprequestexample.net.IRequestCallback;
import com.example.httprequestexample.net.IRequestManager;
import com.example.httprequestexample.net.RequestFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //测试请求
        String url = "https://api.douban.com/v2/movie/top250";
        //这里发起请求依赖的是IRequestManager接口
        IRequestManager requestManager = RequestFactory.getRequestManager();
        requestManager.get(url, new IRequestCallback() {
            @Override
            public void onSuccess(String response) {
                Log.d(TAG, "onSuccess: " + response);
                //// TODO: 2016/12/11 your code
            }

            @Override
            public void onFailure(Throwable throwable) {
                throwable.printStackTrace();
                //// TODO: 2016/12/11 your code
            }
        });

    }
}
