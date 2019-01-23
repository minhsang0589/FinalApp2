package com.example.tranvanha.finalapp2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class UpdateActivity extends AppCompatActivity {
    TextView sokhachhang;
    ArrayList<AdapterKhachhang.Khachhang> arrayList = new ArrayList<>();
    Context context;
    AdapterKhachhang adapterKhachhang;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
         sokhachhang= (TextView) findViewById(R.id.tvsokhachhang);
        arrayList=thongtinkhachhang();
        sokhachhang.setText("Tổng số khách hàng là:"+""+arrayList.size());

        recyclerView = findViewById(R.id.recyclerviewinfo);
        adapterKhachhang = new AdapterKhachhang(arrayList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapterKhachhang);


    }

    private ArrayList<AdapterKhachhang.Khachhang> thongtinkhachhang() {
        ArrayList<AdapterKhachhang.Khachhang> arrayList = new ArrayList<>();
        arrayList.add(new AdapterKhachhang.Khachhang("hợp tác xã vận tải 1", "hoptacxa@gmail.com"));
        arrayList.add(new AdapterKhachhang.Khachhang("Nguyễn thành An", "nguyenvanan@gmail.com"));
        arrayList.add(new AdapterKhachhang.Khachhang("Nguyễn ngọc bình", "nguyenngocbinh@gmail.com"));
        arrayList.add(new AdapterKhachhang.Khachhang("nguyenvanminh", "nguyenvanminh@gmail.com"));
        arrayList.add(new AdapterKhachhang.Khachhang("Đặng Đăng Khoa", "đângngkhoa@gmail.com"));
        arrayList.add(new AdapterKhachhang.Khachhang("hợp tác xã vận tải 2", "hoptacxa2@gmail.com"));

        arrayList.add(new AdapterKhachhang.Khachhang("hợp tác xã vận tải 10", "hoptacxa1@gmail.com"));
        arrayList.add(new AdapterKhachhang.Khachhang("Nguyễn thành An1", "nguyenvanan1@gmail.com"));
        arrayList.add(new AdapterKhachhang.Khachhang("Nguyễn ngọc bình1", "nguyenngocbinh1@gmail.com"));
        arrayList.add(new AdapterKhachhang.Khachhang("nguyenvanminh1", "nguyenvanminh1@gmail.com"));
        arrayList.add(new AdapterKhachhang.Khachhang("Đặng Đăng Khoa1", "đângngkhoa1@gmail.com"));
        arrayList.add(new AdapterKhachhang.Khachhang("hợp tác xã vận tải 20", "hoptacxa20@gmail.com"));

        arrayList.add(new AdapterKhachhang.Khachhang("hợp tác xã vận tải 100", "hoptacxa100@gmail.com"));
        arrayList.add(new AdapterKhachhang.Khachhang("Nguyễn thành An10", "nguyenvanan10@gmail.com"));
        arrayList.add(new AdapterKhachhang.Khachhang("Nguyễn ngọc bình10", "nguyenngocbinh10@gmail.com"));
        arrayList.add(new AdapterKhachhang.Khachhang("nguyenvanminh10", "nguyenvanminh10@gmail.com"));
        arrayList.add(new AdapterKhachhang.Khachhang("Đặng Đăng Khoa10", "đângngkhoa10@gmail.com"));
        arrayList.add(new AdapterKhachhang.Khachhang("hợp tác xã vận tải 200", "hoptacxa200@gmail.com"));
        return arrayList;

    }
}

