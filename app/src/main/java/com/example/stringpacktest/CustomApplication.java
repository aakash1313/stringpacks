package com.example.stringpacktest;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;

import androidx.annotation.NonNull;

import com.whatsapp.stringpacks.Logger;
import com.whatsapp.stringpacks.StringPackContext;
import com.whatsapp.stringpacks.StringPackResources;
import com.whatsapp.stringpacks.StringPacks;

public class CustomApplication extends Application {

    private StringPackResources stringPackResources;

    @Override
    public Resources getResources() {
        if (stringPackResources == null) {
            stringPackResources = StringPackResources.wrap(super.getResources());
        }
        return stringPackResources;
    }

    @Override
    protected void attachBaseContext(Context base) {
        StringPackIds.registerStringPackIds();
        StringPacks.getInstance().setUp(base);

        //super.attachBaseContext(StringPackContext.wrap(base));
        super.attachBaseContext(base);
    }
}
