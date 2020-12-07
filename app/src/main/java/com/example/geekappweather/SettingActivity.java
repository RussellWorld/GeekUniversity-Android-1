package com.example.geekappweather;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Button bOkSetting = findViewById(R.id.ok_botton_setting);
        bOkSetting.setOnClickListener(view -> {
            Intent intentBackSettingActivity = new Intent(SettingActivity.this,MainActivity.class);
            startActivity(intentBackSettingActivity);
        });
    }
}