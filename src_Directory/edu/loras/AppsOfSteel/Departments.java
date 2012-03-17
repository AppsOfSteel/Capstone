package edu.loras.AppsOfSteel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Departments extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Bundle bundle = getIntent().getExtras();
		String department = bundle.getString("department");
		
		if(department.equals("Behavioral Sciences")){
			setContentView(R.layout.behavioral_sciences);
		}
		
	}

}