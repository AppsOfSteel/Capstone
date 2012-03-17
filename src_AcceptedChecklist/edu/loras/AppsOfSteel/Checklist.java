package edu.loras.AppsOfSteel;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Checklist extends ListActivity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, CHOICES));

        final ListView listView = getListView();

        listView.setItemsCanFocus(false);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    }
    
    @Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
	}




	private static final String[] CHOICES  = new String[] {
        "Schedule a Visit", "Fill Out FAFSA Form", "Check Mail From Loras", "Apply for Housing",
        "Example 5", "Example 6", "Example 7", "Example 8", "Example 9", "Example 10"
    };
}