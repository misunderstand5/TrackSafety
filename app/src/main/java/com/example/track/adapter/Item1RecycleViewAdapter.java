package com.example.track.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.track.R;
import com.example.track.entity.Item1;

import java.util.List;

public class Item1RecycleViewAdapter extends RecyclerView.Adapter<Item1RecycleViewAdapter.ViewHolder> {

    private List<Item1> list;


    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageButton itemImage;
        Button itemText;
        TextView watch;
        View line;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.item1_recycle_image);
            itemText = itemView.findViewById(R.id.item1_recycle_text);
            watch = itemView.findViewById(R.id.watch);
            line = itemView.findViewById(R.id.updownline);
        }
    }

    public Item1RecycleViewAdapter(List<Item1> list){
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview_item1,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item1 item1 = list.get(position);
        holder.itemImage.setImageResource(item1.getId());
        holder.itemText.setText(item1.getStr());
        holder.watch.setText(item1.getWatch());
        if (position == list.size()-1)
            holder.line.setVisibility(View.GONE);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
