package com.example.wesiea.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.wesiea.R;

import java.util.ArrayList;

public class HomeFragmentOffline extends Fragment {

    private HomeViewModelOffline homeViewModel;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<ItemsGenerate> itemsList = new ArrayList<ItemsGenerate>();

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        homeViewModel = ViewModelProviders.of(this).get(HomeViewModelOffline.class);
        View root = inflater.inflate(R.layout.fragment_home_offline, container, false);
       /* final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/

       itemsList.add(new ItemsGenerate("Moscou", R.drawable.neige, "-3", "12:58"));
       itemsList.add(new ItemsGenerate("Paris", R.drawable.pluie, "13", "12:58"));
       itemsList.add(new ItemsGenerate("Londre", R.drawable.nuage, "17", "12:58"));
       itemsList.add(new ItemsGenerate("Berlin", R.drawable.orage, "12", "12:58"));
       itemsList.add(new ItemsGenerate("Liège", R.drawable.sun, "22", "12:58"));
       itemsList.add(new ItemsGenerate("New york", R.drawable.vent, "15", "12:58"));
       itemsList.add(new ItemsGenerate("Yaoundé", R.drawable.soleilplein, "25", "12:58"));
       itemsList.add(new ItemsGenerate("Douala", R.drawable.nuage, "22", "12:58"));

        recyclerView = root.findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(root.getContext());
        adapter = new ItemsAdapter(itemsList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return root;

    }
}
