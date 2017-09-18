package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.sourcey.materiallogindemo.About_Vocational_College.About_Vocational;
import com.sourcey.materiallogindemo.Deparment.Deparment;
import com.sourcey.materiallogindemo.Institution.Institution;
import com.sourcey.materiallogindemo.News.News;

public class FragmentGeneraluser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_generaluser);


//        Intent intent = new Intent(this, LoginActivity.class);
//        startActivity(intent);
    }
    public void onClickNext11(View v) {
        Intent i = new Intent(getApplicationContext(), About_Vocational.class);
        startActivity(i);
    }
    public void onClickNext12(View v) {
        Intent i = new Intent(getApplicationContext(), Institution.class);
        startActivity(i);
    }
    public void onClickNext13(View v) {
        Intent i = new Intent(getApplicationContext(), Deparment.class);
        startActivity(i);
    }
    public void onClickNext14(View v) {
        Intent i = new Intent(getApplicationContext(), News.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_generalusers, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.nav_contact) {
            Intent intent = new Intent(getApplicationContext(), ContactActivity.class);
            startActivity(intent);
        }
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