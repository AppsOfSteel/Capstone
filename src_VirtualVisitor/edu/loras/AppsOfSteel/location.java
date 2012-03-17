package edu.loras.AppsOfSteel;

import com.google.android.maps.GeoPoint;

public class location 
{
	private String locationName;
	private GeoPoint geoPoint;
	private String description;
	private String category;
	private int image; 
	private String[] submenu;
	
	// get methods
	public String getLocationName()
	{
		return locationName;
	}
	public GeoPoint getGeoPoint()
	{
		return geoPoint;
	}
	public String getDescription()
	{
		return description;
	}
	public String getCategory()
	{
		return category;
	}
	public int getImage()
	{
		return image; 
	}

	public String[] getSubmenu()
	{
		return submenu; 
	}

	// constructor
	public location (String locationName, GeoPoint geoPoint, String description, String category, int image, String[] submenu)
	{
		this.locationName = locationName;
		this.geoPoint = geoPoint;
		this.description = description;
		this.category = category; 
		this.image = image;
		this.submenu = submenu; 
	}
}
