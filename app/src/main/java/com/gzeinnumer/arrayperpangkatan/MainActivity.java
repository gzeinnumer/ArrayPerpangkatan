package com.gzeinnumer.arrayperpangkatan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] dataArray = new int[]{1,2,3,4,5};

        int defaultNumber = 2;

        int value = 1;

        for (int i=0; i<dataArray.length; i++){
            for (int k=0; k<dataArray[i]; k++){
                value = value * defaultNumber;
            }
            Log.d(TAG, "onCreate: "+ value);
            value = 1;
        }
    }
}
