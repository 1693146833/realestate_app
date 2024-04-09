package com.example.realestate.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.realestate.Domain.ItemsDmain;
import com.example.realestate.R;
import com.example.realestate.activities.DetialActivity;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder>{


    private ArrayList<ItemsDmain> itemsDmainList;
    private DecimalFormat formatter;
    private Context context;
    public ItemsAdapter(ArrayList<ItemsDmain> itemsDmainList) {
        this.itemsDmainList = itemsDmainList;
        formatter= new DecimalFormat("###,###,###,###.##");
    }
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_viewholder, parent, false);
        context = parent.getContext();
        return new ItemsViewHolder(view);
    }

    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position) {
        ItemsDmain itemsDmain = itemsDmainList.get(position);
        holder.title.setText(itemsDmain.getTitle());
        //holder.description.setText(itemsDmain.getDescription());
        holder.address.setText(itemsDmain.getAddress());
        holder.price.setText("$"+formatter.format(itemsDmain.getPrice()));
//        holder.bed.setText(String.valueOf(itemsDmain.getBed()));
//        holder.bath.setText(String.valueOf(itemsDmain.getBath()));
//        holder.wifi.setText(itemsDmain.isWifi() ? "Yes" : "No");
        int drawableResourceId = context.getResources().getIdentifier(itemsDmain.getPic(), "drawable", context.getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableResourceId).into(holder.pic);
//        Glide.with(holder.itemView.getContext()).load(itemsDmain.getPic()).into(holder.pic);
        holder.itemView.setOnClickListener(v->{
            Intent intent = new Intent(context, DetialActivity.class);
            intent.putExtra("object", itemsDmain);
            context.startActivity(intent);
        });
    }

    public int getItemCount() {
        return itemsDmainList.size();
    }

    public class ItemsViewHolder extends RecyclerView.ViewHolder {
//        TextView title, description, address, price, bed, bath, wifi;
        //CardView cardView;
        TextView title, address, price;
        ImageView pic;

        public ItemsViewHolder(@NonNull View itemView) {
            super(itemView);
            //cardView = itemView.findViewById(R.id.cardText);
            title = itemView.findViewById(R.id.titleText);
//            description = itemView.findViewById(R.id.descriptionText);
            address = itemView.findViewById(R.id.addressText);
            price = itemView.findViewById(R.id.priceText);
//            bed = itemView.findViewById(R.id.bed);
//            bath = itemView.findViewById(R.id.bath);
//            wifi = itemView.findViewById(R.id.wifi);
            pic = itemView.findViewById(R.id.pic);
        }
    }

}


//package com.example.realestate.Adapter;
//
//import android.content.Context;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//import com.bumptech.glide.Glide;
//import com.example.realestate.Domain.ItemsDmain;
//import com.example.realestate.R;
//import com.example.realestate.activities.DetialActivity;
//import java.text.DecimalFormat;
//import java.util.ArrayList;
//
//public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder>{
//
//    private ArrayList<ItemsDmain> itemsDmainList;
//    private Context context;
//
//    public ItemsAdapter(ArrayList<ItemsDmain> itemsDmainList) {
//        this.itemsDmainList = itemsDmainList;
//    }
//
//    @NonNull
//    @Override
//    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_viewholder, parent, false);
//        context = parent.getContext();
//        return new ItemsViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position) {
//        ItemsDmain itemsDmain = itemsDmainList.get(position);
//        holder.title.setText(itemsDmain.getTitle());
//        holder.address.setText(itemsDmain.getAddress());
//        holder.price.setText(String.valueOf(itemsDmain.getPrice()));
//        int drawableResourceId = context.getResources().getIdentifier(itemsDmain.getPic(), "drawable", context.getPackageName());
//        Glide.with(holder.itemView.getContext()).load(drawableResourceId).into(holder.pic);
//    }
//
//    @Override
//    public int getItemCount() {
//        return itemsDmainList.size();
//    }
//
//    public class ItemsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
//        TextView title, address, price;
//        ImageView pic;
//
//        public ItemsViewHolder(@NonNull View itemView) {
//            super(itemView);
//            title = itemView.findViewById(R.id.titleText);
//            address = itemView.findViewById(R.id.addressText);
//            price = itemView.findViewById(R.id.priceText);
//            pic = itemView.findViewById(R.id.pic);
//            itemView.setOnClickListener(this);
//        }
//
//        @Override
//        public void onClick(View v) {
//            int position = getAdapterPosition();
//            if (position != RecyclerView.NO_POSITION) {
//                ItemsDmain itemsDmain = itemsDmainList.get(position);
//                Intent intent = new Intent(context, DetialActivity.class);
//                intent.putExtra("item", itemsDmain);
//                context.startActivity(intent);
//            }
//        }
//    }
//}
