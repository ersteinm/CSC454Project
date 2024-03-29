package edu.ncsu.csc.hockey.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SelectTeamActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teams);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
        		  this, R.array.teams, android.R.layout.simple_spinner_item );
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        		
        Spinner s = (Spinner) findViewById( R.id.home_spinner );
        s.setAdapter( adapter );
        
        Spinner s2 = (Spinner) findViewById( R.id.away_spinner );
        s2.setAdapter( adapter );
       
    }
    
    public void submitTeams(View v) {
    	Toast.makeText(getApplicationContext(), "Home: Team 2\nAway: Team 3", Toast.LENGTH_LONG).show();
    	Intent i = new Intent(SelectTeamActivity.this, HomeScreenActivity.class);
    	SelectTeamActivity.this.startActivity(i);
    }
}