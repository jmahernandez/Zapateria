package com.example.zapateria;

import java.util.ArrayList;
import java.util.Arrays;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;

import android.view.View;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class Avisa extends Activity {
	
	String[] nombres = {
			"José Miguel",
			"Angel Mateo",
			"Miguel Angel",
			"Juan Pérez",
			"Mario Rodriguez",
			"Maicol Scofield"
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		setContentView(R.layout.activity_avisa);
		
		ListView mainListView ;  
		ArrayAdapter<String> listAdapter ;
		
		mainListView = (ListView) findViewById(R.id.listView);
		
		ArrayList<String> nombresList = new ArrayList<String>();  
	    nombresList.addAll(Arrays.asList(nombres));
	    
	    listAdapter = new ArrayAdapter<String>(this, R.layout.simple_row, nombresList);  
		
	    mainListView.setAdapter(listAdapter);
	    
	    mainListView.setOnItemClickListener(new OnItemClickListener() {
	    	@Override
	    	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
	    		Toast.makeText(
	    			getApplicationContext(),
	    			((TextView)view).getText().toString() + " llegaron los nuevos catalogos Marzo-Abril",
	    			Toast.LENGTH_LONG
	    		).show();
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
		getMenuInflater().inflate(R.menu.avisa, menu);
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

}
