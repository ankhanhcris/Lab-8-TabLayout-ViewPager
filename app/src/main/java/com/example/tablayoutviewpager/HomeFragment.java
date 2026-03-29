package com.example.tablayoutviewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    public HomeFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewShoes);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        
        // Thêm đường kẻ giữa các item
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                LinearLayoutManager.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

        List<Shoe> shoeList = new ArrayList<>();
        shoeList.add(new Shoe("Nike Mercurial Superfly 9", "Bright Crimson/White", "10/25/2023", "$275", 0));
        shoeList.add(new Shoe("Adidas Predator Accuracy", "Core Black/White/Team Shock Pink", "11/02/2023", "$250", 0));
        shoeList.add(new Shoe("Puma Future Ultimate", "Blue Glimmer/White/Ultra Orange", "11/15/2023", "$220", 0));
        shoeList.add(new Shoe("Mizuno Morelia Neo III Beta", "Made in Japan Edition - White/Gold", "12/01/2023", "$300", 0));
        shoeList.add(new Shoe("Nike Phantom GX Elite", "Hyper Turquoise/Fuchsia Dream", "12/10/2023", "$260", 0));

        ShoeAdapter adapter = new ShoeAdapter(shoeList);
        recyclerView.setAdapter(adapter);
    }
}
