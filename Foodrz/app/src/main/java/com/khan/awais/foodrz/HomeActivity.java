package com.khan.awais.foodrz;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.khan.awais.foodrz.adapters.SlidingImageAdapter;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    //Toolbar homeToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //homeToolbar = findViewById(R.id.homeToolbar);
        //setSupportActionBar(homeToolbar);
    }
}
