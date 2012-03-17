// http://developer.android.com/resources/tutorials/views/hello-listview.html

package edu.loras.AppsOfSteel;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//import android.content.SharedPreferences;  
import android.util.Log;

public class LorasMajorsList extends ListActivity {
    /** Called when the activity is first created. */
	//private String PREFS_NAME;

	private String[] majors;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //PREFS_NAME = getResources().getString(R.string.majors_prefs);
        
        majors = getResources().getStringArray(R.array.majors_array);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, majors));
        
        ListView list = getListView();
        
        list.setOnItemClickListener(new OnItemClickListener() {
        	public void onItemClick(AdapterView<?> parent, View view,
        	        int position, long id) {
        		//Log.v("text", majors[(int) id]);
        		Intent detailsIntent = new Intent(LorasMajorsList.this, LorasMajorsDetails.class);
        	    Bundle detailsBundle = new Bundle();
        	    detailsBundle.putString("majorSelected", majors[(int) id]);
        	    detailsIntent.putExtras(detailsBundle);
        	    startActivity(detailsIntent);
        	}
        });
        
        //initializeMajorsData();
        

    }
    
    /*private void initializeMajorsData() {
    	SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("AthleticTrainingDesc", "The Loras College Athletic Training Education Program is designed to prepare students for successful careers in athletic training and other allied healthcare professions. This is achieved through 4 years of classroom education and 3 years of hands on clinical rotations. Students apply for formal acceptance to the program during their first year on campus. Upon graduation, students are eligible to sit for the Board of Certification (BOC) exam necessary to become a certified athletic trainer.");
        editor.putString("BiochemistryDesc", "Chemistry and Biochemistry provides students with the opportunity to develop a strong foundation in chemical principles and to apply them to laboratory applications. This foundation enables Chemistry and Biochemistry graduates to pursue a wide range of careers in chemical industry, research, education, and engineering, or in interdisciplinary fields such as medicine, dentistry, other health professions, forensic science, or patent law.");
        editor.commit();
    }*/
    // Other page:
    // SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
    // majorDescription = settings.getString("BiochemistryDesc", "No Data");
        
}
