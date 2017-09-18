package com.sourcey.materiallogindemo.Deparment.Deparment_Business;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.sourcey.materiallogindemo.MainActivity;
import com.sourcey.materiallogindemo.R;

public class Deparment_Business extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deparment__business);
    }
    public void onClickNext1(View v) {
        Intent i = new Intent(getApplicationContext(), Deparment_Business_Account.class);
        startActivity(i);
    }
    public void onClickNext2(View v) {
        Intent i = new Intent(getApplicationContext(), Deparment_Business_Businesscom.class);
        startActivity(i);
    }
    public void onClickNext3(View v) {
        Intent i = new Intent(getApplicationContext(), Deparment_Business_Market.class);
        startActivity(i);
    }
    public void onClickNext4(View v) {
        Intent i = new Intent(getApplicationContext(), Deparment_Business_Retail.class);
        startActivity(i);
    }
    public void onClickNext5(View v) {
        Intent i = new Intent(getApplicationContext(), Deparment_Business_Manage.class);
        startActivity(i);
    }
    public void onClickNext6(View v) {
        Intent i = new Intent(getApplicationContext(), Deparment_Business_Office.class);
        startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_close, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.nav_logout) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
    private void logout() {
        finish();
        overridePendingTransition(R.anim.push_left_in, R.anim.push_right_out);
    }
}