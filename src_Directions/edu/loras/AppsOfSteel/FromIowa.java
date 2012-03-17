package edu.loras.AppsOfSteel;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FromIowa extends Activity {
    /** Called when the activity is first created. */
	
	TextView display, display2, display3, display4, display5, display6, display7, display8;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.directions);

        display = (TextView) findViewById(R.id.tvDisplay0);
        display2 = (TextView) findViewById(R.id.tvDisplay2);
        display3 = (TextView) findViewById(R.id.tvDisplay3);
        display4 = (TextView) findViewById(R.id.tvDisplay4);
        display5 = (TextView) findViewById(R.id.tvDisplay5);
        display6 = (TextView) findViewById(R.id.tvDisplay6);
        display7 = (TextView) findViewById(R.id.tvDisplay7);
        display8 = (TextView) findViewById(R.id.tvDisplay8);
        
        display.setText("Traveling Hwy 20 East into Dubuque:");
        
        display2.setText("Take the Grandview Ave. exit.\n" +
        "Travel through the 1st stoplight.\n" +
        "Turn left at the 2nd stoplight onto Grandview Ave.\n" +
        "Travel through one stoplight and two stop signs.\n" + 
        "Turn right at the next stoplight onto Loras Blvd.\n" + 
        "Travel 4 blocks, and Loras College will be on your left.\n");
        
        display3.setText("Traveling Hwy 61/151 North into Dubuque:");
        
        display4.setText("Take the Grandview Ave. exit.\n" +
        "Turn left onto Grandview.\n" + 
        "Travel approximately 14 blocks through two stoplights and two stop signs.\n" + 
        "Turn right at the next stoplight onto Loras Blvd.\n" +
        "Travel four blocks and Loras College will be on your left.\n");
        
        display5.setText("Traveling Hwy 52 North into Dubuque:");
        
        display6.setText("Turn right onto Hwy 61/151 North and follow the directions for traveling Hwy 61/151 North into Dubuque.\n");
        
        display7.setText("Traveling Hwy 52 South into Dubuque:");
        
        display8.setText("Hwy 52 turns into Central Ave.\n" +
        "Turn right at 32nd St.\n" +
        "Travel about one mile and turn left onto Grandview Ave.\n" +
        "Follow Grandview Ave. for about 3 miles continuing straight through 3 stop signs.\n" +
        "After crossing Clarke Dr, Grandview Ave curves to the left and then curves to the right at the top of the hill.\n" +
        "Turn left at the stoplight onto Loras Blvd.\n" +
        "Travel 4 blocks, and Loras College will be on your left.\n");
    }
}