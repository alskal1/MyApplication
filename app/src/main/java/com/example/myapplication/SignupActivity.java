package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.Response;
import com.google.gson.JsonObject;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.*;

public class SignupActivity extends AppCompatActivity {

    EditText id, password, name, nickname, email, phone;
    Button signup, btn;
    TextView tv;

    StringBuffer sb= new StringBuffer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        id =  (EditText) findViewById(R.id.Id);
        password = (EditText) findViewById(R.id.password);
        name = (EditText) findViewById(R.id.name);
        nickname = (EditText) findViewById(R.id.nickname);
        email = (EditText) findViewById(R.id.email);
        phone = (EditText) findViewById(R.id.phone);
        signup = (Button) findViewById(R.id.signup);
        btn = (Button)findViewById(R.id.btn);
        tv = (TextView)findViewById(R.id.tv);
        signup.setOnClickListener(myClickListener);
    }


    View.OnClickListener myClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            /*String startJson = "[";
            String endJson = "]";

            if(!sb.toString().equals(""))
            {
                sb.append(",");
            }
            String temp = "{\"id\""+";"+"\""+id.getText().toString()+"\""+","
                    +"\"password\""+":" + "\"" + password.getText().toString()+ "\"" +","
                    +"\"name\""+":" + "\"" + name.getText().toString() + "\"" + ","
                    +"\"nickname\""+":" + "\"" + nickname.getText().toString() + "\"" + ","
                    +"\"email\""+":" + "\"" + email.getText().toString() + "\"" + ","
                    +"\"phone\""+":" + "\"" + phone.getText().toString() + "\"" + "}";
            //sb.append(temp);
            tv.setText(temp);
        }
            };*/
        }
    };
        public void btn_clicked(View view) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
    }

