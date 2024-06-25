package com.example.todo_list;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addData;
        EditText addTask,addDesc;
        addData=findViewById(R.id.addData);
        addTask=findViewById(R.id.addTask);
        addDesc=findViewById(R.id.addDesc);

        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listData = new Intent(MainActivity.this, todo_list.class);
                startActivity(listData);
            }
        });
    }
}