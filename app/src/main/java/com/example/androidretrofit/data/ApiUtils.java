package com.example.androidretrofit.data;

import com.example.androidretrofit.data.remote.RetrofitClient;
import com.example.androidretrofit.data.remote.SOService;

/**
 * Created by vave on 23/7/17.
 */

public class ApiUtils {

    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}