package com.mascarinas.allanjustine.apiapplication.api;

import com.mascarinas.allanjustine.apiapplication.pojos.Login;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestPlaceholder {

    @POST("login")
    Call<Login> Login(@Body Login login);
}
