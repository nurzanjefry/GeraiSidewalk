package com.dev.nurzan.gerai_sidewalk;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/*
 * Created by nurzanjefry on 12/9/2018
 */

class salesAdapter extends RecyclerView.Adapter<salesAdapter.ViewHolder> {

    ArrayList<String> recipes;


    public salesAdapter(ArrayList<String> recipes) {
        this.recipes = recipes;
    }


    @Override
    public salesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_item, parent, false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(salesAdapter.ViewHolder holder, int position) {
        holder.itemName.setText(recipes.get(position));
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView itemName;

        public ViewHolder(View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.item_name);
        }
    }
}
