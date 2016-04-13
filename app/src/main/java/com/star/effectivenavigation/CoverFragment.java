package com.star.effectivenavigation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class CoverFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_cover, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.cover_label);
        textView.setText(R.string.cover);

        return rootView;
    }

}
