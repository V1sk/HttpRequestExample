package com.example.httprequestexample;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by chenjianwei on 2016/12/11.
 */

public class HttpRequestExampleApp extends Application {

    public static RequestQueue mQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        mQueue = Volley.newRequestQueue(this);
    }

}
