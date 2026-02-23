package com.example.program4;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button b;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b = (Button)findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				AlertDialog.Builder builder = new
				AlertDialog.Builder(MainActivity.this);
				builder.setCancelable(true);
				builder.setMessage("This is an Alert box");
				builder.setPositiveButton("Ok", null);
				builder.setNeutralButton("Cancel", null);
				AlertDialog myAlert =builder.create();
				myAlert.show();
				
			}
		});
	}

	
	
}
