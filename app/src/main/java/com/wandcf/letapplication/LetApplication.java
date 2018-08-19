package com.wandcf.letapplication;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by jenkins on 2018/8/19.
 *
 */

public class LetApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AVOSCloud.initialize(this,"3Mmn2VlebMepRF0Qe1VYQLvo-gzGzoHsz","9sS3IgLyIr384jrVlm8H2ygh");
        AVOSCloud.setDebugLogEnabled(true);
    }
}
