package com.wenping.dingdingpaidemo.bean;

import android.os.Bundle;

/**
 * Created by wenping on 9/18/2017.
 */

public class PagerInfo {
    private String title;
    private Class clz;
    private Bundle mBundle;

    public PagerInfo(String title, Class clz, Bundle bundle) {
        this.title = title;
        this.clz = clz;
        mBundle = bundle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Class getClz() {
        return clz;
    }

    public void setClz(Class clz) {
        this.clz = clz;
    }

    public Bundle getBundle() {
        return mBundle;
    }

    public void setBundle(Bundle bundle) {
        mBundle = bundle;
    }
}
