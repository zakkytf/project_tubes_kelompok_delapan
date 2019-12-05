package com.example.project_tubes_kelompok_delapan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void start_view(View view) {
        Intent intent = new Intent(start.this,QuizActivity.class);
        startActivity(intent);
    }
}
