package com.example.vinny.test2;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Init_main extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.init_main);
//        EditText editTextFromTime = (EditText) findViewById(R.id.editTextFromTime);
//        SetTime fromTime = new SetTime(editTextFromTime, this);
    }

    public void CallMain(View view){
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    public void CallTab(View view){
        startActivity(new Intent(getApplicationContext(), MainTabActivity.class));
    }

    public void showTimePickerDialog(View v) {
        TimePickerFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }
}
;
//class SetTime implements View.OnFocusChangeListener, TimePickerDialog.OnTimeSetListener{
//    private EditText editText;
//    private java.util.Calendar myCalendar;
//    @RequiresApi(api = Build.VERSION_CODES.N)
//    public SetTime(EditText editText, Context ctx){
//        this.editText = editText;
//        this.editText.setOnFocusChangeListener(this);
//        this.myCalendar = java.util.Calendar.getInstance();
//    }
//
//    @Override
//    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//        this.editText.setText(hourOfDay + ":" + minute );
//    }
//
//    @RequiresApi(api = Build.VERSION_CODES.N)
//    @Override
//    public void onFocusChange(View v, boolean hasFocus) {
//        if (hasFocus) {
//            int hour = myCalendar.get(java.util.Calendar.HOUR_OF_DAY);
//            int minute = myCalendar.get(java.util.Calendar.MINUTE);
//            new TimePickerDialog(ctx, this, hour, minute, true).show();
//        }
//    }
//}
