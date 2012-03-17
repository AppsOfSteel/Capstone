package edu.loras.AppsOfSteel;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class menuCalendar extends ListActivity {
	String terms[] = {"Spring 2012","Fall 2012","January Term 2013", "Spring 2013", "Fall 2013"};
	 
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(menuCalendar.this, android.R.layout.simple_list_item_1, terms));
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		int pos = position;
		String name = null;
		String info = null;
		switch(pos)
		{
		case 0:
			name="Spring 2012";
			info="\n"+"January 30: Classes begin at 8:00 a.m." + "\n"+"\n" +"January 30: Instructor signature required to add a class" + "\n"+"\n" +"January 30: All adds must be processed in the Registrar's Office" + "\n"+"\n" + "February 3: Last day to add a semester-long class, a first quarter class, an undergraduate or graduate independent study. Signed add cards accepted in the Registrar's Office until 4:30 p.m. "+"\n"+"\n"+"February 3: Last day to change registration to pass/fail or from audit to credit or from credit to audit "+"\n"+"\n"+"February 3: Last day to drop a first quarter class without receiving a grade of F (Fail) "+"\n"+"\n"+"February 17: Last day to drop a semester-long course without receiving a grade of W (Withdraw) "+"\n"+"\n"+"February 17: Last day to finalize registration for an internship "+"\n"+"\n"+"February 18: W (Withdraw) grade added to transcript for courses dropped from February 20 through March 30"+"\n"+"\n"+"March 1-2: Spring Free Days - no classes"+"\n"+"\n"+"March 16: First quarter ends"+"\n"+"\n"+"March 19-23: Quarter classes do not meet this week"+"\n"+"\n"+"March 20: Midterm grades due in Registrar's Office by 1:00 p.m. "+"\n"+"\n"+"March 20 Last day to remove undergraduate I (Incomplete) grade from fall 2011"+"\n"+"\n"+"March 26: Second quarter classes begin"+"\n"+"\n"+"March 30: Last Day to Add a second quarter class"+"\n"+"\n"+"March 30: Last day to drop a semester-long class and receive a grade of W (Withdraw). Courses dropped after 4:30 p.m. receive a final grade of F(ail) "+"\n"+"\n"+"April 4: Last day to drop a second quarter class without receiving a final grade of F (Fail) "+"\n"+"\n"+"April 5-9: Easter Break - no classes"+"\n"+"\n"+"April 16: Registration for Fall 2012 begins"+"\n"+"\n"+"May 11: Application for Graduation due in the Registrar's Office for students graduating in December 2012"+"\n"+"\n"+"May 11: Last day of classes"+"\n"+"\n"+"May 12: Group Exam for LIB 220 Democracy & Diversity 9:00 a.m. "+"\n"+"\n"+"May 14-17: Final Examinations"+"\n"+"\n"+"May 19: Baccalaureate/Commencement"+"\n"+"\n"+"May 22: Final Grades Due in Registrar's Office by 1:00 p.m.";
		break;
		case 1:
			name="Fall 2012";
			info="\n"+"August 27: Classes begin at 8:00 a.m."  + "\n"+ "\n" +"September 3: Labor Day - no classes" + "\n" + "\n" +"October	18,19: Fall Free Days - no classes" + "\n" + "\n" +"November 21-23: Thanksgiving Break - no classes" + "\n" + "\n" +"December 7: Last day of classes"  + "\n"+ "\n" +"December 10-13: Final Examinations";
		break;
		case 2:
			name="January Term 2013";
			info="\n"+"January 7: J-Term classes begin" + "\n"+"\n"+"January 25: Last day of J-Term" + "\n"+"\n"+"January 28 – February 1: J-Term Break—no classes";
		break;
		case 3:
			name="Spring 2013";
			info="\n"+"February  4: Classes begin at 8:00 a.m."  + "\n"+"\n"+ "March 25-29: Easter/spring break (classes meet Easter Monday)" + "\n" +"\n"+ "May 17: Last day of classes"  + "\n"+"\n"+ "May 20-23: Final examinations"  + "\n"+"\n"+ "May 25: Baccalaureate/Commencement";
		break;
		case 4:
			name="Fall 2013";
			info="\n"+"August 26: Classes begin at 8:00 a.m. " + "\n"+ "\n" + "September 2: Labor Day" + "\n"+ "\n" + "October 17-18: Fall Free Days "+ "\n" + "\n" + "November 27-29: Thanksgiving Break"+ "\n" + "\n" + "December 6: Last day of classes" + "\n"+ "\n" + "December 9-12: Final Examinations";
		break;
		}
		Intent intent = new Intent(menuCalendar.this, Calendar.class); 
		 Bundle b = new Bundle(); 
			       
			                  
		  b.putString("name", name);
		  b.putString("info", info);
			        
		  //Add the set of extended data to the intent and start it
		  intent.putExtras(b);
		  startActivity(intent); 
	}
}
