package com.example.akblatihan2bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/*
    Dikerjakan pada tanggal : 27 April 2021
    Deskripsi pekerjaan : Membuat layouting tampilan pada login activity aplikasi BloodShare menggunakan ConstraintLayout,
    implementasi custom design pada button login dan button connect with facebook, memberikan action intent pada textview register
    Dibuat oleh :
    NIM   : 10118071
    Nama  : David Aditya Winarto
    Kelas : IF-2
*/

public class LoginActivity extends AppCompatActivity {

    private TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvRegister = findViewById(R.id.tv_register);

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(registerIntent);
                finish();
            }
        });

    }
}