package com.example.myfoodapp.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.databinding.FragmentGalleryBinding;
import com.example.myfoodapp.ui.adapters.DailyMealAdapter;
import com.example.myfoodapp.ui.models.DailyMealModel;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.daily_meal_fragment, container, false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast, "Alimentação","30% OFF","Descrição Comida","breakfast"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch, "Lanches","30% OFF","Descrição Comida","lunch"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner, "Jantar","50% OFF","Descrição Comida","dinner"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets, "Doces","10% OFF","Descrição Comida","sweets"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffe, "Cafés","20% OFF","Descrição Comida","coffee"));

        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();

        return root;
    }
}
