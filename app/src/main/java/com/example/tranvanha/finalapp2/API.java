package com.example.tranvanha.finalapp2;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface API {
    @POST("MobileService.svc/rest/Login")
    Call<DuLieu_LogIn> getLogin(@Body DuLieu_Input_LogIn a);
}
