package com.example.tablayoutviewpager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ShoeAdapter extends RecyclerView.Adapter<ShoeAdapter.ShoeViewHolder> {

    private List<Shoe> shoeList;

    public ShoeAdapter(List<Shoe> shoeList) {
        this.shoeList = shoeList;
    }

    @NonNull
    @Override
    public ShoeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shoe, parent, false);
        return new ShoeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoeViewHolder holder, int position) {
        Shoe shoe = shoeList.get(position);
        holder.tvName.setText(shoe.getName());
        holder.tvDescription.setText(shoe.getDescription());
        holder.tvDatePrice.setText(shoe.getDate() + " - " + shoe.getPrice());
        // For demonstration, using a default icon. In a real app, you'd load from resource or URL.
        // holder.imgShoe.setImageResource(shoe.getImageResId());
    }

    @Override
    public int getItemCount() {
        return shoeList.size();
    }

    static class ShoeViewHolder extends RecyclerView.ViewHolder {
        ImageView imgShoe;
        TextView tvName, tvDescription, tvDatePrice;

        public ShoeViewHolder(@NonNull View itemView) {
            super(itemView);
            imgShoe = itemView.findViewById(R.id.imgShoe);
            tvName = itemView.findViewById(R.id.tvName);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            tvDatePrice = itemView.findViewById(R.id.tvDatePrice);
        }
    }
}
