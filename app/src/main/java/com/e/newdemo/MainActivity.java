package com.e.newdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void butclicked(View view)
    {
        int id= view.getId();
        String ourId="";
        ourId=view.getResources().getResourceEntryName(id);
        int ResourseID=getResources().getIdentifier(ourId,"raw","com.e.newdemo");
        MediaPlayer media= MediaPlayer.create(this, ResourseID);
        media.start();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
