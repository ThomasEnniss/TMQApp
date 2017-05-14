package com.example.weabros.tmqapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.TextView;

public class NewTask extends AppCompatActivity {

    private TextView mTextMessage;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    Intent dashboardIntent = new Intent(NewTask.this,Dashboard.class);
                    startActivity(dashboardIntent);

                    return true;
                case R.id.navigation_calendar:

                    Intent calendarIntent = new Intent(NewTask.this,Calendar.class);
                    startActivity(calendarIntent);

                    return true;
                case R.id.navigation_question:

                    Intent questionIntent = new Intent(NewTask.this,Questionaire.class);
                    startActivity(questionIntent);

                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
