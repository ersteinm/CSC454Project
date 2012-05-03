package edu.ncsu.csc.hockey.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FaceoffDataActivity extends Activity {

	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faceoff);
    }
    
    public void submitFaceoff(View v) {
    	Intent i = new Intent(FaceoffDataActivity.this, OffensiveZoneActivity.class);
		FaceoffDataActivity.this.startActivity(i);
    }
}
