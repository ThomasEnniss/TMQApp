package com.example.weabros.tmqapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v4.app.FragmentActivity;

public class Questionaire extends AppCompatActivity implements QuestionaireA.OnFragmentInteractionListener{

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    Intent dashboardIntent = new Intent(Questionaire.this,Dashboard.class);
                    startActivity(dashboardIntent);

                    return true;
                case R.id.navigation_new:

                    Intent newTaskIntent = new Intent(Questionaire.this,NewTask.class);
                    startActivity(newTaskIntent);

                    return true;
                case R.id.navigation_calendar:

                    Intent calendarIntent = new Intent(Questionaire.this,Calendar.class);
                    startActivity(calendarIntent);

                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionaire);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        if (findViewById(R.id.questionaire_fragment_container) != null) {


            if (savedInstanceState != null) {
                return;
            }


            QuestionaireA firstFragment = new QuestionaireA();


            firstFragment.setArguments(getIntent().getExtras());


            getSupportFragmentManager().beginTransaction()
                    .add(R.id.questionaire_fragment_container, firstFragment).commit();
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        Log.d("Questionaire",uri.toString());
    }
}
