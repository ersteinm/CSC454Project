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
		
		
		Button scoreSheet = (Button) findViewById(R.id.scoreSheetButton);
		scoreSheet.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent scores = new Intent(HomeScreenActivity.this, AssistsDataActivity.class);
        		HomeScreenActivity.this.startActivity(scores);
			}
			
		});
		
		Button teamSelect = (Button) findViewById(R.id.chooseTeamButton);
		teamSelect.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent teams = new Intent(HomeScreenActivity.this, SelectTeamActivity.class);
        		HomeScreenActivity.this.startActivity(teams);
			}
			
		});
		
		Button gameSelect = (Button) findViewById(R.id.chooseGameButton);
		gameSelect.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent games = new Intent(HomeScreenActivity.this, SelectGameActivity.class);
        		HomeScreenActivity.this.startActivity(games);
			}
			
		});
	}
}
