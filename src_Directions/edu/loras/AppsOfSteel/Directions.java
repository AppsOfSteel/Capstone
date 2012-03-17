package edu.loras.AppsOfSteel;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
 
public class Directions extends ListActivity implements States
{
	String ary[] = new String[states.length + 1];
	
	/** Called when the activity is first created. */
	@Override
    public void onCreate(Bundle savedInstanceState)
    {
		super.onCreate(savedInstanceState);
 
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ary));
               
        ListView lv = getListView();
        lv.setTextFilterEnabled(true);
 
        lv.setOnItemClickListener(new OnItemClickListener()
        {
        	public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
        		for(int i = 0; i < states.length; i++)
        		{
        			if(position == i)
                    {
            			Intent myIntent = new Intent(Directions.this, PrintStates.class);
            			Bundle b = new Bundle();
            			b.putString("stateName", ary[i]);
            			myIntent.putExtras(b);
    	                startActivity(myIntent);
                    }
        		}
        		
        		if(position == states.length)
        		{
        			//Intent myIntent = new Intent(view.getContext(), ShowLocationActivity.class);
                    //startActivityForResult(myIntent, 0);
        		}
            }
        });
        
        // list of items
        for(int i = 0; i < states.length; i++)
        {
        	ary[i] = states[i].getStateName();
        }
        ary[states.length] = "From Current Location";
                               
     }
}
