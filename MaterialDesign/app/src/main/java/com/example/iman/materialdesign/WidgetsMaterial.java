package com.example.iman.materialdesign;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gc.materialdesign.widgets.ColorSelector;
import com.gc.materialdesign.widgets.Dialog;
import com.gc.materialdesign.widgets.SnackBar;

public class WidgetsMaterial extends Fragment {
    // TODO: Rename and change types of parameters

    public WidgetsMaterial() {

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        SnackBar snackbar = new SnackBar(getActivity(), "Hello ", "Hello", null);
        snackbar.show();

        Dialog dialog = new Dialog(getContext(), "Hello World", "Do you want to do blablabla?");
        dialog.show();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_widgets_material, container, false);
    }

}
