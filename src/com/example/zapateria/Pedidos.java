package com.example.zapateria;

import java.text.DecimalFormat;

import com.example.zapateria.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.os.Build;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pedidos extends Activity {
	
	EditText modelo01;
	EditText cantidad01;
	EditText importe01;
	
	EditText modelo02;
	EditText cantidad02;
	EditText importe02;
	
	EditText modelo03;
	EditText cantidad03;
	EditText importe03;
	
	EditText modelo04;
	EditText cantidad04;
	EditText importe04;
	
	EditText totalGeneral;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pedidos);

		totalGeneral = (EditText) findViewById(R.id.editText13);
		totalGeneral.setText("0.00");
		
		importe01 = (EditText) findViewById(R.id.editText3);
		importe02 = (EditText) findViewById(R.id.editText6);
		importe03 = (EditText) findViewById(R.id.editText9);
		importe04 = (EditText) findViewById(R.id.editText12);

		importe01.setOnFocusChangeListener(new OnFocusChangeListener() {          
			public void onFocusChange(View v, boolean hasFocus) {
				if(!hasFocus) {
					cantidad01 = (EditText) findViewById(R.id.editText2);
					importe01 = (EditText) findViewById(R.id.editText3);
					
					try {
						Integer cantidad = Integer.parseInt(cantidad01.getText().toString());
						Double importe = Double.parseDouble(importe01.getText().toString());
						Double total = Double.parseDouble(totalGeneral.getText().toString());
		    	
						Double result = cantidad * importe;
		    	
						total = total + result;
		    	
						DecimalFormat twoDForm = new DecimalFormat("0.00");
		    	
						String res = twoDForm.format(total);
		    	
						totalGeneral.setText(res);
					} catch (NumberFormatException e) {
						Toast.makeText(getApplicationContext(),e.toString(), Toast.LENGTH_SHORT).show();
					}
				}
			}
		});
		
		importe02.setOnFocusChangeListener(new OnFocusChangeListener() {          
			public void onFocusChange(View v, boolean hasFocus) {
				if(!hasFocus) {
					cantidad02 = (EditText) findViewById(R.id.editText5);
					importe02 = (EditText) findViewById(R.id.editText6);
					
					try {
						Integer cantidad = Integer.parseInt(cantidad02.getText().toString());
						Double importe = Double.parseDouble(importe02.getText().toString());
						Double total = Double.parseDouble(totalGeneral.getText().toString());
		    	
						Double result = cantidad * importe;
		    	
						total = total + result;
		    	
						DecimalFormat twoDForm = new DecimalFormat("0.00");
		    	
						String res = twoDForm.format(total);
		    	
						totalGeneral.setText(res);
					} catch (NumberFormatException e) {
						Toast.makeText(getApplicationContext(),e.toString(), Toast.LENGTH_SHORT).show();
					}
				}
			}
		});
		
		importe03.setOnFocusChangeListener(new OnFocusChangeListener() {          
			public void onFocusChange(View v, boolean hasFocus) {
				if(!hasFocus) {
					cantidad03 = (EditText) findViewById(R.id.editText8);
					importe03 = (EditText) findViewById(R.id.editText9);
					
					try {
						Integer cantidad = Integer.parseInt(cantidad03.getText().toString());
						Double importe = Double.parseDouble(importe03.getText().toString());
						Double total = Double.parseDouble(totalGeneral.getText().toString());
		    	
						Double result = cantidad * importe;
		    	
						total = total + result;
		    	
						DecimalFormat twoDForm = new DecimalFormat("0.00");
		    	
						String res = twoDForm.format(total);
		    	
						totalGeneral.setText(res);
					} catch (NumberFormatException e) {
						Toast.makeText(getApplicationContext(),e.toString(), Toast.LENGTH_SHORT).show();
					}
				}
			}
		});
		
		importe04.setOnFocusChangeListener(new OnFocusChangeListener() {          
			public void onFocusChange(View v, boolean hasFocus) {
				if(!hasFocus) {
					cantidad04 = (EditText) findViewById(R.id.editText11);
					importe04 = (EditText) findViewById(R.id.editText12);
					
					try {
						Integer cantidad = Integer.parseInt(cantidad04.getText().toString());
						Double importe = Double.parseDouble(importe04.getText().toString());
						Double total = Double.parseDouble(totalGeneral.getText().toString());
		    	
						Double result = cantidad * importe;
		    	
						total = total + result;
						
						DecimalFormat twoDForm = new DecimalFormat("0.00");
		    	
						String res = twoDForm.format(total);
		    	
						totalGeneral.setText(res);
					} catch (NumberFormatException e) {
						Toast.makeText(getApplicationContext(),e.toString(), Toast.LENGTH_SHORT).show();
					}
				}
			}
		});
		
		// Show the Up button in the action bar.
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pedidos, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void Solicitar(View view) {
		try {
			modelo01 = (EditText) findViewById(R.id.editText1);
			cantidad01 = (EditText) findViewById(R.id.editText2);
			importe01 = (EditText) findViewById(R.id.editText3);
		
			modelo02 = (EditText) findViewById(R.id.editText4);
			cantidad02 = (EditText) findViewById(R.id.editText5);
			importe02 = (EditText) findViewById(R.id.editText6);
		
			modelo03 = (EditText) findViewById(R.id.editText7);
			cantidad03 = (EditText) findViewById(R.id.editText8);
			importe03 = (EditText) findViewById(R.id.editText9);
		
			modelo04 = (EditText) findViewById(R.id.editText10);
			cantidad04 = (EditText) findViewById(R.id.editText11);
			importe04 = (EditText) findViewById(R.id.editText12);
		
			totalGeneral = (EditText) findViewById(R.id.editText13);
		
			LayoutInflater inflater = getLayoutInflater();
			View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.toast_layout_root));
		
			TextView toast_modelo_01 = (TextView) layout.findViewById(R.id.toast_modelo_01);
			toast_modelo_01.setText(modelo01.getText().toString());
		
			TextView toast_cantidad_01 = (TextView) layout.findViewById(R.id.toast_cantidad_01);
			toast_cantidad_01.setText(cantidad01.getText().toString());
		
			TextView toast_importe_01 = (TextView) layout.findViewById(R.id.toast_importe_01);
			toast_importe_01.setText(importe01.getText().toString());
		
			TextView toast_modelo_02 = (TextView) layout.findViewById(R.id.toast_modelo_02);
			toast_modelo_02.setText(modelo02.getText().toString());
		
			TextView toast_cantidad_02 = (TextView) layout.findViewById(R.id.toast_cantidad_02);
			toast_cantidad_02.setText(cantidad02.getText().toString());
		
			TextView toast_importe_02 = (TextView) layout.findViewById(R.id.toast_importe_02);
			toast_importe_02.setText(importe02.getText().toString());
		
			TextView toast_modelo_03 = (TextView) layout.findViewById(R.id.toast_modelo_03);
			toast_modelo_03.setText(modelo03.getText().toString());
		
			TextView toast_cantidad_03 = (TextView) layout.findViewById(R.id.toast_cantidad_03);
			toast_cantidad_03.setText(cantidad03.getText().toString());
		
			TextView toast_importe_03 = (TextView) layout.findViewById(R.id.toast_importe_03);
			toast_importe_03.setText(importe03.getText().toString());
		
			TextView toast_modelo_04 = (TextView) layout.findViewById(R.id.toast_modelo_04);
			toast_modelo_04.setText(modelo04.getText().toString());
		
			TextView toast_cantidad_04 = (TextView) layout.findViewById(R.id.toast_cantidad_04);
			toast_cantidad_04.setText(cantidad04.getText().toString());
		
			TextView toast_importe_04 = (TextView) layout.findViewById(R.id.toast_importe_04);
			toast_importe_04.setText(importe04.getText().toString());
		
			TextView toast_total = (TextView) layout.findViewById(R.id.toast_total);
			toast_total.setText(totalGeneral.getText().toString());
		
			Toast toast = new Toast(getApplicationContext());
			toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
			toast.setDuration(Toast.LENGTH_LONG);
			toast.setView(layout);
			toast.show();
		} catch(Exception e) {
			Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
		}
	}
	
	public void Menu(View view) {
		finish();
	}

}
