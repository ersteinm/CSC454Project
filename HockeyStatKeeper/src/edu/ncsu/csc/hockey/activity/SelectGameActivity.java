package edu.ncsu.csc.hockey.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SelectGameActivity extends Activity {
	
	ArrayAdapter<CharSequence> adapter;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.games);
		
		adapter = ArrayAdapter.createFromResource(this, R.array.games, android.R.layout.simple_spinner_item );
		adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
	}
	
	public void newGame(View v) {
		Toast.makeText(getApplicationContext(), "New game created", Toast.LENGTH_SHORT).show();
		Intent i = new Intent(SelectGameActivity.this, SelectTeamActivity.class);
    	SelectGameActivity.this.startActivity(i);
	}
	
	public void chooseGame(View v) {
		new AlertDialog.Builder(this)
		  .setTitle("Choose a team")
		  .setAdapter(adapter, new DialogInterface.OnClickListener() {

		    public void onClick(DialogInterface dialog, int which) {
		    	Toast.makeText(getApplicationContext(), "Team 1 vs Team 2 - 5/1/2012 selected", Toast.LENGTH_SHORT).show();
				Intent i = new Intent(SelectGameActivity.this, HomeScreenActivity.class);
		    	SelectGameActivity.this.startActivity(i);
		    	dialog.dismiss();
		    }
		  }).create().show();
	}

}
