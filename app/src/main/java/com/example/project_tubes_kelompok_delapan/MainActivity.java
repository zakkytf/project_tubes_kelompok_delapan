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
