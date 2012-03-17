package edu.loras.AppsOfSteel;

import com.google.android.maps.GeoPoint;

public interface Locations 
{
	public static final String[] standardAry = {"Tap here for more info."};
	public static final String[] ACC = {"Alumni Campus Center", "The Cafeteria", "The Pub"};
	
	public static final location[] Locations = 
	{
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
				ACC), 
			
		new location(
				"Lynch-McCarthy Apartments", 
				new GeoPoint(42505730,-90675120), 
				"Loras broke ground in February,2002 on a new apartment complex that houses students in 21 four-bedroom apartments. The residence hall provides students with 50 or more credits who meet a minimum GPA requirement off-campus living amenities in an on-campus environment. The site slopes slightly down to 16th Street, offering panoramic views from all directions. To accommodate the slope and take advantage of the views, the apartments step up the slope making the facility four stories in height on the north end and two stories on the south end. The structure, which consists of two separate buildings, is connected by an independent stair tower, has individual outside doors on apartments. An exterior deck on the fourth floor wraps around the stair tower and an outdoor space between the buildings provides semi-private space to residents and community space for campus gatherings and events.", 
				"sleep",
				R.drawable.lmac,
				standardAry),
		
	    new location(
	    		"Beckman Hall", 
	    		new GeoPoint(42504800,-90675810), 
	    		"BackmanDescription here.", 
	    		"eat", 
	    		R.drawable.sleep,
	    		standardAry),
	    
	    new location(
	    		"Binz Hall", 
	    		new GeoPoint(42505280,-90675560), 
	    		"Binz Description here.", 
	    		"sleep",
	    		R.drawable.sleep,
	    		standardAry),
	    
	    new location(
	    		"Byrne Oaks Complex", 
	    		new GeoPoint(42507110,-90681650), 
	    		"The Byrne Oaks Apartments are one of our housing alternatives available to juniors and seniors. Each fully-furnished apartment houses six people who share four rooms (two singles and two doubles). There are also two bathrooms, a kitchen and living room in each apartment. The complex consists of three buildings connected by corridors at each of the three levels, and each building has its own resident assistant. Byrne Oaks also has a recreation room and coin-operated laundry. Students who wish to live in Byrne Oaks must meet certain academic requirements, such as maintaining a 2.0 GPA and having a minimum of 50 credit hours. ", 
	    		"sleep",
	    		R.drawable.bo,
	    		standardAry),
	    
	    new location(
	    		"Christ the King Chapel", 
	    		new GeoPoint(42503620,-90681520), 
	    		"This beautiful chapel has played a significant role in Loras history since its construction in 1946. Christ the King is dedicated to the memory of the Rev. Aloysius Schmitt ('31), the first chaplain killed in World War II and all chaplains who gave their life while ministering to others. Connected to Keane Hall, the basement of the Chapel is home to Loras Technology Center where students can go to receive technical support for their laptop computers.", 
	    		"havefun",
	    		R.drawable.ctk,
	    		standardAry),
	    
        new location(
        		"Faber-Clark Soccer Field", 
        		new GeoPoint(42504440, -90677470), 
        		"Description here.", 
        		"havefun",
        		R.drawable.havefun,
        		standardAry),
        
        new location(
        		"Faber-Clark Softball Field", 
        		new GeoPoint(42504990, -90676770), 
        		"Description here.", 
        		"havefun",
        		R.drawable.havefun,
        		standardAry),
        		
        new location(
        		"Fieldhouse", 
        		new GeoPoint(42504170, -90681450), 
        		"Description here.", 
        		"havefun",
        		R.drawable.havefun,
        		standardAry),
        		
        new location(
        		"Graber Sports Center", 
        		new GeoPoint(42506220, -90680480), 
        		"Description here.", 
        		"havefun",
        		R.drawable.havefun,
        		standardAry),
        
        //Grotto = new location("Grotto", new GeoPoint(42503180,-90679750), "Description here.", "havefun"),
        		
    	new location(
    			"Hennessy Hall", 
    			new GeoPoint(42504610,-90682090), 
    			"Description here.", 
    			"study",
    			R.drawable.study,
    			standardAry),
    			
    	new location(
    			"Hoffmann Hall", 
    			new GeoPoint(42504080, -90676330), 
    			"Established in 1909 Hoffmann Hall, formerly St. Joseph's Hall, is the original building of Loras College. Inside, you can find offices for the accounting and business, English, philosophy, political science and communication arts departments. Hoffmann also houses St. Joseph's Auditorium (home to the Loras Players), the Instructional Resource Center, the Loras College Radio Station (KLCR) and Television Studio (LCTV), The Lorian (student newspaper) and St. Joseph's Chapel.", 
    			"study",
    			R.drawable.hoffmann,
    			standardAry),
    			
    	new location(
    			"Keane Hall (Admissions Office)", 
    			new GeoPoint(42503080, -90681130), 
    			"Historically, Keane Hall was an all-male residence hall; currently Keane houses administrative offices and classrooms. The administrative offices in Keane include: Admission, Financial Planning, the President's Office, the Academic Dean and Associate Academic Dean, the Vice President for College Advancement, the Registrar, the Business Office, the Alumni and Development Offices, the Office of Continuing Education, Institutional Marketing and the Print Center.", 
    			"eat",
    			R.drawable.keane,
    			standardAry),
    			
    	//Observatory = new location("Observatory", new GeoPoint(42503180,-90679750), "Description here.", "eat"),
    			
    	new location(
    			"Physical Plant", 
    			new GeoPoint(42504000, -90678280), 
    			"Description here.", 
    			"eat",
    			R.drawable.eat,
    			standardAry),
    			
    	new location(
    			"Heitkamp Planetarium", 
    			new GeoPoint(42503810, -90681030), 
    			"The Heitkamp Memorial Planetarium is one of the special features of Loras College. Monthly shows, often presented by students in the science department, are open to both students and the Dubuque community, providing them with insight on a variety of other worldly topics. Students can do some star-searching of their own in the campus observatory, which is open at scheduled times.", 
    			"eat",
    			R.drawable.planetarium,
    			standardAry),
    			
    	new location(
    			"Rock Bowl Stadium", 
    			new GeoPoint(42505220, -90680670), 
    			"One of the picturesque venues in the Midwest, the Rock Bowl has been the home to Duhawk football since 1940, and underwent some major renovations prior to the 2005 season. Like the Rose, Cotton and Orange Bowls, Loras College's home field, the Rock Bowl, takes its name from an actual bowl game first played at the new Loras stadium in 1940. Cut deep into the surrounding bluff in a natural bowl setting, the stadium gradually took on the name of its much publicized end-of-season game and picturesque surroundings following World War II. The Rock Bowl has seating capacity for 3,500 fans in the bleachers, with additional space for fans on the grassy slopes overlooking Bierie Field. Home football and Soccer games will be found on Bierie field.", 
    			"havefun",
    			R.drawable.rock_bowl,
    			standardAry),
    			
    	new location(
    			"Rohlman Hall", 
    			new GeoPoint(42505970, -90681570), 
    			"Description here.", 
    			"sleep",
    			R.drawable.sleep,
    			standardAry),
    	
    	new location(
    			"San Jose Swimming Pool", 
    			new GeoPoint(42506760, -90680680), 
    			"Description here.", 
    			"eat", 
    			R.drawable.eat,
    			standardAry),

    	new location(
    			"Smyth Hall", 
    			new GeoPoint(42504880, -90679270), 
    			"Description here.", 
    			"sleep",
    			R.drawable.sleep,
    			standardAry),
    			
    	new location(
    			"St. Joseph Chapel", 
    			new GeoPoint(42503930, -90676740), 
    			"Description here.", 
    			"eat",
    			R.drawable.eat,
    			standardAry),
    			
    	new location(
    			"St. Joseph Hall of Science", 
    			new GeoPoint(42505230, -90682910), 
    			"Inside St. Joseph's Hall of Science you will find the biology, chemistry, biochemistry, physics and engineering departments. Most classes are held in laptop-wired lecture halls, or in specialized labs. The Science Hall is host to students studying polymer chemistry; the only undergraduate school this size in the nation to offer this program. The Science Hall is also home to the world's largest freshwater diatom collection. Also found in this building are a cadaver lab for pre-med students and a wildlife exhibit with an assortment of animals.", 
    			"eat",
    			R.drawable.science_hall,
    			standardAry),
    			
    	new location(
    			"Tennis Courts", 
    			new GeoPoint(42505720, -90678620), 
    			"Description here.", 
    			"eat",
    			R.drawable.eat,
    			standardAry),
    			
    	new location(
    			"Visitation Complex", 
    			new GeoPoint(42499780, -90678540), 
    			"Description here.", 
    			"sleep",
    			R.drawable.sleep,
    			standardAry),
    			
    	new location(
    			"Wahlert Hall", 
    			new GeoPoint(42504170, -90680150), 
    			"Description here.", 
    			"study",
    			R.drawable.study,
    			standardAry),
    			
    	new location(
    			"Athletic and Wellness Center", 
    			new GeoPoint(42504910, -90678450), 
    			"Description here.", 
    			"havefun",
    			R.drawable.havefun,
    			standardAry),
    			
    	//new location("Alumni Plaza", new GeoPoint(42503180,-90679750), "Description here.", "eat"),
    	
    	// categorizing locations as "submenu" prevents MapsActivity from creating an overlay on the map
    	new location(
    			"The Cafeteria", 
    			new GeoPoint(42503910,-90679040), 
    			"Description here.", 
    			"submenu",
    			R.drawable.eat,
    			standardAry),
    			
    	new location(
    			"The Pub", 
    			new GeoPoint(42503910,-90679040),
    			"Description here.", 
    			"submenu",
    			R.drawable.eat,
    			standardAry),
    	/*
    	new location("The Pod", new GeoPoint(42503180,-90679750), "Description here.", "eat"),
    	new location("The Duhawk Market", new GeoPoint(42503180,-90679750), "Description here.", "eat"),
    	new location("Hoffmann Hall Auditorium", new GeoPoint(42503180,-90679750), "Description here.", "havefun"),
    	new location("Kionia House", new GeoPoint(42503180,-90679750), "Description here.", "havefun"),
    	new location("Belmont House", new GeoPoint(42503180,-90679750), "Description here.", "havefun"),
        */  	
	};
}
