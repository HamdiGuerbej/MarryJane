package com.example.hpomen.marryjane;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bugetAge(View view) {
        EditText tfAge =(EditText) findViewById(R.id.tfAge);
       int yearOfBirth = Integer.parseInt( tfAge.getText().toString());
        int age = 2018 - yearOfBirth;

        Toast.makeText(this,"age : "+String.valueOf(age),Toast.LENGTH_LONG).show();
    }
}
