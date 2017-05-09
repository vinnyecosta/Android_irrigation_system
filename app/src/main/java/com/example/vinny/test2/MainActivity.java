package com.example.vinny.test2;

import android.os.AsyncTask;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.BufferedReader;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHttpResponse;
import org.json.JSONObject;

import android.content.Context;
import android.widget.TimePicker;
import android.widget.Toast;

import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        //new HTTPdemo().execute("");
    }

    public void Clique(View view){
        //if ("check here where network/internet is avaliable") {
        TextView textview = (TextView) findViewById(R.id.textView);
        Button btn6 = (Button) findViewById(R.id.button6);
        textview.setText(btn6.getText());
        //new HTTPdemo().execute("");
        new HTTPdemo().execute("");
        //}
    }
    //public void CallTab2(View view){
    //    startActivity(new Intent(getApplicationContext(), Main2Activity.class));
    //}
    public void msg(CharSequence params){
        Context context = getApplicationContext();
        CharSequence text = params.toString();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    private class HTTPdemo extends
            AsyncTask<String, Void, String> {

        @Override
        protected void onPreExecute() {
            msg("HELLO!!!");
        }

        @RequiresApi(api = Build.VERSION_CODES.M)
        @Override
        protected String doInBackground(String... params) {
            String result = SendDataFromAndroidDevice();
            return result;
        }

        @Override
        protected void onProgressUpdate(Void... values) {}

        @Override
        protected void onPostExecute(String result) {
            Context context = getApplicationContext();
            CharSequence text = "Hello toast2!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

            if (result != null && !result.equals("")) {
                try {
                    JSONObject resObject = new JSONObject(result);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private String SendDataFromAndroidDevice() {
        String result = "";
        TextView textview = (TextView) findViewById(R.id.textView);
        TimePicker timepicker = (TimePicker) findViewById(R.id.timePicker);

        try {
            HttpClient httpclient = new DefaultHttpClient();
            HttpGet getMethod = new HttpGet("http://192.168.43.125/?mon_hr_st1=&"+timepicker.getHour()+"=&"+timepicker.getMinute()+"=");

            BufferedReader in = null;
            BasicHttpResponse httpResponse = (BasicHttpResponse) httpclient.execute(getMethod);
            in = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));

            StringBuffer sb = new StringBuffer("");
            String line = "";
            while ((line = in.readLine()) != null) {
                sb.append(line);
            }
            in.close();
            result = sb.toString();

        } catch (Exception e) {
            //textview.setText();
            e.printStackTrace();
        }
        return result;
    }

}
