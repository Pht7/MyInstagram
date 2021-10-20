package com.pht7.myinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("lCDGzUpgmaouxTsho5lynYmnAAo4PIYxdRHxv1O9")
                .clientKey("ypnnLOXiMbZadkioiAEQMV0tLoxFcfCtafwqwztH")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
