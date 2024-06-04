package com.example.exp3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.number.IntegerWidth;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Payment extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bAdd, bSub, bDiv, bMul, b10, bC, bEql,b;
    EditText et1;
    float V1, V2;
    boolean Add, Sub, Mul, Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b10 = (Button) findViewById(R.id.b10);
        bAdd = (Button) findViewById(R.id.badd);
        bSub = (Button) findViewById(R.id.bsub);
        bMul = (Button) findViewById(R.id.bmul);
        bDiv = (Button) findViewById(R.id.bdiv);
        bC = (Button) findViewById(R.id.bC);
        bEql = (Button) findViewById(R.id.beql);
        et1 = (EditText) findViewById(R.id.edt1);
        b =(Button) findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "0");
            }
        });
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null) {
                    et1.setText("");
                } else {
                    V1 = Float.parseFloat(et1.getText() + "");
                    Add = true;
                    et1.setText(null);
                }
            }
        });
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                V1 = Float.parseFloat(et1.getText() + "");
                Sub = true;
                et1.setText(null);
            }
        });
        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                V1 = Float.parseFloat(et1.getText() + "");
                Mul = true;
                et1.setText(null);
            }
        });
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                V1 = Float.parseFloat(et1.getText() + "");
                Div = true;
                et1.setText(null);
            }
        });
        bEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                V2 = Float.parseFloat(et1.getText() + "");
                if (Add == true) {
                    et1.setText(V1 + V2 + "");
                    Add = false;
                }
                if (Sub == true) {
                    et1.setText(V1 - V2 + "");
                    Sub = false;
                }
                if (Mul == true) {
                    et1.setText(V1 * V2 + "");
                    Mul = false;
                }
                if (Div == true) {
                    et1.setText(V1 / V2 + "");
                    Div = false;
                }
            }
        });
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + ".");
            }
        });
        b.setOnCreateContextMenuListener(this);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View view,
                                    ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, view, menuInfo);
        createContext(menu);
    }
    public boolean onContextItemSelected(MenuItem item)
    {

        return menuChoice(item);
    }
    private void createContext(Menu menu) {
        MenuItem mnu1 = menu.add(0, 0, 0, "UPI Id");
        {
            mnu1.setAlphabeticShortcut('a');
        }
        MenuItem mnu2 = menu.add(0, 1, 1, "Cash On Delivery");
        {
            mnu2.setAlphabeticShortcut('b');
        }
    }
    private boolean menuChoice(MenuItem item) {
        switch (item.getItemId()) {
            case 0:
                Toast.makeText(this, "You choosed to pay by UPI",
                        Toast.LENGTH_LONG).show();
                Intent in=new Intent(getApplicationContext(), Pay.class);
                startActivity(in);
                return true;
            case 1:
                Toast.makeText(this, "You choosed to pay by COD",
                        Toast.LENGTH_LONG).show();
                Intent iv=new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(iv);
                return true;
        }
        return false;
    }
}
