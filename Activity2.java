package com.example.testes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String Nama = intent.getStringExtra("Nama");
        String NPM = intent.getStringExtra("NPM");
        String Kelas = intent.getStringExtra("Kelas");
        String Alamat = intent.getStringExtra("Alamat");

        TextView tvNAMA = findViewById(R.id.tVNAMA);
        tvNAMA.setText(Nama);
        TextView tvNPM = findViewById(R.id.tVNPM);
        tvNPM.setText(NPM);
        TextView tvKELAS = findViewById(R.id.tVKELAS);
        tvKELAS.setText(Kelas);
        TextView tvALAMAT = findViewById(R.id.tVALAMAT);
        tvALAMAT.setText(Alamat);
    }
}