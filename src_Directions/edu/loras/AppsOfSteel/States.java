package edu.loras.AppsOfSteel;

public interface States
{
	public static final State states[] = 
	{
		new State(
				"From Iowa",
				
				"Traveling Hwy 20 East into Dubuque:",
				
				"Take the Grandview Ave exit.\n" +
				"Travel through the 1st stoplight.\n" +
				"Turn left at the 2nd stoplight onto Grandview Ave.\n" +
				"Travel through one stoplight and two stop signs.\n" + 
				"Turn right at the next stoplight onto Loras Blvd.\n" + 
				"Travel 4 blocks, and Loras College will be on your left.\n",
				
				"Traveling Hwy 61/151 North into Dubuque:",
				
				"Take the Grandview Ave exit.\n" +
		        "Turn left onto Grandview.\n" + 
		        "Travel approximately 14 blocks through two stoplights and two stop signs.\n" + 
		        "Turn right at the next stoplight onto Loras Blvd.\n" +
		        "Travel four blocks and Loras College will be on your left.\n",
		        
		        "Traveling Hwy 52 North into Dubuque:",
		        
		        "Turn right onto Hwy 61/151 North and follow the directions for traveling Hwy 61/151 North into Dubuque.\n",
		        
		        "Traveling Hwy 52 South into Dubuque:",
		        
		        "Hwy 52 turns into Central Ave.\n" +
                "Turn right at 32nd St.\n" +
                "Travel about one mile and turn left onto Grandview Ave.\n" +
                "Follow Grandview Ave for about 3 miles continuing straight through 3 stop signs.\n" +
                "After crossing Clarke Dr, Grandview Ave curves to the left and then curves to the right at the top of the hill.\n" +
                "Turn left at the stoplight onto Loras Blvd.\n" +
                "Travel 4 blocks, and Loras College will be on your left.\n"
				),
		new State(
				"From Illinois",
				
				"Traveling Hwy 20 West:",
				
				"Cross the Mississippi River.\n" +
				"Continue on Hwy 20 West. Use the Grandview Ave exit.\n" +
				"Turn right onto Grandview Ave.\n" +
				"Travel through two stop signs.\n" + 
				"Turn right at the next stoplight onto Loras Blvd.\n" + 
				"Loras College will be on your left.\n",
				
				"Traveling I-80 West:",
				
				"Take Hwy 61 North to Dubuque.\n" +
		        "Take the Grandview Ave exit.\n" + 
		        "Travel approximately 14 blocks through two stoplights and two stop signs.\n" + 
		        "Turn right at the 3rd stoplight onto Loras Blvd.\n" +
		        "Travel four blocks, and Loras College will be on your left.\n",
		        
		        "",
		        "",
                "",
                ""
				),	
		new State(
				"From Minnesota",
				
				"Traveling Hwy 52 South:",
				
				"See directions under 'from Iowa'.\n",
				
				"Traveling Hwy I-35 South:",
				
				"Take I-35 South into Iowa.\n" +
		        "Take the Hwy 218 South exit.\n" + 
		        "Take the Hwy 20 East exit and follow directions for traveling Hwy 20 East into Dubuque.\n", 
		 
		        "",
		        "",
                "",
                ""
				),
		new State(
				"From Wisconsin",
				
				"Traveling Hwy 61/151 South:",
				
				"Cross the Mississippi River.\n" +
				"Take the Hwy 20 exit.\n" +
				"Turn right on Hwy 20 and use the Grandview Ave exit.\n" +
				"Turn right onto Grandview Ave at the stoplight.\n" +
				"Travel through two stop signs.\n" +
				"Turn right at the next stoplight onto Loras Blvd.\n" +
				"Loras College will be on your left.\n",
				
				"",
				
				"", 
		 
		        "",
		        "",
                "",
                ""
				)	
	};

}
