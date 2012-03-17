// Link to icons for map circles: http://www.easyvectors.com/tags/Circle

package edu.loras.AppsOfSteel;

import java.util.List;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;
import com.google.android.maps.Projection;
/*
import edu.loras.AppsOfSteel.LinesTourOverlay;
import edu.loras.AppsOfSteel.TourLocations;
*/
public class TourActivity extends MapActivity implements TourLocations
{	
	private MapView mapView;
	private MapController mapController;
	private List<Overlay> mapOverlays;
	private TourOverlay myOverlay;
	private Projection projection;
	private ImageButton leftArrow;
	private ImageButton rightArrow;
	private location currentTourLocation;
	private int currentTourLocationIndex;
	private TextView tourNavBarText;
	
	private TourOverlay currentLocationOverlay;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
    	// standard
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); // remove the title bar
        setContentView(R.layout.tour);
        
        // Get handles on left and right arrow buttons in nav bar
        leftArrow = (ImageButton) findViewById(R.id.leftArrow);
        rightArrow = (ImageButton) findViewById(R.id.rightArrow);
        
        // Get handle on the tour navigation bar text
        tourNavBarText = (TextView) findViewById(R.id.tourNavBar);
        
        // create a map view
        mapView = (MapView) findViewById(R.id.mapview);
        mapView.setBuiltInZoomControls(true);
        mapOverlays = mapView.getOverlays();
        mapView.setSatellite(true);  
        
        // create a map controller
        mapController = mapView.getController();
        //mapController.animateTo(new GeoPoint(42503360, -90678190));
        //mapController.setZoom(17); // the larger the number, the closer the zoom
        
        // Initialize current tour location, current location text, and current tour location 
        // zoom extent
        if(savedInstanceState != null) {
        	currentTourLocationIndex = savedInstanceState.getInt("currentTourLocationIndex");
        }
        else {
        	currentTourLocationIndex = 0;
        }
        
        currentTourLocation = tourLocations[currentTourLocationIndex];
        tourNavBarText.setText(currentTourLocation.getLocationName());
        mapController.animateTo(currentTourLocation.getGeoPoint());
    	mapController.setZoom(20);

        // Set up overlay for regular location markers
        myOverlay = new TourOverlay(this.getResources().getDrawable(R.drawable.circle_yellow), this, this);
        /*for(int i = 0; i < overlayItems.length; i++)
        {
        	myOverlay.addOverlay(overlayItems[i]);
        }*/
        for(int i = 0; i < tourLocations.length; i++) {
        	myOverlay.addOverlay(new OverlayItem(tourLocations[i].getGeoPoint(), tourLocations[i].getLocationName(), tourLocations[i].getDescription()));
        }
        
        // Set up overlay for current location marker
    	currentLocationOverlay = new TourOverlay(this.getResources().getDrawable(R.drawable.circle_red), this, this);
    	currentLocationOverlay.addOverlay(new OverlayItem(currentTourLocation.getGeoPoint(), currentTourLocation.getLocationName(), currentTourLocation.getDescription()));
        
        // Set up and add overlay for lines connecting locations
        projection = mapView.getProjection();
        mapOverlays.add(new LinesTourOverlay(projection));
        
        // Add overlay for tour locations
        mapOverlays.add(myOverlay);
         
        // Add overlay for current tour location
        mapOverlays.add(currentLocationOverlay);

    }
    
    @Override
    protected boolean isRouteDisplayed() 
    {
        return false;
    }
    
    public void onClick(View v) {
    	if(v.getId() == leftArrow.getId()) {
    		
    		if(currentTourLocationIndex > 0) {
    			currentTourLocationIndex--;
    		}
    		else if(currentTourLocationIndex == 0) {
    			currentTourLocationIndex = tourLocations.length - 1;
    		}
    		
    	}
    	else if(v.getId() == rightArrow.getId()) {
    		
    		if(currentTourLocationIndex < tourLocations.length - 1) {
    			currentTourLocationIndex++;
    		}
    		else if(currentTourLocationIndex == tourLocations.length - 1) {
    			currentTourLocationIndex = 0;
    		}

    	}
    	
    	currentTourLocation = tourLocations[currentTourLocationIndex];
		
		tourNavBarText.setText(currentTourLocation.getLocationName());
		
		mapOverlays.remove(currentLocationOverlay);
		
		// Set up overlay for current location marker
    	currentLocationOverlay = new TourOverlay(this.getResources().getDrawable(R.drawable.circle_red), this, this);
    	currentLocationOverlay.addOverlay(new OverlayItem(currentTourLocation.getGeoPoint(), currentTourLocation.getLocationName(), currentTourLocation.getDescription()));
    	
    	// Add overlay for current tour location
        mapOverlays.add(currentLocationOverlay);
        
		mapController.animateTo(currentTourLocation.getGeoPoint());
    	mapController.setZoom(20);
		
		//Log.v("location", currentTourLocation.getLocationName());
    }
    
    public location getCurrentTourLocation() {
    	return currentTourLocation;
    }
    
    @Override
    protected void onSaveInstanceState(Bundle b) {
    	  b.putInt("currentTourLocationIndex", currentTourLocationIndex);
    	  super.onSaveInstanceState(b);
    }

}