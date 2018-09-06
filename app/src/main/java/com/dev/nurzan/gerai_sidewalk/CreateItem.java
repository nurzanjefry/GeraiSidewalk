package com.dev.nurzan.gerai_sidewalk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;

/**
 * Created by Nurzan Mohd Jefry on 2018096
 */


public class CreateItem extends AppCompatActivity {

    private static final String TAG = "CreateItem";

    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        Log.d(TAG, "onCreate: CreateItem started");
        setContentView(R.layout.create_item);
    }
}
