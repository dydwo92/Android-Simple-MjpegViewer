package yjkim.android_simple_mjpegviewer;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import yjkim.mjpegviewer.MjpegView;

public class MainActivity extends AppCompatActivity {
    MjpegView mv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mv = (MjpegView) findViewById(R.id.videoView);

        mv.Start("http://webcam.st-malo.com/axis-cgi/mjpg/video.cgi?resolution=352x288", handler);
    }

    final Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg){
            Log.d("State : ",msg.obj.toString());
        }
    };
}
