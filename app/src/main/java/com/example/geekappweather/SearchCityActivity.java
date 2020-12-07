package com.example.geekappweather;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SearchCityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_city);

        EditText editCity = findViewById(R.id.editText_city);

        Button bOkSearch = findViewById(R.id.ok_button_search);
        bOkSearch.setOnClickListener(view -> {
            String textEntered = editCity.getText().toString();
            Intent intentBackCityActivity = new Intent(SearchCityActivity.this, MainActivity.class);
            intentBackCityActivity.putExtra(Intent.EXTRA_TEXT, textEntered);
            startActivity(intentBackCityActivity);
        });

    }
}