package com.example.exp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        Button bt=(Button) findViewById(R.id.done);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText t1=findViewById(R.id.editTextText2);
                Integer rs=Integer.parseInt(t1.getText().toString());
                Toast.makeText(Pay.this, "You have paid: Rs."+rs, Toast.LENGTH_SHORT).show();
                Intent in=new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(in);
            }
        });

    }
}