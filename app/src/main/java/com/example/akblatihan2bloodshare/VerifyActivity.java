package com.example.akblatihan2bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
    Dikerjakan pada tanggal : 27 April 2021
    Deskripsi pekerjaan : Membuat layouting tampilan pada verify activity aplikasi BloodShare menggunakan ConstraintrLayout,
    implementasi custom design pada button send, memberikan action intent pada button send
    Dibuat oleh :
    NIM   : 10118071
    Nama  : David Aditya Winarto
    Kelas : IF-2
*/

public class VerifyActivity extends AppCompatActivity {

    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        btnSend = findViewById(R.id.btn_send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(VerifyActivity.this, MainActivity.class);
                startActivity(sendIntent);
                finish();
            }
        });

    }
}