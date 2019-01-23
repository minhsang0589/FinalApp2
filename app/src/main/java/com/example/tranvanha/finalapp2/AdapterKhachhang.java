package com.example.tranvanha.finalapp2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterKhachhang extends RecyclerView.Adapter<AdapterKhachhang.MyviewHolder>{
ArrayList<Khachhang> arrayList=new ArrayList<>();
Context mcontet;

    public AdapterKhachhang(ArrayList<Khachhang> arrayList, Context mcontet) {
        this.arrayList = arrayList;
        this.mcontet = mcontet;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_khachhang, viewGroup,false);
        return new MyviewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder myviewHolder, int i) {
        myviewHolder.imvnguoidung.setImageResource(R.drawable.user);
        myviewHolder.imvemail.setImageResource(R.drawable.email);
        myviewHolder.tendangnhap.setText("Tên đăng nhập");
        myviewHolder.tennguoidung.setText(arrayList.get(i).getTendangnhap());
        myviewHolder.emailtd.setText("Email");
        myviewHolder.emailnguoidung.setText(arrayList.get(i).getEmail());


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


     class MyviewHolder extends RecyclerView.ViewHolder {
        ImageView imvnguoidung;
        ImageView imvemail;
        TextView tendangnhap;
        TextView tennguoidung;
        TextView emailtd;
        TextView emailnguoidung;
        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            imvnguoidung=itemView.findViewById(R.id.imv_user_item);
            imvemail=itemView.findViewById(R.id.imv_email_item);
            tendangnhap=itemView.findViewById(R.id.tv_tendangnhap_item);
            tennguoidung=itemView.findViewById(R.id.tv_tennguoidung_item);
            emailtd=itemView.findViewById(R.id.tv_email_item);
            emailnguoidung=itemView.findViewById(R.id.tv_emailnguoidung_item);




        }
    }

    public static class Khachhang {
    String tendangnhap;
    String email;

        public Khachhang(String tendangnhap, String email) {
            this.tendangnhap = tendangnhap;
            this.email = email;
        }

        public String getTendangnhap() {
            return tendangnhap;
        }

        public void setTendangnhap(String tendangnhap) {
            this.tendangnhap = tendangnhap;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
