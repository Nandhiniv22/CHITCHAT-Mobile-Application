package com.example.exp3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button) findViewById(R.id.bt);
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage("Make sure, you want to go with sign in?").setTitle("Signing in...").setCancelable(false).setPositiveButton("Sure", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        EditText et1=findViewById(R.id.ett);
                        EditText et2=findViewById(R.id.etp);
                        String name=et1.getText().toString();
                        Long ph=Long.parseLong(et2.getText().toString());
                        Intent obj=new Intent(getApplicationContext(), Confirm.class);
                        Bundle b=new Bundle();
                        b.putString("Name",name);
                        b.putLong("Phone number",ph);
                        obj.putExtras(b);
                        startActivity(obj);
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                AlertDialog alert=builder.create();
                alert.show();
            }
        });
    }
}
