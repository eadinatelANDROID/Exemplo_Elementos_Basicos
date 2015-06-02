package com.example.rafaelliberato.exemploelembasicos.exemploead_elembasico;



import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.rafaelliberato.exemploead_elembasico.R;
import com.example.rafaelliberato.exemploelembasicos.exemploead_elembasico_TabHost.TabHostPage;
import com.example.rafaelliberato.exemploelembasicos.exemploead_elembasico_layouts.LinearLayoutHorizontal;
import com.example.rafaelliberato.exemploelembasicos.exemploead_elembasico_layouts.LinearLayoutVertical;
import com.example.rafaelliberato.exemploelembasicos.exemploead_elembasico_layouts.RelativeLayout;
import com.example.rafaelliberato.exemploelembasicos.exemploead_elembasico_layouts_GridView.GridViewPage;

public class LayoutPage extends ListActivity {



	private final String[] listItems = new String[]{"Linear Layout Horizontal",
			"Linear Layout Vertical",
			"Relative Layout",
			"TabHost",
			"GridView", };   
	
	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);

		
		ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listItems);
    
		
		this.setListAdapter(myAdapter);

	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
		switch (position) {
		case 0:
	    	startActivity(new Intent(this,LinearLayoutHorizontal.class));
			break;
		case 1:
	    	startActivity(new Intent(this,LinearLayoutVertical.class));
			break;
		case 2:
	    	startActivity(new Intent(this,RelativeLayout.class));
			break;
		case 3:
	    	startActivity(new Intent(this,TabHostPage.class));
			break;
		case 4:
	    	startActivity(new Intent(this,GridViewPage.class));
			break;
	   		
		}
		
		
		
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
