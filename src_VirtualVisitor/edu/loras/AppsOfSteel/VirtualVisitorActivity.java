package edu.loras.AppsOfSteel;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;


public class VirtualVisitorActivity extends TabActivity
{
	private TabHost tabHost;
	
	public void onCreate(Bundle savedInstanceState) 
	{
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.virtual_visitor);

	    Resources res = getResources(); // Resource object to get Drawables
	    tabHost = getTabHost();  // The activity TabHost
	    TabHost.TabSpec spec;  // Resusable TabSpec for each tab
	    Intent intent;  // Reusable Intent for each tab

	    // Create an Intent to launch an Activity for the tab (to be reused)
	    intent = new Intent().setClass(this, MapsActivity.class);

	    // Initialize a TabSpec for each tab and add it to the TabHost
	    spec = tabHost.newTabSpec("campusMap").setIndicator("Campus Map",
                res.getDrawable(R.drawable.ic_tab_maps))
            .setContent(intent);
	    tabHost.addTab(spec);

	    // Do the same for the other tab
	    intent = new Intent().setClass(this, TourActivity.class);
	    spec = tabHost.newTabSpec("tour").setIndicator("Campus Tour",
	                      res.getDrawable(R.drawable.ic_tab_tour))
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    tabHost.setCurrentTab(0);
	}
	
	public void changeTab(int tab)
	{
	        tabHost.setCurrentTab(tab);
	}
}
