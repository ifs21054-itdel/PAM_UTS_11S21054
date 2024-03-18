package com.ifs21054.dinopedia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SubDataAdapter extends RecyclerView.Adapter<SubDataAdapter.ViewHolder> {

    private ArrayList<String> arrayListData;
    private Context context;

    // Array untuk nama dinosaurus
    private String[] dinosaurNames = {"T-Rex", "Brontosaurus", "Barapasaurus", "Argentinosaurus", "Brachiosaurus",
            "Stegosaurus", "Allosaurus", "Triceratops", "Velociraptor", "Dilophosaurus", "Shinosaurus",
            "Ankylosaurus", "Apatosaurus", "Archaeopteryx", "Corythosaurus","Corythosaurus","Corythosaurus","Corythosaurus","Corythosaurus", "Corythosaurus", "Corythosaurus", "Corythosaurus", "Corythosaurus", "Corythosaurus"};

    // Array untuk ID gambar dinosaurus di drawable
    private int[] dinosaurImages = {R.drawable.argentinosaurus, R.drawable.barapasaurus, R.drawable.barapasaurus, R.drawable.argentinosaurus, R.drawable.barapasaurus,
            R.drawable.argentinosaurus, R.drawable.argentinosaurus, R.drawable.barapasaurus, R.drawable.argentinosaurus, R.drawable.argentinosaurus,
            R.drawable.barapasaurus, R.drawable.argentinosaurus, R.drawable.barapasaurus, R.drawable.argentinosaurus, R.drawable.argentinosaurus, R.drawable.argentinosaurus, R.drawable.argentinosaurus, R.drawable.argentinosaurus,R.drawable.argentinosaurus, R.drawable.argentinosaurus, R.drawable.argentinosaurus, R.drawable.argentinosaurus, R.drawable.argentinosaurus, R.drawable.argentinosaurus, R.drawable.argentinosaurus};

    public SubDataAdapter(ArrayList<String> arrayListData, Context context) {
        this.arrayListData = arrayListData;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_sub_data,
                parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Ambil data dari array sesuai posisi
        String dinosaurName = arrayListData.get(position);

        // Set data ke tampilan
        holder.tvDinosaurName.setText(dinosaurNames[position]);
        holder.ivDinosaurImage.setImageResource(dinosaurImages[position]);
    }

    @Override
    public int getItemCount() {
        return arrayListData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        // Deklarasi komponen tampilan
        ImageView ivDinosaurImage;
        TextView tvDinosaurName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // Inisialisasi komponen tampilan
            ivDinosaurImage = itemView.findViewById(R.id.ivDinosaurImage);
            tvDinosaurName = itemView.findViewById(R.id.tvDinosaurName);
        }
    }
}
