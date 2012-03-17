package edu.loras.AppsOfSteel;

import java.util.ArrayList;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

public class MyItemizedOverlay extends ItemizedOverlay<OverlayItem>  implements Locations
{
	private ArrayList<OverlayItem> mOverlays = new ArrayList<OverlayItem>();
	private Context mContext;
	private String[] subMenu = null;

	public MyItemizedOverlay(Drawable defaultMarker, Context context) 
	{
		super(boundCenterBottom(defaultMarker));
		mContext = context;
	}
	
	public void addOverlay(OverlayItem overlay) 
	{
	    mOverlays.add(overlay);
	    populate();
	}
	
	// Removes overlay item i
    public void removeItem(int i)
    {
        mOverlays.remove(i);
        populate();
    }
	
	// determines what happens when the user taps on an overlay item
	@Override
	protected boolean onTap(int index) 
	{
		final OverlayItem item = mOverlays.get(index);
			
		// sub menu 
		for(int i = 0; i < Locations.length; i++)
		{
			if(Locations[i].getLocationName().equals(item.getTitle()))
			{
				subMenu = new String[Locations[i].getSubmenu().length];
			}
		}
		for(int i = 0; i < Locations.length; i++)
		{
			if(Locations[i].getLocationName().equals(item.getTitle()))
			{
				for(int j = 0; j < subMenu.length; j++)
				{
					subMenu[j] = Locations[i].getSubmenu()[j];
				}
			}
		}
		
		// create alert dialog
		AlertDialog.Builder popup = new AlertDialog.Builder(mContext);
		popup.setTitle(item.getTitle());
		popup.setItems(subMenu, new DialogInterface.OnClickListener() 
		{
			public void onClick(DialogInterface dialog, int which) 
			{
				Intent myIntent = new Intent(mContext, LocationInfoActivity.class);
				Bundle b = new Bundle();
				if(subMenu.length > 1)
				{
					b.putString("locationName", subMenu[which]); // pass whatever item the user clicks on in the list
				}
				else
				{
					b.putString("locationName", item.getTitle());
				}
				myIntent.putExtras(b);
			    mContext.startActivity(myIntent);
			}
		});
		
		popup.setIcon(R.drawable.ic_launcher);		
		AlertDialog alert = popup.create();
		alert.show();
		return true;
	}

	@Override
	protected OverlayItem createItem(int i) 
	{
		return mOverlays.get(i);
	}

	@Override
	public int size() 
	{
		return mOverlays.size();
	}
}
