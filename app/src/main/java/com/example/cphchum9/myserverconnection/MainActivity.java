package com.example.cphchum9.myserverconnection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText addBox;
    private Button addButt;
    private ListView dataView;
    private MySQLConnect mySQLConnect;
    private List<String> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        update();
    }

    public  void  update(){
        items = mySQLConnect.getData();
        dataView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));

    }
    public void init(){
        addBox =(EditText)findViewById(R.id.addBox);
        addButt = (Button) findViewById(R.id.addButt);
        dataView = (ListView) findViewById(R.id.dataView);
        mySQLConnect = new MySQLConnect(MainActivity.this);
    }
}
