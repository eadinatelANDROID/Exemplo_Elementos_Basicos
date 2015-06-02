package com.example.rafaelliberato.exemploelembasicos.exemploead_elembasico;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.rafaelliberato.exemploead_elembasico.R;

public class CheckBoxPage extends Activity {

	private CheckBox cbkSOM;
	private CheckBox cbkGPS;
	private CheckBox cbkEmail;
	private Button btnVerifica;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_check_box_page);
		
		cbkSOM = (CheckBox) findViewById(R.id.cbkSOM);
		cbkGPS = (CheckBox) findViewById(R.id.cbkGPS);
		cbkEmail = (CheckBox) findViewById(R.id.cbkEmail);
		btnVerifica = (Button) findViewById(R.id.btnVerifica);
		
			
		btnVerifica.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				String itens = "***CheckBox Selecionado***\n";
				
				if(cbkEmail.isChecked())
					itens = itens + "CheckBox Email \n";
				if(cbkGPS.isChecked())
					itens= itens +"CheckBox GPS \n";
				if(cbkSOM.isChecked())
					itens= itens +"CheckBox Som \n";
				
				
					
			
				
			  openDialog(itens);
			}
		});
	}
	
	
	
	public void openDialog(String msg){
	      AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
	      alertDialogBuilder.setTitle("Exemplo CheckBox");
	      alertDialogBuilder.setMessage(msg);
	   
	      alertDialogBuilder.setPositiveButton("OK", 
	      new DialogInterface.OnClickListener() {
			
	         @Override
	         public void onClick(DialogInterface arg0, int arg1) {
	        	 
				
	         }
	      });
	      
		    
	      AlertDialog alertDialog = alertDialogBuilder.create();
	      alertDialog.show();
		    
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
