package com.example.exp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView et1=findViewById(R.id.text);
        et1.setText("\nTERMS AND CONDITIONS\n\n\n1. *User Agreement*: By using the app, users agree to abide by all terms and conditions outlined herein.\n" +
                "\n" +
                "2. *Account Creation*: Users must create an account to access the app's services. They are responsible for maintaining the confidentiality of their account information.\n" +
                "\n" +
                "3. *Order Placement*: Users can place orders for food through the app, and they are responsible for providing accurate delivery information.\n" +
                "\n" +
                "4. *Payment*: Users must provide valid payment information. The app will process payments securely.\n" +
                "\n" +
                "5. *Delivery*: The app will strive to deliver orders in a timely manner, but delivery times may vary depending on various factors like traffic and restaurant preparation times.\n" +
                "\n" +
                "6. *Cancellation and Refunds*: Users can cancel orders within a certain timeframe, and refunds may be issued according to the app's refund policy.\n" +
                "\n" +
                "7. *Quality Assurance*: The app aims to maintain high standards of food quality and safety, but it does not guarantee the quality of food provided by partner restaurants.\n" +
                "\n" +
                "8. *User Conduct*: Users must not engage in any illegal, abusive, or disruptive behavior while using the app.\n" +
                "\n" +
                "9. *Intellectual Property*: The app and its content are protected by copyright and other intellectual property laws. Users must not reproduce, distribute, or modify any part of the app without permission.\n" +
                "\n" +
                "10. *Privacy Policy*: The app collects and processes user data according to its privacy policy, which outlines how user information is used and protected.\n" +
                "\n" +
                "11. *Liability*: The app is not liable for any damages or losses incurred by users as a result of using the app or its services.\n" +
                "\n" +
                "12. *Governing Law*: These terms and conditions are governed by the laws of the jurisdiction where the app operates.\n" +
                "\n" +
                "13. *Updates and Changes*: The app reserves the right to update or change these terms and conditions at any time. Users will be notified of any significant changes.\n" +
                "\n" +
                "14. *Termination*: The app may terminate a user's account if they violate these terms and conditions or engage in fraudulent or illegal activities.\n" +
                "\n" +
                "15. *Contact Information*: Users can contact the app's support team for assistance or inquiries.\n");
    }
}