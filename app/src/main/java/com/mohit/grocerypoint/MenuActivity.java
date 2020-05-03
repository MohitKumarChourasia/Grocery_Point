package com.mohit.grocerypoint;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity{

  public void wishlist(View view){
      Intent intent = new Intent(this,WishlistActivity.class);

      startActivity(intent);
  }


  public void history(View view){
      Intent intent = new Intent(this,HistoryActivity.class);

      startActivity(intent);
  }

  public void settings(View view){
      Intent intent = new Intent(this,SettingsActivity.class);

      startActivity(intent);
  }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }
}
