package com.example.program7;

import com.example.program7.R.string;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {
	Spinner spin;
	private String[] spinArray;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		spin = (Spinner)findViewById(R.id.spinner1);
		this.spinArray = new String[] { "1st Semester","2nd Semester","3rd Semester", "4th Semester"
		
		
	};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, spinArray);
		spin.setAdapter(adapter);
		

	

}
}