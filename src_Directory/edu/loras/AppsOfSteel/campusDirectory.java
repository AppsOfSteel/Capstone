package edu.loras.AppsOfSteel;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.util.Linkify;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class campusDirectory extends ListActivity{

	String classes[] = {"Behavioral Sciences","Business Administration","Communication and Fine Arts","Education","Language and Literature","Mathematics, Engineering and Computer Science","Molecular and Life Sciences","Philosophy, Religion and Theology","Physical Education and Sport Studies","Social and Cultural Studies"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		TextView admin = new TextView(this);
		TextView phone = new TextView(this);
		phone.setAutoLinkMask(Linkify.PHONE_NUMBERS);
		phone.setText("(800) 245-6727\n(563) 588-7100");
		admin.setText(Html.fromHtml("<b>Loras College Administrative Offices and Information</b><br/>1450 Alta Vista St.<br/>Dubuque, IA 52001"));
		getListView().addHeaderView(admin,false, false);
		getListView().addHeaderView(phone,false, true);
		setListAdapter(new ArrayAdapter<String>(campusDirectory.this, R.layout.appsofsteel, classes));
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

