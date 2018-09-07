package com.dev.nurzan.gerai_sidewalk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Nurzan Mohd Jefry on 2018096
 */


public class CreateItem extends AppCompatActivity {

    private static final String TAG = "CreateItem";
    EditText itemName, itemDesc, itemRemark, itemPrice;
    Button saveItemButton, clearItemButton;
    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        Log.d(TAG, "onCreate: CreateItem started");
        setContentView(R.layout.create_item);

        itemName = findViewById(R.id.itemName);
        itemDesc = findViewById(R.id.itemDesc);
        itemRemark = findViewById(R.id.itemRemark);
        itemPrice = findViewById(R.id.itemPrice);
        saveItemButton = findViewById(R.id.saveItemButton);
        clearItemButton = findViewById(R.id.clearItemButton);

        saveItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 6/9/2018 save to database 
                Log.d(TAG, "\nsaveItemButton clicked: " +
                        "\nitemName: " + itemName.getText().toString()
                        + "\nitemDesc: " + itemDesc.getText().toString()
                        + "\nitemRemark: " + itemRemark.getText().toString()
                        + "\nitemPrice: " + itemPrice.getText().toString());
            }
        });

        clearItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 6/9/2018 add for loop and use array, too redundant
                itemName.getText().clear();
                itemDesc.getText().clear();
                itemRemark.getText().clear();
                itemPrice.getText().clear();
                //to refocus on itemName
                itemName.requestFocus();
            }
        });
    }
}
