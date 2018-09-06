package com.dev.nurzan.gerai_sidewalk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;

/**
 * Created by Nurzan Mohd Jefry on 2018096
 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: MainActivity");
        setContentView(R.layout.activity_main);




    }

    public void openSalesActivity(View view){

        Intent intent = new Intent(MainActivity.this, SalesActivity.class);
        startActivity(intent);
    }

    public void openCreateItem(View view){
        Intent intent = new Intent(MainActivity.this, CreateItem.class);
        startActivity(intent);
    }


}
