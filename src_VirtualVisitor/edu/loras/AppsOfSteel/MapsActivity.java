package edu.loras.AppsOfSteel;

import java.util.List;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class MapsActivity extends MapActivity implements Locations
{	
	private MapView mapView;
	private MapController mapController;
	private List<Overlay> mapOverlays;
	MyItemizedOverlay eatOverlay, sleepOverlay, studyOverlay, havefunOverlay;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
    	// standard
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); // remove the title bar
        setContentView(R.layout.maps);          	
        
        // create a map view
        mapView = (MapView) findViewById(R.id.mapview);
        mapView.setBuiltInZoomControls(true);
        mapOverlays = mapView.getOverlays();
        mapView.setSatellite(true);  
        
        // create a map controller
        mapController = mapView.getController();
        
        if(savedInstanceState != null) {
        	int latitude = savedInstanceState.getInt("latitude");
        	int longitude = savedInstanceState.getInt("longitude");
        	mapController.animateTo(new GeoPoint(latitude, longitude));
            mapController.setZoom(20); // the larger the number, the closer the zoom
        }
        else {
        mapController.animateTo(new GeoPoint(42503360, -90678190));
        mapController.setZoom(17); // the larger the number, the closer the zoom
        }
        
        // define overlays
        eatOverlay = new MyItemizedOverlay(this.getResources().getDrawable(R.drawable.eat), this);
        sleepOverlay = new MyItemizedOverlay(this.getResources().getDrawable(R.drawable.sleep), this);
        studyOverlay = new MyItemizedOverlay(this.getResources().getDrawable(R.drawable.study), this);
        havefunOverlay = new MyItemizedOverlay(this.getResources().getDrawable(R.drawable.havefun), this);

        // add overlays
        for(int i = 0; i < Locations.length; i++)
        {
        	if(Locations[i].getCategory().equals("eat"))
        	{
        		eatOverlay.addOverlay(new OverlayItem(Locations[i].getGeoPoint(), Locations[i].getLocationName(), Locations[i].getDescription()));
        	}
        	if(Locations[i].getCategory().equals("sleep"))
        	{
        		sleepOverlay.addOverlay(new OverlayItem(Locations[i].getGeoPoint(), Locations[i].getLocationName(), Locations[i].getDescription()));
        	}
        	if(Locations[i].getCategory().equals("study"))
        	{
        		studyOverlay.addOverlay(new OverlayItem(Locations[i].getGeoPoint(), Locations[i].getLocationName(), Locations[i].getDescription()));

        	}
        	if(Locations[i].getCategory().equals("havefun"))
        	{
        		havefunOverlay.addOverlay(new OverlayItem(Locations[i].getGeoPoint(), Locations[i].getLocationName(), Locations[i].getDescription()));
        	}
        }    
  		mapOverlays.add(eatOverlay);
  		mapOverlays.add(sleepOverlay);
        mapOverlays.add(studyOverlay);
        mapOverlays.add(havefunOverlay);
    }
    
    @Override
    protected boolean isRouteDisplayed() 
    {
        return false;
    }
    
    // get the menu layout from the xml file
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.maps_menu, menu);
        
        /*
        SubMenu subMenu = menu.addSubMenu("Buildings");
        for(int i = 0; i < 15; i++)
        {
        	subMenu.add(buildings[i].getBuildingName());
        }
        */
        
        return true;
    }
    
    // preserve the checkbox
    @Override
    public boolean onOptionsItemSelected(MenuItem item) 
    {
        mapView.postInvalidate();

        switch (item.getItemId()) 
        {
            case R.id.eat:
                if (item.isChecked())
                {
                	item.setChecked(false);
                	mapOverlays.remove(eatOverlay);
                }
                else
                {
                	item.setChecked(true);
                	mapOverlays.add(eatOverlay);
                }
                return true;
            case R.id.sleep:
                if (item.isChecked())
                {
                	item.setChecked(false);
                	mapOverlays.remove(sleepOverlay);

                }
                else
                {
                	item.setChecked(true);
                	mapOverlays.add(sleepOverlay);

                }
                return true;
            case R.id.study:
                if (item.isChecked())
                {
                	item.setChecked(false);
                	mapOverlays.remove(studyOverlay);

                }
                else
                {
                	item.setChecked(true);
                	mapOverlays.add(studyOverlay);

                }
                return true;
            case R.id.havefun:
                if (item.isChecked())
                {
                	item.setChecked(false);
                	mapOverlays.remove(havefunOverlay);

                }
                else
                {
                	item.setChecked(true);
                	mapOverlays.add(havefunOverlay);

                }
                return true;
                
             /*    
            case R.id.layers:
            	final CharSequence[] items = {"Eat", "Sleep", "Study", "Have Fun"};

            	AlertDialog.Builder builder = new AlertDialog.Builder(this);
            	builder.setTitle("Layers2");
            	final boolean[] checked = new boolean[4];
            	Arrays.fill(checked, true);
            	builder.setMultiChoiceItems(items, checked, new DialogInterface.OnMultiChoiceClickListener() 
            	{
            	    public void onClick(DialogInterface dialog, int which, boolean isChecked) 
            	    {
        
            	    }
            	});
            	
            	builder.setNeutralButton("Exit", new DialogInterface.OnClickListener() 
            	{
                    public void onClick(DialogInterface dialog, int id) 
                    {

                    }
                });
            	
            	AlertDialog alert = builder.create();
            	alert.show();
            	return true;
            	
            	/*
            case R.id.map2:
            	final CharSequence[] items2 = {"Red", "Green", "Blue"};

            	AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            	builder2.setTitle("Pick a color");
            	builder2.setSingleChoiceItems(items2, -1, new DialogInterface.OnClickListener() {
            	    public void onClick(DialogInterface dialog, int item) {
            	        Toast.makeText(getApplicationContext(), items2[item], Toast.LENGTH_SHORT).show();
            	    }
            	});
            	AlertDialog alert2 = builder2.create();
            	alert2.show();
            
                return true;
                */
               
                
            case R.id.buildings:
            	final String[] buildingNames = new String[Locations.length];		
            	
            	for(int i = 0; i < Locations.length; i++)
            	{
            		buildingNames[i] = Locations[i].getLocationName();
            	}

         
            	AlertDialog.Builder builder = new AlertDialog.Builder(this);
            	builder.setTitle("Locations");
            	builder.setItems(buildingNames, new DialogInterface.OnClickListener() {
            	    public void onClick(DialogInterface dialog, int item) {
            	    	mapController.animateTo(Locations[item].getGeoPoint());
            	    	mapController.setZoom(20);
            	    }
            	});
            	AlertDialog alert = builder.create();
            	alert.show();
        		return true; 
        		
                            	
            default:
                return super.onOptionsItemSelected(item);
        }
        
    }
    @Override
    protected void onSaveInstanceState(Bundle b) {
    	  GeoPoint currentPoint = mapView.getMapCenter();
    	  int latitude = currentPoint.getLatitudeE6();
    	  int longitude = currentPoint.getLongitudeE6();
    	  b.putInt("latitude", latitude);
    	  b.putInt("longitude", longitude);
    	  super.onSaveInstanceState(b);
    }
}