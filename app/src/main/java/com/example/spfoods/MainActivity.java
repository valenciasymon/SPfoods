package com.example.spfoods;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[];
    int images [] = {R.drawable.dimsum,R.drawable.noodles,R.drawable.pastery,R.drawable.soup,R.drawable.burger,R.drawable.friednoodles,R.drawable.shawarma,R.drawable.hotdog};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.cuisine_it);
        s1 = getResources().getStringArray(R.array.cuisine_types);

        CuisineAdapter cuisineAdapter = new CuisineAdapter(this,s1,images);
        recyclerView.setAdapter(cuisineAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}