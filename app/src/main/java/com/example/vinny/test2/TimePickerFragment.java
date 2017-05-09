package com.example.vinny.test2;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by vinny on 03/05/2017.
 */

public class TimePickerFragment extends android.support.v4.app.DialogFragment implements TimePickerDialog.OnTimeSetListener {

        @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current time as the default values for the picker
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        // Create a new instance of TimePickerDialog and return it
        return new TimePickerDialog(getActivity(), 2, this, hour, minute,
            DateFormat.is24HourFormat(getActivity()));
        }

        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            Context context = getContext();
            CharSequence text = hourOfDay + ":" + minute;
//            ((MyVariables) this.getContext().getApplicationContext()).setTime_f(hourOfDay, minute);

            Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
            toast.show();
        }

}
