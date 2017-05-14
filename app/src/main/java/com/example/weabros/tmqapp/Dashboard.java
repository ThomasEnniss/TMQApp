package com.example.weabros.tmqapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                /*Don't need option for current activity so only 3*/
                case R.id.navigation_new:

                    Intent newTaskIntent = new Intent(Dashboard.this,NewTask.class);
                    startActivity(newTaskIntent);

                    return true;
                case R.id.navigation_calendar:

                    Intent calendarIntent = new Intent(Dashboard.this,Calendar.class);
                    startActivity(calendarIntent);

                    return true;
                case R.id.navigation_question:

                    Intent questionIntent = new Intent(Dashboard.this,Questionaire.class);
                    startActivity(questionIntent);

                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
