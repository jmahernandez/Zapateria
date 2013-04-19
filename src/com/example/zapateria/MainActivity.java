package com.example.zapateria;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
	int contador;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		contador = 0;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void BtnAceptar(View view) {
		EditText txtUsuario = (EditText) this.findViewById(R.id.usuario);
		EditText txtPassword = (EditText) this.findViewById(R.id.password);
		
		String usuario = txtUsuario.getText().toString();
		String password = txtPassword.getText().toString();
		
		if(usuario.equals("miguel") && password.equals("angel")) {
			Intent intent = new Intent(this, MenuZapateria.class);
			startActivity(intent);
		} else {
			if(contador < 3) {
				Toast.makeText(this, "Usuario o Contraseña Incorrectos", Toast.LENGTH_SHORT).show();
				
				contador++;
			} else {
				finish();
			}
			
		}
	}
	
	public void Salir(View view) {
		finish();
	}

}
