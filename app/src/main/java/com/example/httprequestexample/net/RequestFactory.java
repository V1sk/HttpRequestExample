package com.example.httprequestexample.net;

/**
 * Created by chenjianwei on 2016/12/11.
 */

public class RequestFactory {

    public static IRequestManager getRequestManager(){
//        return VolleyRequestManager.getInstance();
        return OkHttpRequestManager.getInstance();
    }

}
