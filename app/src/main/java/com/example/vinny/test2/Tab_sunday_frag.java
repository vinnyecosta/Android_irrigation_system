package com.example.vinny.test2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by vinny on 26/04/2017.
 */

public class Tab_sunday_frag extends android.support.v4.app.Fragment{
    private EditText editText;
    private Button btn;
    private android.widget.ListView list10;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_sunday, container, false);
    }


}

