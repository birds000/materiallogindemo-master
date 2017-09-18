package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.sourcey.materiallogindemo.About_Vocational_College.About_Vocational;
import com.sourcey.materiallogindemo.Deparment.Deparment;
import com.sourcey.materiallogindemo.Institution.Institution;
import com.sourcey.materiallogindemo.News.News;
import com.sourcey.materiallogindemo.News.News_Information.News_Information_1;
import com.sourcey.materiallogindemo.News.News_Information.News_Information_2;
import com.sourcey.materiallogindemo.News.News_Information.News_Information_3;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);


        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
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
    public void onClickNext1(View v) {
        Intent i = new Intent(getApplicationContext(), News_Information_1.class);
        startActivity(i);
    }
    public void onClickNext2(View v) {
        Intent i = new Intent(getApplicationContext(), News_Information_2.class);
        startActivity(i);
    }
    public void onClickNext3(View v) {
        Intent i = new Intent(getApplicationContext(), News_Information_3.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
        if (id == R.id.nav_account){
            Intent intent = new Intent(getApplicationContext(), UserActivity.class);
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