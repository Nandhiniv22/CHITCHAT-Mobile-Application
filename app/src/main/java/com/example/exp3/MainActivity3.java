package com.example.exp3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent in=getIntent();
        Bundle b=in.getExtras();
        String name2=b.getString("Name","xxxxx");
        Long ph2=b.getLong("Phone number",0000000000);
        TextView t1=findViewById(R.id.textView11);
        TextView t2=findViewById(R.id.textView12);
        t1.setText("NAME: "+name2);
        t2.setText("PHONE NUMBER: "+ph2);
        TextView t3=findViewById(R.id.textView14);
        t3.setText("USER ID: "+name2+ph2);
        TextView mt1=findViewById(R.id.textView13);
        mt1.setText("SETTINGS\n\n"+"    *Orders\n    *Sound\n    *Notification\n    *Language\n    *Location");
    }
}