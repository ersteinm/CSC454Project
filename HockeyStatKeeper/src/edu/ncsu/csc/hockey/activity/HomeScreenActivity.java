package edu.ncsu.csc.hockey.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomeScreenActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		
		
		Button liveStats = (Button) findViewById(R.id.statsButton);
		liveStats.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent stats = new Intent(HomeScreenActivity.this, OffensiveZoneActivity.class);
        		HomeScreenActivity.this.startActivity(stats);
			}
			
		});
		
		
//		Button scoreSheet = (Button) findViewById(R.id.statsButton);
//		liveStats.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				Intent stats = new Intent(HomeScreen.this, ScoreSheetActivity.class);
//        		HomeScreen.this.startActivity(stats);
//			}
//			
//		});
//		
//		Button teamSelect = (Button) findViewById(R.id.statsButton);
//		liveStats.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				Intent stats = new Intent(HomeScreen.this, TeamSelectActivity.class);
//        		HomeScreen.this.startActivity(stats);
//			}
//			
//		});
	}
}
