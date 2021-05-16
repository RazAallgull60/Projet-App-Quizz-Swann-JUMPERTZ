package com.example.quizz_swann3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class griddemoapp extends AppCompatActivity {

    GridView grid;

    int icons[]=
            {
                    R.drawable.a,
                    R.drawable.b,
                    R.drawable.c,
                    R.drawable.d,
                    R.drawable.e,
                    R.drawable.f,
                    R.drawable.g,
                    R.drawable.h,
                    R.drawable.i
            };


    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_griddemoapp);
        setTitle("GridView Demo");

        grid=(GridView)findViewById(R.id.datagrid);
        List<Matieres> items = new ArrayList<>();
        items.add(new Matieres(R.drawable.i, "Géographie"));
        items.add(new Matieres(R.drawable.a, "Mathématiques"));
        items.add(new Matieres(R.drawable.b, "Histoire"));
        items.add(new Matieres(R.drawable.c, "Français"));
        items.add(new Matieres(R.drawable.d, "Sciences"));
        items.add(new Matieres(R.drawable.e, "Sport et loisirs"));
        ArrayAdapter obj=new gridAdapter(this,R.layout.activity_matieres,items);
        grid.setAdapter(obj);

    }
}