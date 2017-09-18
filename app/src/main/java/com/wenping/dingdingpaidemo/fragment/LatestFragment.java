package com.wenping.dingdingpaidemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wenping.dingdingpaidemo.R;

/**
 * Created by wenping on 9/18/2017.
 */

public class LatestFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return View.inflate(getContext(), R.layout.fragment_latest, null);
    }
}
