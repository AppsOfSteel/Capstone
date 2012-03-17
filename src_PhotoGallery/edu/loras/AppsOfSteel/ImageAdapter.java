package edu.loras.AppsOfSteel;


import android.content.Context;

import android.view.View;

import android.view.ViewGroup;

import android.widget.BaseAdapter;

import android.widget.Gallery;

import android.widget.ImageView;

import android.widget.ImageView.ScaleType;

public class ImageAdapter extends BaseAdapter{

	private Context _context = null;

	private final int[] imageIds = { R.drawable.sample_0, R.drawable.sample_1,
			R.drawable.sample_2,R.drawable.sample_3,R.drawable.sample_4,R.drawable.sample_5,R.drawable.sample_6};

	public ImageAdapter(Context context)

	{

		this._context = context;

	}

	public int getCount()

	{

		return imageIds.length;

	}

	public Object getItem(int index)

	{

		return imageIds[index];

	}

	public long getItemId(int index)

	{

		return index;

	}

	public View getView(int postion, View view, ViewGroup group)

	{

		ImageView imageView = new ImageView(_context);

		imageView.setImageResource(imageIds[postion]);

		imageView.setScaleType(ScaleType.FIT_XY);

		imageView.setLayoutParams(new Gallery.LayoutParams(0, 0));

		return imageView;

	}

}
