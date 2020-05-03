package com.mohit.grocerypoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void menu(View view){
        Intent intent = new Intent(this,MenuActivity.class);

        startActivity(intent);
    }


    public void cart(View view){
        Intent intent = new Intent(this ,CartActivity.class);

        startActivity(intent);
    }

    public void wishlist(View view){
        Intent intent = new Intent(this,WishlistActivity.class);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
//<solid android:color="@android:color/background_light"/>