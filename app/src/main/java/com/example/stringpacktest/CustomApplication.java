package com.example.stringpacktest;

import android.app.Application;
import android.content.Context;

import com.whatsapp.stringpacks.StringPackContext;
import com.whatsapp.stringpacks.StringPacks;

public class CustomApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        StringPackIds.registerStringPackIds();
        StringPacks.getInstance().setUp(base);

        super.attachBaseContext(StringPackContext.wrap(base));
    }
}
