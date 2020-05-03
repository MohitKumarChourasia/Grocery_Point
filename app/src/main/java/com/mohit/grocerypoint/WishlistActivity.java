package com.mohit.grocerypoint;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WishlistActivity extends AppCompatActivity {

    public void add(View view){

        Toast.makeText(this, "Item Added To Cart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wishlist);
    }
}
