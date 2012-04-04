package edu.loras.AppsOfSteel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.util.Linkify;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Departments extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Bundle bundle = getIntent().getExtras();
		String department = bundle.getString("department");
		
		setContentView(R.layout.behavioral_sciences);
		
		String str = "";
		InputStream inputstream = getResources().openRawResource(R.raw.campus_directory);
		BufferedReader reader;
		try {
			reader = new BufferedReader(new InputStreamReader(inputstream, "utf-8"));
		
		Pattern p = Pattern.compile("\\;");
		LinearLayout layout = (LinearLayout) findViewById(R.id.directory);
		
		if(inputstream != null)
		{
			
			while(str != null)
			{
				try {
					str = reader.readLine();

					if(str != null)
					{
						String[] result = p.split(str);
						
							Pattern category = Pattern.compile(department);
							Matcher mCategory = category.matcher(result[0]);
							
							if(mCategory.find())
							{
								parser(result,layout);
								TextView space = new TextView(this);
								space.setText("");
								layout.addView(space);
							}
						
						
						
						/*int emailStart = 0;
						Pattern email = Pattern.compile("\\@");
						int specialTitleStart = 0;
						for(int i = titleStart; i < result.length; i++)
						{
							Matcher mEmail = email.matcher(result[i]);
							if(mEmail.find())
							{
								emailStart = i; 
							}
						}
				
				
				TextView name = new TextView(this);
				name.setText(result[0]+", "+result[1]);
				name.setTypeface(null,Typeface.BOLD);
				name.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
				
				TextView titleText = new TextView(this);
				titleText.setText(result[2].trim());
				for(int i = 3; i <= titleStart; i++)
				{
					titleText.append(", "+result[i].trim());
				}
				
				titleText.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
				
		
				TextView emailText = new TextView(this);
				emailText.setAutoLinkMask(Linkify.EMAIL_ADDRESSES);
				emailText.setText(result[emailStart].trim());
				emailText.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
				layout.addView(name);
				layout.addView(titleText);
				TextView specialTitle = new TextView(this);
				specialTitle.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
				if(emailStart > titleStart + 1)
				{
					specialTitle.setText(result[titleStart+1]);
					for(int i = titleStart + 2; i < emailStart; i++)
					{
						specialTitle.append(", "+result[i]);
					}
					
					layout.addView(specialTitle);
				}
				layout.addView(emailText);
				
				TextView credentials = new TextView(this);
				credentials.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
				credentials.setText("");
				for(int i = emailStart + 1; i < result.length; i=i+3)
				{
				  credentials.append(result[i]+", "+result[i+1]+", "+result[i+2]+"\n");
				}
				layout.addView(credentials);*/
					}
				
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
				
			}
		}
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	
	}
	
	public void parser(String[] result, LinearLayout layout)
	{
		Pattern p = Pattern.compile("\\@");
		
		TextView name = new TextView(this);
		name.setText(result[1]);
		name.setTypeface(null,Typeface.BOLD);
		name.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
		layout.addView(name);
		for(int i = 2; i < result.length; i++)
		{
			TextView newText = new TextView(this);
			newText.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
			Matcher m = p.matcher(result[i]);
			if(m.find())
			{
				newText.setAutoLinkMask(Linkify.EMAIL_ADDRESSES);
			}
			
			newText.setText(Html.fromHtml(result[i].trim()).toString());
			layout.addView(newText);
			
		}
		
	}
	
}

