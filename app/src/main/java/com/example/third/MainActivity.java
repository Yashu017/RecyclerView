package com.example.third;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import adapter.my_adapter;
import model.ListItem;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private RecyclerView.Adapter adapter;
private List<ListItem> listitem;
    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView) findViewById(R.id.recyclerViewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listitem=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            ListItem item =new ListItem(
                    "Item" + (i+1),
                    "Description",
                   "review" );

            listitem.add(item);

        }
        adapter=new my_adapter(this, listitem);
        recyclerView.setAdapter(adapter);
    }
}
