package com.jsupport.listviewimages;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class SingleItemMenu extends Activity {
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_single_item_menu);

		Intent intent = getIntent();
		String subcat = intent.getStringExtra("subcat");
			
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_single_item_menu, menu);
		return true;
	}

}
