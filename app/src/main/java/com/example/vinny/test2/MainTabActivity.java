package com.example.vinny.test2;

import android.app.TimePickerDialog;
import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainTabActivity extends AppCompatActivity {
Toolbar toolbar;

    TabLayout tabLayout;
    @Override
//    private ArrayList<String> arraylist;
//    private ArrayAdapter<String> adapter;
//    private String txtInput;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab_activity);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        ListView listview = (ListView) findViewById(R.id.list);
//        String[] items={"Apples","Banana","Grape"};
//        arraylist = new ArrayList<>(Arrays.asList(items));
//        adapter = new ArrayAdapter<String>(this,R.layout.list_item, R.id.txtitem, arraylist);
//        listview.setAdapter(adapter);
//        txtInput = "OK";
//        Button btAdd = (Button) findViewById(R.id.button12);
//        btAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String newItem = "OK1";
//                arraylist.add(newItem);
//                adapter.notifyDataSetChanged();
//            }
//        });


        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new SimpleFragmentPageAdapter(getSupportFragmentManager(),this));
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }

    public void Call_set_monday(View view){
        //if ("check here where network/internet is avaliable") {
        TextView textview = (TextView) findViewById(R.id.textView4);
        Button btn11 = (Button) findViewById(R.id.button11);
        EditText edittext = (EditText) findViewById(R.id.editText);
        textview.setText(edittext.getText());

    }

//    public void Call_set_mond_t0(View view){
//        int hours = 0, min = 0;
//        TimePicker tp_all = (TimePicker) findViewById(R.id.timePicker_all);
//        hours = tp_all.getHour();
//        min = tp_all.getMinute();
//        TextView textview = (TextView) findViewById(R.id.textView4);
//        Button btn11 = (Button) findViewById(R.id.button11);
//        EditText edittext = (EditText) findViewById(R.id.editText);
//        textview.setText(edittext.getText());
//    }

    public void Show_timer(View view){
        int test;
        ViewPager viewpager= (ViewPager) findViewById(R.id.view_pager);
        CheckBox en_mon = (CheckBox) findViewById(R.id.en_mond);
//        TextView textview = (TextView) findViewById(R.id.textView2);
//        TimePicker tp_all = (TimePicker) findViewById(R.id.timePicker_all);
//        Button Set_mond_t0 = (Button) findViewById(R.id.Set_mond_t0);
//        Button Set_mond_t1 = (Button) findViewById(R.id.Set_mond_t1);
//        Button btn_ok_timer = (Button) findViewById(R.id.btn_ok_timer);
        test = viewpager.getCurrentItem();
//        Button btn_cancel_timer= (Button) findViewById(R.id.btn_cancel_timer);
/*        if(en_mon.isChecked()){
            textview.setText("OK");
            Set_mond_t0.setVisibility(View.VISIBLE);
            Set_mond_t1.setVisibility(View.VISIBLE);
        }
        else{
            textview.setText("NOK");
            tp_all.setVisibility(View.INVISIBLE);
            Set_mond_t0.setVisibility(View.INVISIBLE);
            Set_mond_t1.setVisibility(View.INVISIBLE);
            btn_cancel_timer.setVisibility(View.INVISIBLE);
            btn_ok_timer.setVisibility(View.INVISIBLE);
            Set_mond_t1.setEnabled(true);
            Set_mond_t0.setEnabled(true);
        }
*/

    }
//    public void Set_timer_on(View view){
//        Context string;
//        TextView textview = (TextView) findViewById(R.id.textView2);
//        TimePicker tp_all = (TimePicker) findViewById(R.id.timePicker_all);
//        Button btn_ok_timer = (Button) findViewById(R.id.btn_ok_timer);
//        Button btn_cancel_timer= (Button) findViewById(R.id.btn_cancel_timer);
//        Button Set_mond_t1 = (Button) findViewById(R.id.Set_mond_t1);
//        tp_all.setVisibility(View.VISIBLE);
//        btn_cancel_timer.setVisibility(View.VISIBLE);
//        btn_ok_timer.setVisibility(View.VISIBLE);
//        string =  tp_all.getContext();
//        Set_mond_t1.setEnabled(false);
//    }

//    public void Set_timer_run(View view){
//        TimePicker tp_all = (TimePicker) findViewById(R.id.timePicker_all);
//        Button btn_ok_timer = (Button) findViewById(R.id.btn_ok_timer);
//        Button btn_cancel_timer= (Button) findViewById(R.id.btn_cancel_timer);
//        Button Set_mond_t0 = (Button) findViewById(R.id.Set_mond_t0);
//        tp_all.setVisibility(View.VISIBLE);
//        btn_cancel_timer.setVisibility(View.VISIBLE);
//        btn_ok_timer.setVisibility(View.VISIBLE);
//        Set_mond_t0.setEnabled(false);
//    }

//    public void Set_timer_ok(View view){
//        //TODO set the buttons to their default states and store values set on timer
//        TimePicker tp_all = (TimePicker) findViewById(R.id.timePicker_all);
//        Button btn_ok_timer = (Button) findViewById(R.id.btn_ok_timer);
//        Button btn_cancel_timer= (Button) findViewById(R.id.btn_cancel_timer);
//        Button Set_mond_t1 = (Button) findViewById(R.id.Set_mond_t1);
//        Button Set_mond_t0 = (Button) findViewById(R.id.Set_mond_t0);
//        tp_all.setVisibility(View.INVISIBLE);
//        btn_cancel_timer.setVisibility(View.INVISIBLE);
//        btn_ok_timer.setVisibility(View.INVISIBLE);
//        Set_mond_t1.setEnabled(true);
//        Set_mond_t0.setEnabled(true);
//        msg("File saved on data base!");
//    }

//    public void Set_timer_cancel(View view){
//        //TODO set the buttons to their default states and store values set on timer
//        TimePicker tp_all = (TimePicker) findViewById(R.id.timePicker_all);
//        Button btn_ok_timer = (Button) findViewById(R.id.btn_ok_timer);
//        Button btn_cancel_timer= (Button) findViewById(R.id.btn_cancel_timer);
//        Button Set_mond_t1 = (Button) findViewById(R.id.Set_mond_t1);
//        Button Set_mond_t0 = (Button) findViewById(R.id.Set_mond_t0);
//        tp_all.setVisibility(View.INVISIBLE);
//        btn_cancel_timer.setVisibility(View.INVISIBLE);
//        btn_ok_timer.setVisibility(View.INVISIBLE);
//        Set_mond_t1.setEnabled(true);
//        Set_mond_t0.setEnabled(true);
//        msg("Setup NOT saved!");
//    }

    public void msg(CharSequence params){
        Context context = getApplicationContext();
        CharSequence text = params.toString();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void SetTime(View view) {
        final java.util.Calendar c = java.util.Calendar.getInstance();
        int hour = c.get(java.util.Calendar.HOUR_OF_DAY);
        int minute = c.get(java.util.Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(this, 2, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//                TextView editTextFromTime = (TextView) findViewById(R.id.textView2);
//                editTextFromTime.setText(hourOfDay + ":" + minute);
                // Set variable with the hour and time choosen
                ((MyVariables) getApplicationContext()).setTime_f(hourOfDay, minute);
            }
        }, hour, minute, true);
        //ANOTHER WAY TO CALL TIMEPICKER
//        DialogFragment newFragment  = new TimePickerFragment();
//        newFragment.show(getSupportFragmentManager(), "DIALOG_TIME");

        timePickerDialog.show();
}

    public void SetonTime(View view) {
        final java.util.Calendar c = java.util.Calendar.getInstance();
        int hour = 0;
        int minute = 0;

        TimePickerDialog timePickerDialog = new TimePickerDialog(this, 2, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//                TextView editTextFromTime = (TextView) findViewById(R.id.textView2);
//                editTextFromTime.setText(hourOfDay + ":" + minute);
                // Set variable with the hour and time choosen
                ((MyVariables) getApplicationContext()).setonTime_f(hourOfDay, minute);
            }
        }, hour, minute, true);
        timePickerDialog.show();
    }

    public void SaveTime(View view) {

        // Set the current tab being used
        ((MyVariables) this.getApplicationContext()).setTabday_f(tabLayout.getSelectedTabPosition());
        //TODO SEND INFO TO ESP8266 AT THIS POINT


    }
}

