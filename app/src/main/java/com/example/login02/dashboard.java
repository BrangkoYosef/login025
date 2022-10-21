package com.example.login02;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard extends AppCompatActivity {

    TextView tvUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvUsername = findViewById(R.id.tvUsername);
        tvUsername.setText(Helper.getUsername());
    }


}
