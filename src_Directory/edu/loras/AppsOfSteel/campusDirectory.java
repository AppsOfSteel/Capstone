package edu.loras.AppsOfSteel;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class campusDirectory extends ListActivity{

	String classes[] = {"Behavioral Sciences","Business Administration","Communications and Fine Arts","Education","Language and Literature","Mathematics, Engineering, and Computer Science","Molecular and Life Sciences","Philosophy, Religion, and Theology","Physical Education and Sports Studies","Social and Cultural Studies"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(campusDirectory.this, android.R.layout.simple_list_item_1, classes));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String item = classes[position];
		
		Class ourClass;
		try {
			ourClass = Class.forName("edu.loras.AppsOfSteel.Departments");
			Intent ourIntent = new Intent(campusDirectory.this, ourClass);
			
			Bundle params = new Bundle();
			params.putString("department", item);
			ourIntent.putExtras(params);
			startActivity(ourIntent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}

