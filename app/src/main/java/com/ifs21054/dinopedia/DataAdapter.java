package com.ifs21054.dinopedia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    Context context;
    ArrayList<String> arrayList;

    DataAdapter(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_data,
                parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.ViewHolder holder, int position) {
        holder.tvListData.setText(arrayList.get(position));

        ArrayList<String> arrayListData = new ArrayList<>();

        for (int i = 1; i <= 1; i++) {
            arrayListData.add("T-rex " + i);
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        holder.rvListData.setLayoutManager(linearLayoutManager);

        SubDataAdapter subDataAdapter = new SubDataAdapter(arrayListData, context);
        holder.rvListData.setAdapter(subDataAdapter);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvListData;
        RecyclerView rvListData;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvListData = itemView.findViewById(R.id.tvListData);
            rvListData = itemView.findViewById(R.id.rvListData);
        }
    }
}
