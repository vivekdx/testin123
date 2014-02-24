package com.example.testin123;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Newpage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_newpage);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.newpage, menu);
		return true;
	}

}
