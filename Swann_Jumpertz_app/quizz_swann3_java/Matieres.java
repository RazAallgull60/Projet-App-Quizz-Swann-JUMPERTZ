package com.example.quizz_swann3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Matieres extends AppCompatActivity {
    String Nom;
    int Image;

    public Matieres (int I, String N) {
        this.Nom=N;
        this.Image=I;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matieres);
    }


}