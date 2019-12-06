package com.example.project_tubes_kelompok_delapan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tentang(View view) {
        Intent intent = new Intent(MainActivity.this,about.class);
        startActivity(intent);
    }

    public void mulai(View view) {
        Intent intent = new Intent(MainActivity.this,start.class);
        startActivity(intent);
    }
}
   // Kelompok 8 : 1.Alringga rizky (17523045)
                   // 2. A Zakki Fikril M (17523234)
//                  3. Farhanul Insan NZI (17523131)

//1. Topik atau masalah yang ingin diselesaikan
// dengan aplikasi tes depresi diharapkan bisa untuk membantu psikeater dalam melakukan
// tes depresi dan mengumpulkan data tingkat depresi

//2. Karena lebih simpel dan mudah apabila menggunakan android

//3. User
    //Pengguna smartphone yang ingin mengetahui berapa tingkat  depresinya dan
// ingin mengetahui rekomendasi dari hasil tes tersebut

//4. Client
    //psikeater

//5.Input
//Questionaire depresi

//6. output
    // Solusi sesuai tinggkat depresi
//Fitur-fitur:
//Login
//Mengisi Quiz Depresi
//Melihat tingkat depresi
//melihat Rekomendasi