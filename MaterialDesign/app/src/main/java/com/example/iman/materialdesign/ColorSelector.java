package com.example.iman.materialdesign;


import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorSelector extends Fragment {


    public ColorSelector() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        com.gc.materialdesign.widgets.ColorSelector colorSelector = new com.gc.materialdesign.widgets.ColorSelector(getContext(), Color.BLACK, null);
        colorSelector.show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color_selector, container, false);
    }

}
