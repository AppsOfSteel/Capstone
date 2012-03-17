// http://stackoverflow.com/questions/2176397/drawing-a-line-path-on-google-maps

package edu.loras.AppsOfSteel;

import java.util.ArrayList;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.Projection;

import edu.loras.AppsOfSteel.TourLocations;

public class LinesTourOverlay extends Overlay implements TourLocations {
	
	private Projection projection;

	public LinesTourOverlay(Projection p) {
		// TODO Auto-generated constructor stub
		projection = p;
	}
	
	public void draw(Canvas canvas, MapView mapv, boolean shadow){
        super.draw(canvas, mapv, shadow);

        Paint   mPaint = new Paint();
        mPaint.setDither(true);
        mPaint.setColor(Color.argb(255, 255, 0, 255));
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setStrokeWidth(2);

        
        GeoPoint gP1;
        GeoPoint gP2;
        Point p1;
        Point p2;
        Path path;
        
        // Pre-condition: Need more than 1 tour location	
        for(int i = 1; i < tourLocations.length; i++) {
	        gP1 = tourLocations[i-1].getGeoPoint();
	        gP2 = tourLocations[i].getGeoPoint();
	
	        p1 = new Point();
	        p2 = new Point();
	        path = new Path();
	
	        projection.toPixels(gP1, p1);
	        projection.toPixels(gP2, p2);
	
	        path.moveTo(p2.x, p2.y);
	        path.lineTo(p1.x,p1.y);
	
	        canvas.drawPath(path, mPaint);
        }
        
        gP1 = tourLocations[tourLocations.length-1].getGeoPoint();
        gP2 = tourLocations[0].getGeoPoint();

        p1 = new Point();
        p2 = new Point();
        path = new Path();

        projection.toPixels(gP1, p1);
        projection.toPixels(gP2, p2);

        path.moveTo(p2.x, p2.y);
        path.lineTo(p1.x,p1.y);

        canvas.drawPath(path, mPaint);

    }


}
