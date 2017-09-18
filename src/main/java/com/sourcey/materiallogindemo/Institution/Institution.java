package com.sourcey.materiallogindemo.Institution;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.sourcey.materiallogindemo.Institution.Institution_Academic.Institution_academic;
import com.sourcey.materiallogindemo.Institution.Institution_Plan.Institution_Plan;
import com.sourcey.materiallogindemo.Institution.Institution_Resource.Institution_Resource;
import com.sourcey.materiallogindemo.Institution.Institution_Student.Institution_Student;
import com.sourcey.materiallogindemo.MainActivity;
import com.sourcey.materiallogindemo.MainFragment;
import com.sourcey.materiallogindemo.R;
import com.sourcey.materiallogindemo.UserActivity;


public class Institution extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institution);
    }
    public void onClickNext1(View v) {
        Intent i = new Intent(getApplicationContext(), Institution_academic.class);
        startActivity(i);
    }

    public void onClickNext2(View v) {
        Intent i = new Intent(getApplicationContext(), Institution_Resource.class);
        startActivity(i);
    }
    public void onClickNext3(View v) {
        Intent i = new Intent(getApplicationContext(), Institution_Student.class);
        startActivity(i);
    }
    public void onClickNext4(View v) {
        Intent i = new Intent(getApplicationContext(), Institution_Plan.class);
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
