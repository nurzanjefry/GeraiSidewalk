package com.dev.nurzan.gerai_sidewalk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

public class SalesActivity extends AppCompatActivity {

    private static final String TAG = "SalesActivity";
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);
        Log.d(TAG, "onCreate SalesActivity: started");


    }


}


