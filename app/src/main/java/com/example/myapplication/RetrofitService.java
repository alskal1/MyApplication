package com.example.myapplication;
import com.google.gson.JsonObject;

import org.json.JSONObject;
import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitService {
    @GET("user/findBy/{id}")

    //@FormUrlEncoded
   // @POST ("user/")
    //Call<JsonObject>getListRepos(@Field("id") String id);
    Call<JsonObject> getListRepos(@Path("id") String id);
}
