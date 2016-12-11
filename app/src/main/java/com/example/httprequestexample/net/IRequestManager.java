package com.example.httprequestexample.net;

/**
 * Created by chenjianwei on 2016/12/11.
 */

public interface IRequestManager {

    void get(String url, IRequestCallback requestCallback);

    void post(String url, String requestBodyJson, IRequestCallback requestCallback);

    void put(String url, String requestBodyJson, IRequestCallback requestCallback);

    void delete(String url, String requestBodyJson, IRequestCallback requestCallback);

}
