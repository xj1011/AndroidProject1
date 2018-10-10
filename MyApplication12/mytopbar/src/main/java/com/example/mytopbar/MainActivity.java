package com.example.mytopbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    private ImageButton btn1;
    private ImageButton btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (ImageButton) findViewById(R.id.imageButton7);
        btn2 = (ImageButton) findViewById(R.id.imageButton4);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Activity1.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("注册成功！")
                        .setMessage("请直接进行登录！")
                        .setPositiveButton("确定",null)
                        .show();
            }
        });
    }
}

