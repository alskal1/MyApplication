package com.example.myapplication;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetRetrofit {
        private static NetRetrofit ourInstance = new NetRetrofit();
        public static NetRetrofit getInstance() {
            return ourInstance;
        }
        private NetRetrofit() {
        }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://52.79.67.124:8080/")
                .addConverterFactory(GsonConverterFactory.create()) // 파싱등록
                .build();

        RetrofitService service = retrofit.create(RetrofitService.class);

        public RetrofitService getService() {
            return service;
        }
    }