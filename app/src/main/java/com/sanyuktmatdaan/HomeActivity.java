package com.sanyuktmatdaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class HomeActivity extends AppCompatActivity {

    private MaterialCardView castVote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        castVote = findViewById(R.id.castvote);
        castVote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, CadidateVote.class);
                startActivity(intent);
            }
        });


    }
}