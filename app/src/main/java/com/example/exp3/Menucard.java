package com.example.exp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menucard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menucard);
        Button bt1 = (Button) findViewById(R.id.kfc);
        Button bt2 = (Button) findViewById(R.id.dn);
        Button bt3 = (Button) findViewById(R.id.fb);
        Button bt4 = (Button) findViewById(R.id.b4);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView2, fragment1.class, null).setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView2, fragment2.class, null).setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView2, fragment3.class, null).setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), Order.class);
                startActivity(in);
            }
        });
    }
}