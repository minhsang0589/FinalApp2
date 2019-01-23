package com.example.tranvanha.finalapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ArrayList<AdapterKhachhang.Khachhang> arraykhachhang;

    AdapterKhachhang adapterKhachhang;

    EditText edttendangnhap;
    EditText edtmatkhau;

    Button btndangnhap;
    CheckBox cbnhodangnhap;
    TextView tvquenmk;
    String BASE_URL="http://203.190.173.22:9005/";
    Retrofit retrofit;
    API mApi;
    int TypeClient =1;
    String ClientVersion = "4.0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        retrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()). build();
        mApi=retrofit.create(API.class);

        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getToken();
            }
        });
    }

    private void Anhxa() {
        edttendangnhap=findViewById(R.id.edt_tendangnhap);
        edtmatkhau=findViewById(R.id.edt_matkhau);
        btndangnhap=findViewById(R.id.btn_dangnhap);
        cbnhodangnhap=findViewById(R.id.checkbox_nhodangnhap);
        tvquenmk=findViewById(R.id.tv_quenmatkhau);

    }

    private void getToken(){
        DuLieu_Input_LogIn d = new DuLieu_Input_LogIn(edttendangnhap.getText().toString(),edtmatkhau.getText().toString(),TypeClient,ClientVersion);
        mApi.getLogin(d).enqueue(new Callback<DuLieu_LogIn>() {
            @Override
            public void onResponse(Call<DuLieu_LogIn> call, Response<DuLieu_LogIn> response) {
                if(response.isSuccessful()){
                    if(response.body().getResultCode()==1){
                        String mess = response.body().getMessage();
                        Toast.makeText(MainActivity.this,mess,Toast.LENGTH_SHORT).show();
                        goInLogIn();
                    }else Toast.makeText(MainActivity.this,"dang nhap that bai",Toast.LENGTH_SHORT).show();
                }else Toast.makeText(MainActivity.this,"error",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<DuLieu_LogIn> call, Throwable t) {
                Toast.makeText(MainActivity.this,"fail",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void goInLogIn(){
        startActivity(new Intent(MainActivity.this,Mani2Activity.class));
        finish();
    }
}
