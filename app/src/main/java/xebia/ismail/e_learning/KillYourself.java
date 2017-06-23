package xebia.ismail.e_learning;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.VideoView;

public class KillYourself extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kill_yourself);
        final VideoView videoView =
                (VideoView) findViewById(R.id.videoView);

        videoView.setVideoPath("http://eventer.s-host.net/pinkguy.mp4");

        videoView.start();
    }

}
