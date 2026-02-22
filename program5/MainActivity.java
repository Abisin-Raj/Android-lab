package com.example.program5;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
		@Override
		public boolean onCreateOptionsMenu(Menu menu){
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}
		@Override
		public boolean onOptionsItemSelected(MenuItem item){
			int id = item.getItemId();
			if (id == R.id.item1){
				Toast.makeText(getApplicationContext(), "you've selected first", Toast.LENGTH_LONG).show();

			}
			else if (id == R.id.item2) 
				 {
				Toast.makeText(getApplicationContext(), "you've selected second", Toast.LENGTH_LONG).show();
			}
			else{
				Toast.makeText(getApplicationContext(), "you've have selected third", Toast.LENGTH_LONG).show();
			}
			return true;
			
		}

	
	
}
