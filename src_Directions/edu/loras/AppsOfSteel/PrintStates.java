package edu.loras.AppsOfSteel;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class PrintStates extends Activity implements States {
    /** Called when the activity is first created. */
	
	TextView display0, display1, display2, display3, display4, display5, display6, display7, display8;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.directions);
        
        Bundle b = getIntent().getExtras();
        String stateName = b.getString("stateName");
        
        // link java variables to XML
        
        display0 = (TextView) findViewById(R.id.tvDisplay0);
        display1 = (TextView) findViewById(R.id.tvDisplay1);
        display2 = (TextView) findViewById(R.id.tvDisplay2);
        display3 = (TextView) findViewById(R.id.tvDisplay3);
        display4 = (TextView) findViewById(R.id.tvDisplay4);
        display5 = (TextView) findViewById(R.id.tvDisplay5);
        display6 = (TextView) findViewById(R.id.tvDisplay6);
        display7 = (TextView) findViewById(R.id.tvDisplay7);
        display8 = (TextView) findViewById(R.id.tvDisplay8);
        
        for(int i = 0; i < states.length; i++)
        {
        	if(stateName.equals(states[i].getStateName()))
        	{
        		// set text views
        		display0.setText(states[i].getStateName());
        		display1.setText(states[i].getTitle1());
        		display2.setText(states[i].getDescription1());
        		display3.setText(states[i].getTitle2());
        		display4.setText(states[i].getDescription2());
        		display5.setText(states[i].getTitle3());
        		display6.setText(states[i].getDescription3());
        		display7.setText(states[i].getTitle4());
        		display8.setText(states[i].getDescription4());
        	}
        		
        }
        
    }
}