package com.example.shiyan_142;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.ButtonAnother);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //按下按钮启动anotheractivity
                Intent intent=new Intent();
                intent.setAction("startAnotherActivity");
                startActivity(intent);
            }
        });

    }
}
