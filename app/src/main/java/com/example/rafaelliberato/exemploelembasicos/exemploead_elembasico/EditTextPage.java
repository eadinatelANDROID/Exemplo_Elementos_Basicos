package com.example.rafaelliberato.exemploelembasicos.exemploead_elembasico;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.rafaelliberato.exemploead_elembasico.R;

public class EditTextPage extends Activity {

	private EditText txtValor1,txtValor2, txtResultado;
	private Button btnSomar,btnSubtrair,btnMultiplicar, btnDividir;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_text_page);
	
	    //Vinculação dos elementos
		txtValor1 = (EditText) findViewById(R.id.txtValor1);
		txtValor2 = (EditText) findViewById(R.id.txtValor2);
		txtResultado = (EditText) findViewById(R.id.txtResultado);
		
		btnSomar = (Button) findViewById(R.id.btnSomar);
		btnSubtrair = (Button) findViewById(R.id.btnSubtrair);
		btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
		btnDividir = (Button) findViewById(R.id.btnDividir);
	
		//Operação SOMA
		btnSomar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				//CHAMA Função SOMA
				Somar();
		  }
		});
		
		
		//Operação Subtrair
		btnSubtrair.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Subtrair();
			}
		});
		
		//Operação Multiplicar
		btnMultiplicar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Multiplicar();
			}
		});
		
		btnDividir.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Dividir();
				
			}
		});
		
		
	
	}



	protected void Dividir() {
		// TODO Auto-generated method stub
		double valor1 = Double.parseDouble(txtValor1.getText().toString());
		double valor2 = Double.parseDouble(txtValor2.getText().toString());
		double resultado = valor1 / valor2;
					
		txtResultado.setText(String.valueOf(resultado));
	}



	protected void Somar() {
		
		double valor1 = Double.parseDouble(txtValor1.getText().toString());
		double valor2 = Double.parseDouble(txtValor2.getText().toString());
		double resultado = valor1 + valor2;
					
		txtResultado.setText(String.valueOf(resultado));
	}
	
	protected void Subtrair() {
		// TODO Auto-generated method stub
		double valor1 = Double.parseDouble(txtValor1.getText().toString());
		double valor2 = Double.parseDouble(txtValor2.getText().toString());
		double resultado = valor1 - valor2;
					
		txtResultado.setText(String.valueOf(resultado));
	
	}
	
	protected void Multiplicar() {
		// TODO Auto-generated method stub
		double valor1 = Double.parseDouble(txtValor1.getText().toString());
		double valor2 = Double.parseDouble(txtValor2.getText().toString());
		double resultado = valor1 * valor2;
					
		txtResultado.setText(String.valueOf(resultado));
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
