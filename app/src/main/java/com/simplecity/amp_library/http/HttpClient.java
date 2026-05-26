package com.simplecity.amp_library.http;

import com.simplecity.amp_library.http.lastfm.LastFmService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpClient {

    public static final String TAG = "HttpClient";

    private static final String URL_LAST_FM = "https://ws.audioscrobbler.com/2.0/";
    
    private static final OkHttpClient okHttpClient;
    
    public static final LastFmService lastFmService;

    public static final String TAG_ARTWORK = "artwork";

    private static HttpClient sInstance;

    static {
        okHttpClient = new OkHttpClient.Builder().build();
        Retrofit lastFmRestAdapter = new Retrofit.Builder()
                .baseUrl(URL_LAST_FM)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        lastFmService = lastFmRestAdapter.create(LastFmService.class);
    }

    public static synchronized HttpClient getInstance() {
        if (sInstance == null) {
            sInstance = new HttpClient();
        }
        return sInstance;
    }

    private HttpClient() {
        // empty constructor
    }

    public LastFmService getLastFmService() {
        return lastFmService;
    }
}
