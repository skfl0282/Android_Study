package com.example.videoviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView; //비디오 실헹할 수 있게 도와주는뷰
    private MediaController mediaController; // 재생이나 정지와 같은 미디어 제어 버튼부를 담당
    private String videoURL = "https://www.radiantmediaplayer.com/media/bbb-360p.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);
        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri = Uri.parse(videoURL);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.start();


    }
}