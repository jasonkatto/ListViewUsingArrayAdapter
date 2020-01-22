package com.jk.listviewusingarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView arrayListView;
    String  countryList[] =
            {
                    "Iraq",
                    "USA",
                    "Canada",
                    "France",
                    "UK"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayListView=findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<>
                (this, R.layout.listview_row, R.id.textView, countryList);
        arrayListView.setAdapter(arrayAdapter);
    }
}
