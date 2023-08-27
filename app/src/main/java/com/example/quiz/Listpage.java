package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Listpage extends AppCompatActivity {

    ListView listView;

    ArrayAdapter arrayAdapter;
    ArrayList<String> arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listpage);

        listView=findViewById(R.id.listview);

        arrayList.add("Shared Preference");
        arrayList.add("Introduction to Classes");
        arrayList.add("Working with UI Elements");


        arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(Listpage.this,secoundpage.class);
                intent.putExtra("postion",position);
                startActivity(intent);
            }
        });


    }
}