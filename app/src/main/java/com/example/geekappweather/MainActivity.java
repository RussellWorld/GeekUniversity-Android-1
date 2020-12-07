package com.example.geekappweather;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bSearchCity = findViewById(R.id.search_city_button);
        bSearchCity.setOnClickListener(view -> {
            Intent intentSearchCityActivity = new Intent(MainActivity.this, SearchCityActivity.class);
            startActivity(intentSearchCityActivity);
        });

        Button bSetting = findViewById(R.id.setting_main_button);
        bSetting.setOnClickListener(view -> {
            Intent intentSettingActivity = new Intent(MainActivity.this, SettingActivity.class);
            startActivity(intentSettingActivity);
        });

        TextView textCity = findViewById(R.id.text_city);
        Intent intentStartedThisActivity = getIntent();
        if (intentStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            String textEntered = intentStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);
            textCity.setText(textEntered);
        }
        Button bBrowser = findViewById(R.id.browser_main_button);
        bBrowser.setOnClickListener(view -> {
            Uri site = Uri.parse("https://yandex.ru/pogoda");
            Intent intentSite = new Intent(Intent.ACTION_VIEW, site);
            startActivity(intentSite);
        });
    }
}