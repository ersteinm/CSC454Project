package edu.ncsu.csc.hockey.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FaceoffDataActivity extends Activity {

	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faceoff);
    }
    
    public void submitFaceoff(View v) {
    	Toast.makeText(getApplicationContext(), "Faceoff\nWinner: 10\nLoser: 5", Toast.LENGTH_SHORT).show();
    	Intent i = new Intent(FaceoffDataActivity.this, OffensiveZoneActivity.class);
		FaceoffDataActivity.this.startActivity(i);
    }
}
