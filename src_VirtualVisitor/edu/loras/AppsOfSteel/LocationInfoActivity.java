package edu.loras.AppsOfSteel;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LocationInfoActivity extends Activity implements Locations
{
	
	TextView locationName;
	TextView locationDescription;
	ImageView locationImage;
	
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_info);
        
        Bundle b = getIntent().getExtras();
        String Title = b.getString("locationName");
        
        // link java variables to XML
        locationName = (TextView) findViewById(R.id.locationName);
        locationDescription = (TextView) findViewById(R.id.locationDescription);
        locationImage = (ImageView) findViewById(R.id.locationImage);
        
        // set title
        locationName.setText(Title);      
        
        for(int i = 0; i < Locations.length; i++)
        {
        	if(Title.equals(Locations[i].getLocationName()))
        	{
                // set description
        		locationDescription.setText(Locations[i].getDescription());
        		// set image
        		locationImage.setImageResource(Locations[i].getImage());
        	}
        }
    }
}
