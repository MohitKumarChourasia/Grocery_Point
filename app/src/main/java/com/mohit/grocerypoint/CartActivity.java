package com.mohit.grocerypoint;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CartActivity extends AppCompatActivity {

    public void home (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void add(View view){
  int i=0;
//FFE91E1E
        TextView userText = findViewById(R.id.textView24);
        userText.setText(i);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.cart);
    }
}
