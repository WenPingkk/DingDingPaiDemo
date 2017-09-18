package com.wenping.dingdingpaidemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wenping.dingdingpaidemo.R;
import com.wenping.dingdingpaidemo.bean.PagerInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenping on 9/16/2017.
 */

public class AlbumFragment extends Fragment {


    private List<PagerInfo> mInfos = new ArrayList<>();

    private static final String TAG = "wenping";
    private TabLayout mRootTablayout;
    private ViewPager mRootViewpager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_album, null);
        initView(view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initDatas();
        initListener();
    }

    protected void initDatas() {
        if (mInfos.size()==0) {
            Bundle bundle = new Bundle();
            mInfos.add(new PagerInfo("图片", PictureFragment.class, bundle));
            mInfos.add(new PagerInfo("视频", VideoFragment.class, bundle));
            mInfos.add(new PagerInfo("紧急", EmergencyFragment.class, bundle));
        }

        Log.e(TAG, "onActivityCreated ");
        RoadPagerAdapter adapter = new RoadPagerAdapter(getChildFragmentManager(), mInfos, getContext());
        mRootViewpager.setAdapter(adapter);
        mRootTablayout.setupWithViewPager(mRootViewpager);
    }

    protected void initListener() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    private void initView(View view) {
        mRootTablayout = (TabLayout) view.findViewById(R.id.root_tablayout);
        mRootViewpager = (ViewPager) view.findViewById(R.id.root_viewpager);
    }
}
