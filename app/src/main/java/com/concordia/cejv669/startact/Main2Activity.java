package com.concordia.cejv669.startact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();

        String chosenName = i.getStringExtra("Name");
        int chosenNumber= i.getIntExtra("Age", 0);

        TextView tvName = findViewById(R.id.result_name);
        TextView tvNum = findViewById(R.id.result_number);

        tvName.setText(chosenName);
        tvNum.setText(chosenNumber);

    }
}
