package edu.ncsu.csc.hockey.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class AssistsDataActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assists);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
        		  this, R.array.players, android.R.layout.simple_spinner_item );
        		adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        		
        		Spinner s = (Spinner) findViewById( R.id.spinner1 );
        		s.setAdapter( adapter );
        		
        		Spinner s2 = (Spinner) findViewById( R.id.spinner2 );
        		s2.setAdapter( adapter );
        		
        		Spinner s3 = (Spinner) findViewById( R.id.spinner3 );
        		s3.setAdapter( adapter );
        		
        		Spinner s4 = (Spinner) findViewById( R.id.spinner4 );
        		s4.setAdapter( adapter );
        		
        		Spinner s5 = (Spinner) findViewById( R.id.spinner5 );
        		s5.setAdapter( adapter );
        		
        		Spinner s6 = (Spinner) findViewById( R.id.spinner6 );
        		s6.setAdapter( adapter );
        		
        		Spinner s7 = (Spinner) findViewById( R.id.spinner7 );
        		s7.setAdapter( adapter );
        		
        		Spinner s8 = (Spinner) findViewById( R.id.spinner8 );
        		s8.setAdapter( adapter );
        		
        		Spinner s9 = (Spinner) findViewById( R.id.spinner9 );
        		s9.setAdapter( adapter );
        		
        		Spinner s10 = (Spinner) findViewById( R.id.spinner10 );
        		s10.setAdapter( adapter );
        		
       
    }
    
    public void submitAssists(View v) {
    	 Toast.makeText(getApplicationContext(), "Assists updated", Toast.LENGTH_SHORT).show();
    	 Intent i = new Intent(AssistsDataActivity.this, HomeScreenActivity.class);
    	 AssistsDataActivity.this.startActivity(i);
    }
    
}