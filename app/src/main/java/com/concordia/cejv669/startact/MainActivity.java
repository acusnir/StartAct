package com.concordia.cejv669.startact;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.btn_goToScreen2);
        Button b2 = findViewById(R.id.btn2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editName = findViewById(R.id.edit_name);
                EditText editAge = findViewById(R.id.edit_age);

                Intent i = new Intent(getApplicationContext(), Main2Activity.class);

                i.putExtra("Name", editName.getText().toString());

                int n = Integer.parseInt(editAge.getText().toString());
                i.putExtra("Age",  Integer.parseInt(editAge.getText().toString()));

                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.ca"));
                startActivity(i);
            }
        });
    }
}
