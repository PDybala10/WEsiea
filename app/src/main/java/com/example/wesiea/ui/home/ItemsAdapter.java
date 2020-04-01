package com.example.wesiea.ui.home;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wesiea.R;

import java.util.ArrayList;
import java.util.Random;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemViewHolder> {
    private ArrayList<ItemsGenerate> mItemList;
    LinearLayout layoutCard;
    int couleur;

    public static class ItemViewHolder extends RecyclerView.ViewHolder{
        public TextView ville;
        public ImageView image;
        public TextView temperature;
        public TextView heure;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            ville = itemView.findViewById(R.id.itemVille);
            image = itemView.findViewById(R.id.itemImage);
            temperature = itemView.findViewById(R.id.itemTemperature);
            heure = itemView.findViewById(R.id.itemHeure);
        }
    }

    public ItemsAdapter(ArrayList<ItemsGenerate> itemList){
            mItemList = itemList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //layoutCard.findViewById(R.id.layoutCard);
        //layoutCard.setBackground(layoutCard.getResources().getDrawable(R.drawable.card_shape));
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycleview, parent, false);

        couleur++;
        switch (couleur%4) {
            case 0 :
                view.findViewById(R.id.layoutCard).setBackground(view.getResources().getDrawable(R.drawable.card_shape2));
                break;
            case 1 :
                view.findViewById(R.id.layoutCard).setBackground(view.getResources().getDrawable(R.drawable.card_shape));
                break;
            case 2 :
                view.findViewById(R.id.layoutCard).setBackground(view.getResources().getDrawable(R.drawable.card_shape3));
                break;
            case 3 :
                view.findViewById(R.id.layoutCard).setBackground(view.getResources().getDrawable(R.drawable.card_shape1));
                break;
        }

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("suis dedans1");

            }
        });
        ItemViewHolder evh = new ItemViewHolder(view);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        ItemsGenerate currentItem = mItemList.get(position);
        holder.heure.setText(currentItem.getHeure());
        holder.image.setImageResource(currentItem.getImage());
        holder.temperature.setText(currentItem.getTemperature());
        holder.ville.setText(currentItem.getVille());

    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }




}
