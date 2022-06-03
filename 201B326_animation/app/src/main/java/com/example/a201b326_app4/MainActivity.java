package com.example.a201b326_app4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isJoker1=true;
    public void change(View view){
        ImageView imageView=findViewById(R.id.imageView);
        ImageView imageView2=findViewById(R.id.imageView2);
        if(isJoker1){
            imageView.animate().alpha(1).setDuration(2000);
            imageView2.animate().alpha(0).setDuration(2000);
            isJoker1=false;

        }else{
            imageView.animate().alpha(0).setDuration(2000);
            imageView2.animate().alpha(1).setDuration(2000);
            isJoker1=true;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}