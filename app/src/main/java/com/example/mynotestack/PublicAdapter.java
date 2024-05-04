package com.example.mynotestack;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.type.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PublicAdapter extends RecyclerView.Adapter<PublicAdapter.PublicViewHolder> {
    Context context;
    List<MyPublicActivity.DataDetail> list;


    PublicAdapter(List<MyPublicActivity.DataDetail> list, Context context){
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public PublicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_public_item,parent,false);
        return new PublicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PublicViewHolder holder, int position) {
        Context context = holder.itemView.getContext();
        holder.name.setText(list.get(position).name);
        holder.bio.setText(list.get(position).bio);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PublicViewHolder extends RecyclerView.ViewHolder {
        TextView name,bio;
        ViewGroup view_group;
        public PublicViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.pub_item_name1);
            bio = itemView.findViewById(R.id.pub_item_bio1);
            view_group = itemView.findViewById(R.id.llmain);
        }
    }
}
