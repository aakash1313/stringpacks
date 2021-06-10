package com.example.stringpacktest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.whatsapp.stringpacks.StringPacks;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, context.getApplicationContext().getString(R.string.broacast_triggered), Toast.LENGTH_SHORT).show();
    }
}
