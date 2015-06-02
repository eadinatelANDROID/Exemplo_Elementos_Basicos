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
import android.widget.TextView;
import android.widget.Toast;

import com.example.rafaelliberato.exemploead_elembasico.R;

public class ButtonPage extends Activity {

	private Button btnToastMessage;
	private Button btnAlertMessage;
	private Button btnLogMessage;
	private static final String CATEGORIA = "LOG_NAME";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_button_page);
		
		//Vincula��o dos elementos do c�digo Java com o XML (VIEW)
		btnToastMessage =(Button)findViewById(R.id.btnToastMessage);
		btnAlertMessage = (Button) findViewById(R.id.btnAlertMessage);
		btnLogMessage = (Button) findViewById(R.id.btnLogMessage);
		
		//Bot�o Mensagem Toast Clicado
		btnToastMessage.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
	
			Toast.makeText(getApplicationContext(), "Esta � uma mensagem Toast", Toast.LENGTH_LONG).show();
				
			}
		});
		
		//Bot�o Mensagem AlertDialog Clicado
		btnAlertMessage.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			   openDialog();
		    	}
		});
			
		//Bot�o Mensagem Log Clicado
		btnLogMessage.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getBaseContext(), "Veja a mensagem de log na janela de LogCat!", Toast.LENGTH_LONG).show();
				Log.i(CATEGORIA, "Esta � uma mensagem de LOG, voc� pode utiliz�-la para se orientar durante as codifica��es.");	
		   }
		});
		
	}

	//M�todo de Cria��o do AlertDialog
	protected void openDialog() {
		// TODO Auto-generated method stub
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
	      alertDialogBuilder.setTitle("Exemplo Button");
	      alertDialogBuilder.setMessage("Esta mensagem � um Dialogo de Alerta, conhecido por AlertDialog.");
	   
	      alertDialogBuilder.setPositiveButton("OK", 
	      new DialogInterface.OnClickListener() {
			
	         @Override
	         public void onClick(DialogInterface arg0, int arg1) {
	        	 //CASO TENHA CLICADO EM OK, ser� executado este evento de click
				
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
