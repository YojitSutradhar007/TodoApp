package com.example.todo_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class todo_list extends AppCompatActivity {

    ArrayList<todo_model> todoList = new ArrayList<todo_model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_list);
        RecyclerView todoListView =findViewById(R.id.recyclerview);
        todoListView.setLayoutManager(new LinearLayoutManager(this));

        todoList.add(new todo_model("a","d"));
        todoList.add(new todo_model("a","d"));
        todoList.add(new todo_model("a","d"));
        todoList.add(new todo_model("a","d"));
        todoList.add(new todo_model("a","d"));
        todoList.add(new todo_model("a","d"));

        TodoViewAdapter todoViewAdapter=new TodoViewAdapter(this,todoList);
        todoListView.setAdapter(todoViewAdapter);

    }
}