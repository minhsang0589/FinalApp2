package com.example.tranvanha.finalapp2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterItembon extends RecyclerView.Adapter<AdapterItembon.holder> {
    ArrayList<Dulieu_itembon> arrayList=new ArrayList<>();
    Context context;

    public AdapterItembon(ArrayList<Dulieu_itembon> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_bon, viewGroup,false);
        return new holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int i) {
        holder.imghinh.setImageResource(arrayList.get(i).getHinhanh());
        holder.tvTen.setText(arrayList.get(i).getTengoi());
        holder.imghinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),UpdateActivity.class);
                Activity ori=(Activity)context;
                ori.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class holder extends RecyclerView.ViewHolder{
        ImageView imghinh;
        TextView tvTen;
        public holder(@NonNull View itemView) {
            super(itemView);
            imghinh = (itemView).findViewById(R.id.imv_itembon);
            tvTen = (itemView).findViewById(R.id.tv_itmebon);
        }
    }
    public interface Update{
        void Onupdate(int Index);

    }

}
