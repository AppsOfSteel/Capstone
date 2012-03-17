package edu.loras.AppsOfSteel;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Organization extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.organizations);
	    Bundle b = getIntent().getExtras(); 
	    String name = b.getString("name");
	    String info = b.getString("info");
		        
		   
		        
		    
		final TextView title = (TextView)findViewById(R.id.txtTitle);
		final TextView content = (TextView)findViewById(R.id.txtContent);
		ImageView img1 = (ImageView)findViewById(R.id.img1);
		
		title.setText(name);
		img1.setImageResource(R.drawable.dewey);
		content.setText(info);
	}
}