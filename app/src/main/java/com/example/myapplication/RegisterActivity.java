package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7;
    AppCompatButton b1,b2;
    String getName,getAdd,getPhn,getEmail,getUser,getPass,getCon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.add);
        e3=(EditText)findViewById(R.id.phn);
        e4=(EditText)findViewById(R.id.email);
        e5=(EditText)findViewById(R.id.user);
        e6=(EditText)findViewById(R.id.pass);
        e7=(EditText)findViewById(R.id.con);
        b1=(AppCompatButton)findViewById(R.id.reg);
        b2=(AppCompatButton)findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=e1.getText().toString();
                Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_SHORT).show();
                getAdd=e2.getText().toString();
                Toast.makeText(getApplicationContext(),getAdd,Toast.LENGTH_LONG).show();
                getPhn=e3.getText().toString();
                Toast.makeText(getApplicationContext(),getPhn,Toast.LENGTH_LONG).show();
                getEmail=e4.getText().toString();
                Toast.makeText(getApplicationContext(),getEmail,Toast.LENGTH_LONG).show();
                getUser=e5.getText().toString();
                Toast.makeText(getApplicationContext(),getUser,Toast.LENGTH_LONG).show();
                getPass=e6.getText().toString();
                Toast.makeText(getApplicationContext(),getPass,Toast.LENGTH_LONG).show();
                getCon=e7.getText().toString();
                Toast.makeText(getApplicationContext(),getCon,Toast.LENGTH_LONG).show();


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}