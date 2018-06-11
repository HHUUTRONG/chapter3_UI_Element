package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listView extends AppCompatActivity {

    ListView lv_friusts;
    String [] fruits = {"apple", "banana", "chuoi", "sdsdsds", "fdffdfdfd", "sffdfd", "daad", "wwwwwwww", "qwqwqwqw", "dsdfdfdf"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lv_friusts = findViewById(R.id.liv_fruits);

        ArrayAdapter<String> da = new ArrayAdapter<String>(this, R.layout.listitem, R.id.tw_item, fruits);

        lv_friusts.setAdapter(da);
    }
}
