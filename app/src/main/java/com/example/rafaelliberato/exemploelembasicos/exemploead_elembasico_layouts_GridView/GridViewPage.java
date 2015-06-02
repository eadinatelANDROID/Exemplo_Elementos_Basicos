package com.example.rafaelliberato.exemploelembasicos.exemploead_elembasico_layouts_GridView;


import com.example.rafaelliberato.exemploead_elembasico.R;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import android.widget.AdapterView.OnItemClickListener;

public class GridViewPage extends Activity {

	private ImageView imgView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid_view);
		
		GridView gridImage = (GridView) findViewById(R.id.gridImageView);
		imgView = (ImageView)  findViewById(R.id.imgPrincipal);
		
			
		 gridImage.setAdapter(new ImageAdapter(this));

		gridImage.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView parent, View v, int posicao,long id) {
				Toast.makeText(getBaseContext(),"Imagem selecionada: " + posicao, Toast.LENGTH_SHORT).show();
				
				
				  ImageAdapter imageAdapter = new ImageAdapter(getBaseContext());
				  
			       // ImageView imageView = (ImageView) findViewById(R.id.image_view);
			        imgView.setImageResource(imageAdapter.mThumbIds[posicao]);
				
			
			}
		});
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
