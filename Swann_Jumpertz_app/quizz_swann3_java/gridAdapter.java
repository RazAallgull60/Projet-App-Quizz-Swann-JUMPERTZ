package com.example.quizz_swann3;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class gridAdapter extends ArrayAdapter
{
    Context context;
    Activity activity;
    List<Matieres> items;
    int layout;

    public gridAdapter(Activity a, int layout, List<Matieres> items) {
        super(a,layout, items);
        this.activity=a;
        this.layout = layout;
        this.items = items;
    }

    @Override
    public int getCount()
    {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View layout = convertView;
        if (convertView == null){
            LayoutInflater inflater = activity.getLayoutInflater();
            layout = inflater.inflate(this.layout, parent, false);
        }

        ImageView img=(ImageView)layout.findViewById(R.id.Image);
        TextView tv=(TextView)layout.findViewById(R.id.Nom);

        img.setImageResource(items.get(position).Image);
        tv.setText(items.get(position).Nom);

        return layout;
    }
}