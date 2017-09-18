package com.wenping.dingdingpaidemo.activity;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import com.wenping.dingdingpaidemo.R;
import com.wenping.dingdingpaidemo.fragment.AlbumFragment;
import com.wenping.dingdingpaidemo.fragment.CameraFragment;
import com.wenping.dingdingpaidemo.fragment.MineFragment;
import com.wenping.dingdingpaidemo.fragment.OnRoadFragment;

public class MainActivity extends AppCompatActivity {

    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        initTabHost();
    }

    private void initViews() {
        mTabHost = (FragmentTabHost) findViewById(R.id.tabHost);
    }

    private void initTabHost() {
        mTabHost.setup(getApplicationContext(), getSupportFragmentManager(), R.id.root_content);
        if (Build.VERSION.SDK_INT > 10) {
            mTabHost.getTabWidget().setShowDividers(0);
        }
        TABINFO[] values = TABINFO.values();//获取枚举类型的大小;
        for (int i = 0; i < values.length; i++) {
            TABINFO tabinfo = values[i];
            TabHost.TabSpec tabSpec = mTabHost.newTabSpec(tabinfo.getTitle());

            View indicatorView = View.inflate(this, R.layout.inflate_indicatorview, null);
            TextView tab_title = (TextView) indicatorView.findViewById(R.id.tab_title);
            tab_title.setText(tabinfo.getTitle());
            tab_title.setCompoundDrawablesWithIntrinsicBounds(0, tabinfo.getResId(), 0, 0);

            tabSpec.setIndicator(indicatorView);

            mTabHost.addTab(tabSpec, tabinfo.getClz(), tabinfo.getBundle());
            if (i == 2) {
                indicatorView.setVisibility(View.INVISIBLE);
            }
        }
    }

    //create enum to contain tabs elements
    enum TABINFO {

        LOAD("在路上", R.drawable.tab_sel_onroad, OnRoadFragment.class, null),
        RECORDER("记录仪", R.drawable.tab_sel_camera, CameraFragment.class, null),
        ADD("", 0, null, null),
        ALBUM("相册", R.drawable.tab_sel_album, AlbumFragment.class, null),
        MINE("我的", R.drawable.tab_sel_my, MineFragment.class, null);

        private String title;
        private int resId;
        private Class clz;
        private Bundle mBundle;

        TABINFO(String title, int resId, Class clz, Bundle bundle) {
            this.title = title;
            this.resId = resId;
            this.clz = clz;
            mBundle = bundle;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setResId(int resId) {
            this.resId = resId;
        }

        public void setClz(Class clz) {
            this.clz = clz;
        }

        public void setBundle(Bundle bundle) {
            mBundle = bundle;
        }

        public String getTitle() {
            return title;
        }

        public int getResId() {
            return resId;
        }

        public Class getClz() {
            return clz;
        }

        public Bundle getBundle() {
            return mBundle;
        }
    }

}
