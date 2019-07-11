package com.practice.nav;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String record;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
       final TextView diplay = (TextView)findViewById(R.id.textView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (MainActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.entry));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        record = "500";
                        diplay.setText(record);
                        break;

                    case 1:
                        record = "130";
                        diplay.setText(record);
                        break;

                    case 2:
                        record = "230";
                        diplay.setText(record);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

}
