package com.example.customtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar1);

        //step 1 s
        setSupportActionBar(toolbar);

        // step 2 : get the access to custom functionalities of a toolbar using getSupportActionBar() method
        getSupportActionBar().setTitle("WhatsUpp");


    }

    // Step 3: Inflate the option menu which we have customized in res folder
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(MainActivity.this).inflate(R.menu.opt_menu1,menu);
        return super.onCreateOptionsMenu(menu);
    }

    // onlick operations on items of option menu


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemid = item.getItemId();

        if(itemid == R.id.opt_new_group){
            Toast.makeText(this, "New group", Toast.LENGTH_SHORT).show();
        }
        else if(itemid == R.id.opt_new_broadcast){
            Toast.makeText(this, "New Broadcast", Toast.LENGTH_SHORT).show();
        }
        else if(itemid == R.id.opt_linked_devices){
            Toast.makeText(this, "Linked Devices", Toast.LENGTH_SHORT).show();
        }else if(itemid == R.id.opt_starred_messages){
            Toast.makeText(this, "Starred Messages", Toast.LENGTH_SHORT).show();
        }else if(itemid == R.id.opt_payments){
            Toast.makeText(this, "Payments", Toast.LENGTH_SHORT).show();
        }else if(itemid == R.id.opt_settings){
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();

        }else if(itemid == R.id.app_bar_search){
            Toast.makeText(this, "Search !", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}