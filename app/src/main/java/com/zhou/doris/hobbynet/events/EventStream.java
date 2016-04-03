package com.zhou.doris.hobbynet.events;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.zhou.doris.hobbynet.R;
import com.zhou.doris.hobbynet.user.UserProfile;

public class EventStream extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_stream);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void RSVP(View view) {
        Toast.makeText(getApplicationContext(),
                "RSVP complete! Event saved.", Toast.LENGTH_LONG).show();
    }

    public void goToFull(View view) {
        Intent intent = new Intent(this, EventDetail.class);
        this.startActivity(intent);
    }

    public void goToHost(View view) {
        Intent intent = new Intent(this, UserProfile.class);
        this.startActivity(intent);
    }

}
