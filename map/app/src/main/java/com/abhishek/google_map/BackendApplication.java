package com.abhishek.google_map;

import android.app.Application;
import com.backendless.Backendless;

public class BackendApplication extends Application {

    public static String APPLICATION_ID ="3F1E2480-5414-1D13-FF23-E1B0C6BCB800";
    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl("https://api.backendless.com");
        Backendless.initApp(getApplicationContext(),"3F1E2480-5414-1D13-FF23-E1B0C6BCB800","33B274E5-339B-42BA-B5F7-CFC1CFDDF698");



    }
}
