package com.example.homwork3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> foodList;
    private FoodAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv_food);
        loaData();
        adapter=new FoodAdapter(foodList);
        recyclerView.setAdapter(adapter);
        
        
    }

    private void loaData() {
        foodList= new ArrayList<>();
        foodList.add("Стейк");
        foodList.add("Манты");
        foodList.add("Самсы");
        foodList.add("лагман");
        foodList.add("Кебаб");
        foodList.add("Рамен");
        foodList.add("Плов");
        foodList.add("Пильмен");
        foodList.add("Бешбармак");
        foodList.add("Биштекст");
        foodList.add("Шорпо");
        foodList.add("Дымдама");



    }
}