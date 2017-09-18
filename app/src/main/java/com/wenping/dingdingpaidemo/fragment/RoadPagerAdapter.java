package com.wenping.dingdingpaidemo.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.wenping.dingdingpaidemo.bean.PagerInfo;

import java.util.List;

/**
 * Created by wenping on 9/18/2017.
 */

public class RoadPagerAdapter extends FragmentPagerAdapter{

    private List<PagerInfo> mInfos;
    private Context mContext;

    public RoadPagerAdapter(FragmentManager fm, List<PagerInfo> infos, Context context) {
        super(fm);
        mInfos = infos;
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        PagerInfo pagerInfo = mInfos.get(position);
        Fragment fragment = Fragment.instantiate(mContext, pagerInfo.getClz().getName(), pagerInfo.getBundle());
        return fragment;
    }

    private static final String TAG = "wenping";
    @Override
    public int getCount() {
        if (mInfos.size() != 0) {
            Log.e(TAG, "getCount "+mInfos.size());
            return mInfos.size();
        }
        return 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mInfos.get(position).getTitle().toString();
    }
}
