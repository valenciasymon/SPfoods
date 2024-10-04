package com.example.spfoods;

import android.os.Build;
import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    //recycler view
    RecyclerView recyclerView;
    String s1[];
    int images [] = {R.drawable.dimsum,R.drawable.noodles,R.drawable.pastery,R.drawable.soup,R.drawable.burger,R.drawable.friednoodles,R.drawable.shawarma,R.drawable.hotdog};

    //list view
    ListView listView;
    String s2[];
    int strimages [] = {R.drawable.aaafood,R.drawable.alibaba,R.drawable.charayice,R.drawable.gaerlan,R.drawable.geros,R.drawable.grannys,R.drawable.happiness,R.drawable.hotto,R.drawable.jdj,R.drawable.jfc,R.drawable.jsps,R.drawable.khay,R.drawable.patatas,R.drawable.rannez,R.drawable.franclark,R.drawable.jos};

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


        //recycler view
        recyclerView = findViewById(R.id.cuisine_it);
        s1 = getResources().getStringArray(R.array.cuisine_types);

        CuisineAdapter cuisineAdapter = new CuisineAdapter(this,s1,images);
        recyclerView.setAdapter(cuisineAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        //listview
        s2 = getResources().getStringArray(R.array.all_stores);
        listView = findViewById(R.id.storesLV);

        ListAdapt listAdapt = new ListAdapt(this,s2,strimages);
        listView.setAdapter(listAdapt);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.cream));
        }

    }
}