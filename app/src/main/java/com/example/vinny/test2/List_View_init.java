package com.example.vinny.test2;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vinny on 5/11/17.
 */

public class List_View_init extends AppCompatActivity {
    private EditText editText;
    private Button btn;
    private android.widget.ListView list10;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main_activity);
        setContentView(R.layout.list_item);

        editText = (EditText) findViewById(R.id.editlist);
        btn = (Button) findViewById(R.id.btn10);
        list10 = (android.widget.ListView) findViewById(R.id.list_0);
        arrayList = new ArrayList<String>();

        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayList);
        list10.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.add(editText.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

    }
}
