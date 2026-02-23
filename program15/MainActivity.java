package com.example.program15;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
	Button but;
	RelativeLayout rell;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		but = (Button)findViewById(R.id.change);
		rell = (RelativeLayout)findViewById(R.id.rel);
		but.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				rell.setBackgroundResource(R.drawable.image3);
			}
		});
	}

	
}
