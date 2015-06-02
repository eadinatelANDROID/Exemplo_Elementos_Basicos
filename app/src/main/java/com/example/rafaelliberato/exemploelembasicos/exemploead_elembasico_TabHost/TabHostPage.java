package com.example.rafaelliberato.exemploelembasicos.exemploead_elembasico_TabHost;


import com.example.rafaelliberato.exemploead_elembasico.R;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class TabHostPage extends TabActivity {
	TabHost tabHostView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_tab_host_page);
			
			tabHostView =(TabHost)findViewById(android.R.id.tabhost);

		
		
	TabHost.TabSpec specs = tabHostView.newTabSpec("Tab1"); 
		specs.setIndicator("MOBILE");
		specs.setContent(new Intent(this, Mobile.class));
		tabHostView.addTab(specs);
		 

		specs = tabHostView.newTabSpec("Tab2");
		specs.setIndicator("CONFIGURAÇÕES").setContent(new Intent(this, Settings.class));
		tabHostView.addTab(specs);
		    
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
