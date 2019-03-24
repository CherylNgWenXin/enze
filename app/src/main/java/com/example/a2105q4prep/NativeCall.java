package com.example.a2105q4prep;

import android.app.Activity;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;


public class NativeCall extends AsyncTask<String, Void, String> {
    WeakReference<Activity> wr_act;
    long startTime;
    long stopTime;
    long totalTime;

    // TODO write the boilerplate to load native-lib.cpp
    static {
        System.loadLibrary("shanative-lib");
    }
    private native String shaMe(String num);
    // TODO and declare the n
    // ative functions factorialNR and factorialNI here

    public NativeCall(Activity act) {
        wr_act = new WeakReference<>(act);
    }


    @Override
    protected String doInBackground(String... inputs) {

        // TODO start timing how long the computation will take

        // TODO do some switch block to call the appropriate function based on the radio button

        // TODO stop timing here (i.e., substract the starting time)

        // TODO edit cos this is wrong obviously

        String value = inputs[0];
        String result = "";

        // Start timing how long the computation will take
        startTime = System.currentTimeMillis();

        // Call the appropriate function based on the radio button
        return "test";
        /*
        result = shaMe(value);
        // Stop timing
        stopTime = System.currentTimeMillis();
        totalTime = stopTime - startTime;

        Log.d("FactorialTask", result);
        return result;
        */

    }

    @Override
    protected void onPostExecute(String result) {
        // only do stuff if if activity still alive
        /*
        Activity act = wr_act.get();
        if (act != null) {
            Toast.makeText(act.getApplicationContext(),"took " + totalTime + "ms", Toast.LENGTH_SHORT).show();
            TextView output = act.findViewById(R.id.result);
            output.setText(result);
        }
        */
    }
    // TODO override other necessary methods of AsyncTask to show results on UI thread safely
}
