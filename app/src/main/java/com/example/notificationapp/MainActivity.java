package com.example.notificationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnnotificationone, btnnotificationtwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnnotificationone=findViewById(R.id.btnnitoficationone);
        btnnotificationtwo=findViewById(R.id.btnnitoficationotwo);




    }
}
