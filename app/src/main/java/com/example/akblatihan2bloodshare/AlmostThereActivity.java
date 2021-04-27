package com.example.akblatihan2bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
    Dikerjakan pada tanggal : 27 April 2021
    Deskripsi pekerjaan : Membuat layouting tampilan pada almostthere activity aplikasi BloodShare menggunakan ConstraintrLayout,
    implementasi custom design pada button verify, memberikan action intent pada button verify
    Dibuat oleh :
    NIM   : 10118071
    Nama  : David Aditya Winarto
    Kelas : IF-2
*/

public class AlmostThereActivity extends AppCompatActivity {

    private Button btnVerify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);

        btnVerify = findViewById(R.id.btn_verify);

        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent verifyIntent = new Intent(AlmostThereActivity.this, VerifyActivity.class);
                startActivity(verifyIntent);
                finish();
            }
        });

    }
}