package edu.loras.AppsOfSteel;


import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

 
public class GalleryView extends Activity {
    /** Called when the activity is first created. */

    ImageView imView;
	String [] imageUrl={ "http://farm4.static.flickr.com/3145/2997621641_112bb4454b.jpg",
            "http://www.iowamavs.com/mrc/loras.jpg",
            "http://farm4.static.flickr.com/3145/2997621641_112bb4454b.jpg",
            "http://upload.wikimedia.org/wikipedia/commons/0/06/Dubuque_IA_-_view_from_Loras_College.jpg"};
	Bitmap [] array = new Bitmap [imageUrl.length];
	
    public void onCreate(Bundle icicle) {
        for(int i=0; i<imageUrl.length;i++)
    	{
    		downloadFile(imageUrl[i], i);
    		Log.i("im url",imageUrl+"png"+i+".png");
    	}
    	super.onCreate(icicle);
        setContentView(R.layout.photo);
        Context context = getApplicationContext();
        /* Find the gallery defined in the main.xml
         * Apply a new (custom) ImageAdapter to it. */
        Gallery gallery = (Gallery)findViewById(R.id.Gallery01);
        

        gallery.setAdapter(new ImageAdapter(context));
        imView = (ImageView)findViewById(R.id.imview);
    	
    	
    	gallery.setOnItemClickListener(new OnItemClickListener(){

			public void onItemClick(AdapterView<?> arg0, View v, int arg2,
					long arg3) {
				
				
				imView.setImageBitmap(array[arg2]);
				

			}

		});

    }
Bitmap bmImg;
void downloadFile(String fileUrl, int i){
	URL myFileUrl =null; 
	try {
		myFileUrl= new URL(fileUrl);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		HttpURLConnection conn= (HttpURLConnection)myFileUrl.openConnection();
		conn.setDoInput(true);
		conn.connect();		
		InputStream is = conn.getInputStream();
		bmImg = BitmapFactory.decodeStream(is);

		array[i]=Bitmap.createBitmap(bmImg);		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
private class ImageAdapter extends BaseAdapter {
	private Context myContext;


	public View getView(int position, View convertView, 
			ViewGroup parent) {
		
		ImageView imView = null;
		imView = new ImageView(this.myContext);
		imView.setImageBitmap(array[position]);


		return imView;
	}





	// Simple Constructor saving the 'parent' context. 
	public ImageAdapter(Context c) { this.myContext = c; }

	// Returns the amount of images we have defined.
	public int getCount() { return imageUrl.length; }

	// Use the array-Positions as unique IDs 
	public Object getItem(int position) { return position; }
	public long getItemId(int position) { return position; }

}
}


