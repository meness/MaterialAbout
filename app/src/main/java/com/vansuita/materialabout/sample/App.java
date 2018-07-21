package com.vansuita.materialabout.sample;

import android.app.Application;
import android.content.res.Configuration;
import android.text.TextUtils;

import java.util.Locale;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        updateLanguage("fa");
    }

    private void updateLanguage(String lang) {
        Configuration cfg = new Configuration();
        if (!TextUtils.isEmpty(lang))
            cfg.locale = new Locale(lang);
        else
            cfg.locale = Locale.getDefault();

        getResources().updateConfiguration(cfg, null);
    }
}
