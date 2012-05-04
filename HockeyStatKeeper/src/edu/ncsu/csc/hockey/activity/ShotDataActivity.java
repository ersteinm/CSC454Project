package edu.ncsu.csc.hockey.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ShotDataActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shot);
    }
    
    public void selectPlayer(View v) {
    	Toast.makeText(getApplicationContext(), "Shot: 15", Toast.LENGTH_SHORT).show();
    	Intent i = new Intent(ShotDataActivity.this, OffensiveZoneActivity.class);
    	ShotDataActivity.this.startActivity(i);
    }
    
    public void onBackPressed() {
    	Intent i = new Intent(ShotDataActivity.this, OffensiveZoneActivity.class);
   	 	ShotDataActivity.this.startActivity(i);
    	return;
    }
    
}