package com.example.androidservicestudy;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class StartService extends Service {
    public StartService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("onCreate");
        System.out.println(getClass().getName());
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        System.out.println("onStartCommand");
        System.out.println(getClass().getName());
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy");
        System.out.println(getClass().getName());
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}