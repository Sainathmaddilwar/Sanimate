package com.example.sanimate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void Changephoto(View view)
    {
        ImageView first=(ImageView) findViewById(R.id.ktm1);
        ImageView second=(ImageView) findViewById(R.id.ktm2);
        first.animate().alpha(1).setDuration(1000);
        second.animate().alpha(0).setDuration(1000);
    }
    public void Changephoto2(View view)
    {
        ImageView first=(ImageView) findViewById(R.id.ktm1);
        ImageView second=(ImageView) findViewById(R.id.ktm2);
        second.animate().alpha(1).setDuration(1000);
        first.animate().alpha(0).setDuration(1000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
