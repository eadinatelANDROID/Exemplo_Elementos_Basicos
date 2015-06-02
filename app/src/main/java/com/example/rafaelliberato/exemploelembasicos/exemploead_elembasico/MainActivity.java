package com.example.rafaelliberato.exemploelembasicos.exemploead_elembasico;



import com.example.rafaelliberato.exemploead_elembasico.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {

	private final String[] listItems = new String[]{"EditText","Image","CheckBox","Layout", "Button", };   
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final ListView lbxElementos = (ListView)findViewById(R.id.lbxElementos);
        
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listItems);
        lbxElementos.setAdapter(myAdapter);
        
        lbxElementos.setOnItemClickListener(new OnItemClickListener() {
        	@Override 
        	public void onItemClick(AdapterView<?> customerAdapter, View footer, int selectedInt, long selectedLong)
             { 
        		String  listChoose = (String) (lbxElementos.getItemAtPosition(selectedInt));
        	
        		listChoose = listChoose+"Page";

        
        		Pages page = Pages.valueOf(listChoose);
        		Intent intent = new Intent(); 
        				
        		        		
        		switch(page) {
        		    case ImagePage:
        		    	intent.setClass(getBaseContext(), ImagePage.class);
       		        break;
        		    case EditTextPage:
        		      	intent.setClass(getBaseContext(), EditTextPage.class);
        		        break;
        		    case CheckBoxPage:
        		      	intent.setClass(getBaseContext(), CheckBoxPage.class);
        		        break;
        		    case LayoutPage:
        		      	intent.setClass(getBaseContext(), LayoutPage.class);
        		        break;
        		    case ButtonPage:
        		      	intent.setClass(getBaseContext(), ButtonPage.class);
        		        break;
        	       		          		 
        		}
        		
        		startActivity(intent);
        	 	       		
             }

		
        });
        
       
    }
	private enum Pages {
	    ImagePage, EditTextPage, CheckBoxPage, LayoutPage, ButtonPage, TabHostPage;
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
