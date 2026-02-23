package com.example.program14;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
	Button cls,setColor;
	RelativeLayout rel;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		cls = (Button)findViewById(R.id.clear);
		setColor = (Button)findViewById(R.id.setcolor);
		rel = (RelativeLayout)findViewById(R.id.rele);
		setColor.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				rel.setBackgroundColor(Color.MAGENTA);
			}
		});
		cls.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				rel.setBackgroundColor(Color.WHITE);
			}
		});
	}

	
}
