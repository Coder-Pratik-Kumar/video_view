package com.example.videoview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {


    VideoView v1,v2,v3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v1=findViewById(R.id.video);
        String vpath="android.resource://"+getPackageName()+"/raw/justin";
        Uri videouri= Uri.parse(vpath);
        v1.setVideoURI(videouri);
        v1.start();
        MediaController mediaController=new MediaController(this);
        v1.setMediaController(mediaController);
        mediaController.setAnchorView(v1);

        v2=findViewById(R.id.video2);
        String v2path="android.resource://"+getPackageName()+"/raw/one_direction";

        Uri video2uri=Uri.parse(v2path);
        v2.setVideoURI(video2uri);
        v2.start();
        MediaController mediaController1=new MediaController(this);
        v2.setMediaController(mediaController1);
        mediaController1.setAnchorView(v2);

//        v3=findViewById(R.id.video3);
//        String v3path="android:resource//"+getPackageName()+"/raw/post";
//        Uri video3uri=Uri.parse(v3path);
//        v3.setVideoURI(video3uri);
//        v3.start();
//        MediaController mediaController2=new MediaController(this);
//        v3.setMediaController(mediaController2);
//        mediaController2.setAnchorView(v3);
    }
}