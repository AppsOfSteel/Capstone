package edu.loras.AppsOfSteel;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AppsOfSteelActivity extends ListActivity 
{ 
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);

		setListAdapter(new ArrayAdapter<String>(this, R.layout.appsofsteel, MENU_ITEMS));
	
		ListView lv = getListView();
		lv.setTextFilterEnabled(true);

		lv.setOnItemClickListener(new OnItemClickListener() 
		{
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) 
			{
				if(position == 0)
    			{  
    				Intent myIntent = new Intent(view.getContext(), VirtualVisitorActivity.class);
    				startActivityForResult(myIntent, 0);
    			}
				if(position == 1)
    			{  
    				Intent myIntent = new Intent(view.getContext(), LorasMajorsList.class);
    				startActivityForResult(myIntent, 0);
    			}
				if(position == 2)
    			{  
    				Intent myIntent = new Intent(view.getContext(), campusDirectory.class);
    				startActivityForResult(myIntent, 0);
    			}
				if(position == 3)
    			{  
    				Intent myIntent = new Intent(view.getContext(), requestInformation.class);
    				startActivityForResult(myIntent, 0);
    			}
				if(position == 4)
    			{  
    				Intent myIntent = new Intent(view.getContext(), menuCalendar.class);
    				startActivityForResult(myIntent, 0);
    			}
				if(position == 5)
    			{  
    				Intent myIntent = new Intent(view.getContext(), GalleryView.class);
    				startActivityForResult(myIntent, 0);
    			}
				if(position == 6)
    			{  
    				Intent myIntent = new Intent(view.getContext(), Visit.class);
    				startActivityForResult(myIntent, 0);
    			}
				if(position == 7)
    			{  
    				Intent myIntent = new Intent(view.getContext(), ExpandableList1.class);
    				startActivityForResult(myIntent, 0);
    			}
				if(position == 8)
    			{  
    				Intent myIntent = new Intent(view.getContext(), Directions.class);
    				startActivityForResult(myIntent, 0);
    			}
				if(position == 9)
    			{  
    				Intent myIntent = new Intent(view.getContext(), Checklist.class);
    				startActivityForResult(myIntent, 0);
    			}
			}
		});
		
	}
	
	static final String[] MENU_ITEMS = new String[] 
	{
		"Virtual Visitor",
		"Majors",
		"Campus Directory",
		"Request Information",
		"Academic Calendar",
		"Photo Gallery",
		"Schedule a Visit",
		"Organizations",
		"Directions",
		"Accepted Student Checklist"
	};
}