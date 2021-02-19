package com.example.bus_tracking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screenone);



        Button button1 = (Button) findViewById(R.id.driver);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome.this, registration.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.user);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome.this, user.class);
                startActivity(intent);
            }
        });


    }

}
