package com.wenping.dingdingpaidemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wenping.dingdingpaidemo.R;

/**
 * Created by wenping on 9/16/2017.
 */

public class CameraFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        return View.inflate(getActivity(), R.layout.fragment_camera,null);
    }
}
