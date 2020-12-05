package com.example.geekappweather;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private final String TAG = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
//        setContentView(R.layout.setting);
//        setContentView(R.layout.city_search);

        Toast.makeText(getApplicationContext(), "First: onCreate()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "First: onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(getApplicationContext(), "First: onStart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "First: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getApplicationContext(), "First: onResume()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "First: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(getApplicationContext(), "First: onPause()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "First: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(getApplicationContext(), "First: onStop()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "First: onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(getApplicationContext(), "First: onRestart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "First: onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(getApplicationContext(), "First: onDestroy()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "First: onDestroy()");
    }

}