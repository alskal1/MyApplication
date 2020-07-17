package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonObject;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.*;
import retrofit2.Response;

public class Test extends AppCompatActivity {

    EditText ed;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        ed = (EditText) findViewById(R.id.ed);
        tv = (TextView) findViewById(R.id.tv);
    }

    public void Serach(View view) {
        String id = ed.getText().toString();

        if (!id.isEmpty()) {
            Call<JsonObject> res = NetRetrofit.getInstance().getService().getListRepos(id);
            res.enqueue(new Callback<JsonObject>() {
                @Override
                public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                    Log.d("Retrofit", response.toString());
                    if (response.body() != null)
                        tv.setText(response.body().toString());
                }

                @Override
                public void onFailure(Call<JsonObject> call, Throwable t) {
                    Log.e("Err", t.getMessage());
                }
            });
        } else
            Toast.makeText(this, "아이디를 입력하세요.", Toast.LENGTH_SHORT).show();
    }
}