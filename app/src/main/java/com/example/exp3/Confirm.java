package com.example.exp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Confirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        Intent in=getIntent();
        Bundle b=in.getExtras();
        String name1=b.getString("Name","xxxxx");
        Long ph1=b.getLong("Phone number",0000000000);
        TextView t1=findViewById(R.id.t1);
        TextView t2=findViewById(R.id.t2);
        t1.setText("Your Name is:"+name1);
        t2.setText("Your Phone Number is:"+Long.toString(ph1));
        Button bt=(Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Confirm.this, Menucard.class);
                startActivity(in);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        createMenu(menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return menuChoice(item);
    }
    private void createMenu(Menu menu) {
        MenuItem mnu1 = menu.add(0, 0, 0, "Profile");
        {
            mnu1.setAlphabeticShortcut('a');
        }
        MenuItem mnu2 = menu.add(0, 1, 1, "Contact Us");
        {
            mnu2.setAlphabeticShortcut('b');
        }
        MenuItem mnu3 = menu.add(0, 2, 2, "Terms and Conditions");
        {
            mnu3.setAlphabeticShortcut('c');
        }
        MenuItem mnu4 = menu.add(0, 3, 3, "Help");
        {
            mnu4.setAlphabeticShortcut('d');
        }
        MenuItem mnu5 = menu.add(0, 4, 4, "Settings");
        {
            mnu5.setAlphabeticShortcut('e');
        }
        MenuItem mnu6 = menu.add(0, 5, 5, "Sign Out");
        {
            mnu6.setAlphabeticShortcut('f');
        }
    }
    private boolean menuChoice(MenuItem item) {
        switch (item.getItemId()) {
            case 0:
            case 4:
                Intent obj = getIntent();
                Bundle bun = obj.getExtras();
                String name2 = bun.getString("Name", "xxxxx");
                Long ph2 = bun.getLong("Phone number", 0000000000);
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                Bundle bundle = new Bundle();
                bundle.putString("Name", name2);
                bundle.putLong("Phone number", ph2);
                intent.putExtras(bundle);
                startActivity(intent);
                return true;
            case 1:
                Toast.makeText(this, "Contact number is: 8954256790",
                        Toast.LENGTH_LONG).show();
                return true;
            case 2:
                Intent i=new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
                return true;
            case 3:
                Toast.makeText(this, "For any queries, Please Contact Us!",
                        Toast.LENGTH_LONG).show();
                return true;
            case 5:
                Intent in=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(in);
                return true;
        }
        return false;
    }
}

