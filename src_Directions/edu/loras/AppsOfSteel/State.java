package edu.loras.AppsOfSteel;

public class State 
{
	private String stateName, title1, description1, title2, description2, title3, description3, title4, description4;
	
	public String getStateName()
	{
		return stateName;
	}
	
	public String getTitle1()
	{
		return title1;
	}
	
	public String getDescription1()
	{
		return description1;
	}
	
	public String getTitle2()
	{
		return title2;
	}
	
	public String getDescription2()
	{
		return description2;
	}
	
	public String getTitle3()
	{
		return title3;
	}
	
	public String getDescription3()
	{
		return description3;
	}
	
	public String getTitle4()
	{
		return title4;
	}
	
	public String getDescription4()
	{
		return description4;
	}
	
	public State (String sn, String t1, String d1, String t2, String d2, String t3, String d3, String t4, String d4)
	{
		stateName = sn;
		title1 = t1;
		description1 = d1;
		title2 = t2;
		description2 = d2;
		title3 = t3;
		description3 = d3;
		title4 = t4;
		description4 = d4;	
	}

}
