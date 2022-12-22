package com.example.taf;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Notification extends AppCompatActivity {
    FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatingActionButton = (FloatingActionButton)findViewById(R.id.notification);
        floatingActionButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(),"Notifications",Toast.LENGTH_SHORT).show();

            }
        });
    }
}

    Intent Notification =new Intent(getApplicationContext(), Notification.class)
    startActivity(Notification);

    Intent Notification = new Intent(Intent.ACTION_VIEW);
Uri data = Uri.parse("https://www.google.com");
Notification.setData(data);
    startActivity(Intent.createChooser(Notification,"launch google"));