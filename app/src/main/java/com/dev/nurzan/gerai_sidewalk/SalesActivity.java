package com.dev.nurzan.gerai_sidewalk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class SalesActivity extends AppCompatActivity {

    private static final String TAG = "SalesActivity";
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    ArrayList<String> recipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);
        Log.d(TAG, "onCreate SalesActivity: started");

        for (int i = 0; i < 10 ; i++) {
            recipes.add("Damn this is test no. " + i);
        }

        recipes = new ArrayList<>();
        recyclerView = findViewById(R.id.recyler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new salesAdapter(recipes);
        recyclerView.setAdapter(adapter);

    }


}


