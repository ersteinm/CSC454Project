package edu.ncsu.csc.hockey.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.ToggleButton;

public class OffensiveZoneActivity extends Activity {
	ToggleButton togButton;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stats);
        ImageView iView = (ImageView) findViewById(R.id.imageView1);
        iView.setBackgroundResource(R.drawable.ozone);
        
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.periods, android.R.layout.simple_spinner_item );
      	adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
      	Spinner s = (Spinner) findViewById( R.id.spinner1 );
		s.setAdapter(adapter);
        
        togButton = (ToggleButton) findViewById(R.id.toggleButton);
        togButton.setButtonDrawable(R.drawable.faceoffbutton);
        togButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				buttonToggle();
			}
        });
        
        Button dButton = (Button) findViewById(R.id.button1);
        dButton.setText("Switch to Defense");
        dButton.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		Intent myIntent = new Intent(OffensiveZoneActivity.this, DefensiveZoneActivity.class);
        		OffensiveZoneActivity.this.startActivity(myIntent);
        	}
        });
    }
    
    public void buttonToggle(){
    	if(togButton.getTag().toString().equalsIgnoreCase("faceoff")){
    		togButton.setTag("shot");
    		togButton.setButtonDrawable(R.drawable.shotbutton);
    	} else{
    		togButton.setTag("faceoff");
    		togButton.setButtonDrawable(R.drawable.faceoffbutton);
    	}
    }
    
    public void enterData(View v) {
    	if(togButton.getTag().toString().equalsIgnoreCase("faceoff")){
    		Intent i = new Intent(OffensiveZoneActivity.this, FaceoffDataActivity.class);
    		OffensiveZoneActivity.this.startActivity(i);
    	} else{
    		Intent i = new Intent(OffensiveZoneActivity.this, ShotDataActivity.class);
    		OffensiveZoneActivity.this.startActivity(i);
    	}
    }
}