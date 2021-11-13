package com.mascarinas.allanjustine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.mascarinas.allanjustine.apiapplication.R;

public class HomeActivity extends AppCompatActivity {

    public TextView userid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        userid = findViewById(R.id.userid);

        userid.setText(getIntent().getExtras().getString("USER ID"));
    }
}