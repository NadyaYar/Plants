package com.example.plants;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Planet> planetArrayList;

    private static CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        planetArrayList = new ArrayList<>();

        Planet planet = new Planet("Earth", "1", R.drawable.earth);
        Planet planet1 = new Planet("Venus", "0", R.drawable.venera);
        Planet planet2 = new Planet("Mercury", "0", R.drawable.mercu);
        Planet planet3 = new Planet("Mars", "2", R.drawable.mars);
        Planet planet4 = new Planet("Jupiter", "95", R.drawable.upiter);
        Planet planet5 = new Planet("Saturn", "145", R.drawable.saturn);
        Planet planet6 = new Planet("Uranus", "27", R.drawable.uran);
        Planet planet7 = new Planet("Neptune", "14", R.drawable.neptun);
        Planet planet8 = new Planet("Pluto", "5", R.drawable.pluton);

        planetArrayList.add(planet);
        planetArrayList.add(planet1);
        planetArrayList.add(planet2);
        planetArrayList.add(planet3);
        planetArrayList.add(planet4);
        planetArrayList.add(planet5);
        planetArrayList.add(planet6);
        planetArrayList.add(planet7);
        planetArrayList.add(planet8);

        adapter = new CustomAdapter(getApplicationContext(), planetArrayList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,
                        "Planet Name: " + adapter.getItem(i).getPlanetName(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}