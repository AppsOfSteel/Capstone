package edu.loras.AppsofSteel;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;
 
public class GalleryExample extends Activity {
	Context context;
	
	String[] myRemoteImages = {
			"http://farm4.static.flickr.com/3145/2997621641_112bb4454b.jpg",
			"http://www.iowamavs.com/mrc/loras.jpg",
			"http://www.loras.edu/images/page/rock_bowl2.jpg",
			"http://0.tqn.com/d/collegeapps/1/0/e/O/-/-/loras-college-Mike-Willis-flickr.jpg",
			"http://www.cecinfo.com/uploadedImages/Project_Profiles/LORAS_COLLEGE_D1_097-reduced.jpg",
			"http://upload.wikimedia.org/wikipedia/commons/0/06/Dubuque_IA_-_view_from_Loras_College.jpg"
	};
	Bitmap [] objects = new Bitmap [myRemoteImages.length];
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.photo);
		context = getApplicationContext();
		Gallery gallery = (Gallery) findViewById(R.id.Gallery01);
		gallery.setSpacing(1);
		gallery.setAdapter(new ExampleAdapter(this.context));
		gallery.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> arg0, View v, int arg2,
					long arg3) {
				
				ImageView fullView = (ImageView) findViewById(R.id.fullView);
				fullView.setImageBitmap(objects[arg2]);
				

			}

		});

	}

	private class ExampleAdapter extends BaseAdapter {
		private Context myContext;


		public View getView(int position, View convertView, 
				ViewGroup parent) {
			
			ImageView imView = null;
			try {
				/* Open a new URL and get the InputStream to load data from it. */
				imView = new ImageView(this.myContext);
				URL aURL = new URL(myRemoteImages[position]);
				URLConnection conn = aURL.openConnection();
				conn.connect();
				InputStream is = conn.getInputStream();
				/* Buffered is always good for a performance plus. */
				BufferedInputStream bis = new BufferedInputStream(is);
				/* Decode url-data to a bitmap. */
				Bitmap bm = BitmapFactory.decodeStream(bis);
				bis.close();
				is.close();
				/* Apply the Bitmap to the ImageView that will be returned. */
				imView.setImageBitmap(bm);
				objects[position]=bm;
				
			} catch (IOException e) {
				//i.setImageResource(R.drawable.error);
				Log.e("DEBUGTAG", "Remote Image Exception", e);
			}


			return imView;
		}


		/** URL-Strings to some remote images. */


		/** Simple Constructor saving the 'parent' context. */
		public ExampleAdapter(Context c) { this.myContext = c; }

		/** Returns the amount of images we have defined. */
		public int getCount() { return myRemoteImages.length; }

		/* Use the array-Positions as unique IDs */
		public Object getItem(int position) { return position; }
		public long getItemId(int position) { return position; }

	}
}