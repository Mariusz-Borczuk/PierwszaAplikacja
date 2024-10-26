package com.example.pierwszaaplikacja;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivitando extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_activitando);
        Intent intent = getIntent();
        String message = intent.getStringExtra("Extra-msg");

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);


        Button closeButton = findViewById(R.id.closeButton);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }

    public void backToStartScreen(View v){
        Intent intent = new Intent(NewActivitando.this, MainActivity.class);
        startActivity(intent);
        finish();
    }


}
