package io.github.alexlondon07.tabsandtoolbar_courseudemy.udemy.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.alexlondon07.tabsandtoolbar_courseudemy.R;


public class FirstFragment extends Fragment {

    public FirstFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        return  view;
    }
}
