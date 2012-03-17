package edu.loras.AppsOfSteel;

import com.google.android.maps.GeoPoint;

import edu.loras.AppsOfSteel.R;
import edu.loras.AppsOfSteel.R.drawable;

public interface TourLocations 
{	
	public static final String[] standardAry = {"Tap here for more info."};
	
	// The order of these locations will be the order they are drawn in the 
	// LinesTourOverlay
	public static final location tourLocations[] = 
		{
			new location(
	    			"Keane Hall (Admissions Office)", 
	    			new GeoPoint(42503080, -90681130), 
	    			"Historically, Keane Hall was an all-male residence hall; currently Keane houses administrative offices and classrooms. The administrative offices in Keane include: Admission, Financial Planning, the President's Office, the Academic Dean and Associate Academic Dean, the Vice President for College Advancement, the Registrar, the Business Office, the Alumni and Development Offices, the Office of Continuing Education, Institutional Marketing and the Print Center.", 
	    			"eat",
	    			R.drawable.keane,
	    			standardAry),
    			
			new location(
					"Academic Resource Center", 
					new GeoPoint(42503180,-90679750), 
					"The new Academic Resource Center is a significant presence not only on our campus grounds, but in the academic life of the College and its mission. We have researched other colleges and the literature about students' academic needs. This bricks-and-mortar addition, together with ongoing curriculum and faculty development, transforms student learning. Key academic support offices are housed in this building as well as the Barnes & Noble College Bookstore and the Loras College Library.", 				
					"study",
					R.drawable.arc,
					standardAry),
					
			new location(
					"Alumni Campus Center", 
					new GeoPoint(42503910,-90679040), 
					"Renovated in 1992, the Alumni Campus Center is located in the center of campus and houses many organizations and facilities including: Campus Ministry; Student Senate; the College Activities Board (CAB); Counseling Center; computer, math and writing labs; The Pub and Cafeteria; the Center for Experiential Learning; Campus Safety; Campus Health; Student Life Offices; the Office of Intercultural Programs; and several meeting rooms. The Cafeteria is where students who live on campus eat most of their meals. Open to all students, faculty, staff and visitors, the Cafeteria offers several different menus daily including a grill, a vegetarian selection and a deli bar. The Pub is a snack bar where students, faculty, staff and visitors can grab a burger, play pool, visit with friends, watch TV or study. The pictures on the walls of the Pub tell stories about the history of Loras and the Dubuque area. ", 
					"havefun", 
					R.drawable.acc,
					standardAry), 
					
			new location(
	    			"Athletic and Wellness Center", 
	    			new GeoPoint(42504910, -90678450), 
	    			"Description here.", 
	    			"havefun",
	    			R.drawable.havefun,
	    			standardAry),
	    			
			new location(
	    			"Smyth Hall", 
	    			new GeoPoint(42504880, -90679270), 
	    			"Description here.", 
	    			"sleep",
	    			R.drawable.sleep,
	    			standardAry),
	    			
		    new location(
	        		"Fieldhouse", 
	        		new GeoPoint(42504170, -90681450), 
	        		"Description here.", 
	        		"havefun",
	        		R.drawable.havefun,
	        		standardAry),
    		
    		new location(
		    		"Christ the King Chapel", 
		    		new GeoPoint(42503620,-90681520), 
		    		"This beautiful chapel has played a significant role in Loras history since its construction in 1946. Christ the King is dedicated to the memory of the Rev. Aloysius Schmitt ('31), the first chaplain killed in World War II and all chaplains who gave their life while ministering to others. Connected to Keane Hall, the basement of the Chapel is home to Loras Technology Center where students can go to receive technical support for their laptop computers.", 
		    		"havefun",
		    		R.drawable.ctk,
		    		standardAry),

		};
}
