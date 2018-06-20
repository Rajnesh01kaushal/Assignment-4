package com.example.hp.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner country,cities;

    String[] countries = {"USA","India","Chennai","Ahmedabad"};
    String[] usacities = {"Delhi","Mumbai","Chennai","Ahmedabad"};
    String[] indiancities = {"Jaipur","Mumbai","Chennai","Ahmedabad"};
    String[] abccities = {"Delhi","Mumbai","Chennai","Ahmedabad"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        final Spinner spinnerDropdown;
        country = findViewById(R.id.country);
        cities = findViewById(R.id.cities);

//        String[] cities = {"Delhi","Mumbai","Chennai","Ahmedabad"};
//        spinnerDropdown =(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> countryAdapter = new ArrayAdapter<>( this,android.R.layout.simple_dropdown_item_1line,countries);
                country.setAdapter(countryAdapter);


//        spinnerDropdown.setAdapter(adapter);

        country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int Position, long id) {
//               int id=spinnerDropdown.getSelectedItemPosition();
//                Toast.makeText(getBaseContext(),"selected cities:" + Position,Toast.LENGTH_SHORT).show();
                if (Position == 0){
                    setAdapter(usacities);
                }
                else if (Position == 1){
                    setAdapter(indiancities);
                }
                else if (Position == 2) {
                    setAdapter(abccities);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });






    }

public void setAdapter(String[] citiesArray) {
    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>( this,android.R.layout.simple_dropdown_item_1line,citiesArray);
            cities.setAdapter(arrayAdapter);
}
}
