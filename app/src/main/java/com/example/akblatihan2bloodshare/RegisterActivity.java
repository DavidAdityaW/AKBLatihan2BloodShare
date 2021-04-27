package com.example.akblatihan2bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
    Dikerjakan pada tanggal : 27 April 2021
    Deskripsi pekerjaan : Membuat layouting tampilan pada register activity aplikasi BloodShare menggunakan ConstraintrLayout,
    implementasi spinner dengan data berupa array-string, custom design pada button register, memberikan action intent pada button register
    Dibuat oleh :
    NIM   : 10118071
    Nama  : David Aditya Winarto
    Kelas : IF-2
*/

public class RegisterActivity extends AppCompatActivity {

    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnRegister = findViewById(R.id.btn_register);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent almostThereIntent = new Intent(RegisterActivity.this, AlmostThereActivity.class);
                startActivity(almostThereIntent);
                finish();
            }
        });

    }
}