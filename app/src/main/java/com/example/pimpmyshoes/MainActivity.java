package com.example.pimpmyshoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // list of items
        List<HighTechItem> highTechItemList=new ArrayList<>();
        highTechItemList.add(new HighTechItem("PURPLE BLACK","AIR JORDAN 1 LOW GS"));
        highTechItemList.add(new HighTechItem("PLAYFUL PINK","PARRIS GOEBEL  X \n NIKE DUNK LOW"));
        highTechItemList.add(new HighTechItem("REVERSE NEON","NIKE AIR MAX 95"));

        // Recuperer notre list  View
       ListView shopListView = findViewById(R.id.List_View);
       shopListView.setAdapter(new HighTechItemAdapter(this,  highTechItemList));
    }


}