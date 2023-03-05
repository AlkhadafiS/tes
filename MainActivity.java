package com.example.testes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoToActivity2(View view){
        EditText etNAMA = findViewById(R.id.etNAMA);
        String Nama = etNAMA.getText().toString();
        EditText etNPM = findViewById(R.id.etNPM);
        String NPM = etNPM.getText().toString();
        EditText etKELAS = findViewById(R.id.etKELAS);
        String Kelas = etKELAS.getText().toString();
        EditText etALAMAT = findViewById(R.id.etALAMAT);
        String Alamat = etALAMAT.getText().toString();

        Intent goToActivity2 = new Intent (this, Activity2.class);
        goToActivity2.putExtra("Nama : ", Nama);
        goToActivity2.putExtra("NPM :", NPM);
        goToActivity2.putExtra("Kelas : ", Kelas);
        goToActivity2.putExtra("Alamat : ", Alamat);

        startActivity(goToActivity2);
    }
}