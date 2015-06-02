package com.example.rafaelliberato.exemploelembasicos.exemploead_elembasico_layouts_GridView;

import com.example.rafaelliberato.exemploead_elembasico.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
//
// A Classe ImageAdapter, serve como auxiliar na criação dos objetos(View) que ficarão no GRID. 
//
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
 
    // Mantém todas as imagens em um array, armazenando suas referências.
    public Integer[] mThumbIds = {
    	
            R.drawable.image_1, R.drawable.image_2,
            R.drawable.image_3, R.drawable.image_4,
            R.drawable.image_5, R.drawable.image_6,
      
    };
 
    // Constructor
    public ImageAdapter(Context c){
        mContext = c;
    }
 
    @Override
    public int getCount() {
        return mThumbIds.length;
    }
 
    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }
 
    @Override
    public long getItemId(int position) {
        return 0;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(100,100));
        return imageView;
    }
 
}