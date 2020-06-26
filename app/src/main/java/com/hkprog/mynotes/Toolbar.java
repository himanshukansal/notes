package com.hkprog.mynotes;

import android.content.Context;

import androidx.fragment.app.FragmentActivity;

public class Toolbar extends androidx.appcompat.widget.Toolbar {


    public Toolbar(Context context) {
        super(context);
    }

    public static void setToolbar(androidx.appcompat.widget.Toolbar mToolbar, FragmentActivity context) {
        ((MainActivity)context).setSupportActionBar(mToolbar);
        ((MainActivity)context).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        ((MainActivity)context).getSupportActionBar().setDisplayShowHomeEnabled(false);
        ((MainActivity)context).getSupportActionBar().setTitle("Notes");
        //mToolbar.setTitleTextColor(Color.parseColor("#1c1c1c"));
    }

    public static void setToolbarBackBtn(androidx.appcompat.widget.Toolbar mToolbar, FragmentActivity context) {
        ((MainActivity)context).setSupportActionBar(mToolbar);
        ((MainActivity)context).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((MainActivity)context).getSupportActionBar().setDisplayShowHomeEnabled(true);
        ((MainActivity)context).getSupportActionBar().setTitle("Notes");
        //mToolbar.setTitleTextColor(Color.parseColor("#1c1c1c"));
    }

}

