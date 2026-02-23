package com.example.program1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	protected void onResume() {
		Toast.makeText(getApplicationContext(), "hello world", Toast.LENGTH_LONG).show();
		super.onResume();
	};
}