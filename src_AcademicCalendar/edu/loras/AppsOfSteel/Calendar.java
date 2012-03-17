package edu.loras.AppsOfSteel;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class Calendar extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calendar);
		Bundle b = getIntent().getExtras(); 
	    String name = b.getString("name");
	    String info = b.getString("info");
		
		final TextView title = (TextView)findViewById(R.id.txtTitle);
		final TextView content = (TextView)findViewById(R.id.txtContent);
		title.setText(name);
		content.setText(info);
	}
}
