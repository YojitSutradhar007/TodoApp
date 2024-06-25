package com.example.todo_list;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class TodoViewAdapter extends RecyclerView.Adapter<TodoViewAdapter.ViewHolder> {
    Context context;
    ArrayList<todo_model> todoData;

    TodoViewAdapter(Context context, ArrayList<todo_model> todoData){
        this.context=context;
        this.todoData=todoData;
    }

    @NonNull
    @Override
    public TodoViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.card_layout,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TodoViewAdapter.ViewHolder holder, int position) {
        holder.title.setText(todoData.get(position).title);
        holder.description.setText(todoData.get(position).description);

    }

    @Override
    public int getItemCount() {
        return todoData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title,description;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            description=itemView.findViewById(R.id.desc);
        }
    }
}
