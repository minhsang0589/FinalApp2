package com.example.tranvanha.finalapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class Mani2Activity extends AppCompatActivity implements AdapterItembon.Update {
    ArrayList<Dulieu_itembon> arrayItem;
    AdapterItembon adapterItembon ;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mani2);
        arrayItem=dulieu();
        recyclerView=findViewById(R.id.recyclerviewitembon);
        adapterItembon=new AdapterItembon(arrayItem,this);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(adapterItembon);



    }
    private ArrayList<Dulieu_itembon> dulieu(){
        ArrayList<Dulieu_itembon> arrayList=new ArrayList<>();
        arrayList.add(new Dulieu_itembon((R.drawable.noithietbi),"Đấu nối thiết bị"));
        arrayList.add(new Dulieu_itembon((R.drawable.nhienlieu),"Calib nhiên liệu"));
        arrayList.add(new Dulieu_itembon((R.drawable.usbcable),"Đấu nối lại sim"));
        arrayList.add(new Dulieu_itembon((R.drawable.user),"Cập nhật thông tin khách hàng"));
        return arrayList;
    }

    @Override
    public void Onupdate(int Index) {

    }
}
