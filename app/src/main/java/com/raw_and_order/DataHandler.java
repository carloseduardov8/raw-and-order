package com.raw_and_order;

import android.app.Application;

import com.firebase.client.Firebase;

public class DataHandler extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);

    }
}
