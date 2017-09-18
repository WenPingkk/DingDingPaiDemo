//package com.wenping.dingdingpaidemo.base;
//
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
//import android.view.View;
//
//import butterknife.ButterKnife;
//
///**
// * Created by wenping on 9/18/2017.
// */
//
//public abstract class BasedFragment extends Fragment{
//
//
//    @Override
//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        ButterKnife.bind(this,view);
//    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        initDatas();
//        initListener();
//    }
//
//    protected abstract void initListener();
//
//    protected abstract void initDatas();
//
//
//}
