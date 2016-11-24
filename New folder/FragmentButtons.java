package com.example.cstuser.assignment4;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cstuser on 11/24/2016.
 */
public class FragmentButtons extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //---Inflate (or expand or fill) the layout for this fragment---
        return inflater.inflate(R.layout.activity_frag_buttons, container, false);
    }
}
