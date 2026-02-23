package com.example.program9;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button btn;
	TextView txt1;
	CheckBox rm,wm,we,er;
	String res;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn = (Button)findViewById(R.id.button1);
		txt1 = (TextView)findViewById(R.id.textView3);
		rm = (CheckBox)findViewById(R.id.rm);
		wm = (CheckBox) findViewById(R.id.wm);
		we = (CheckBox) findViewById(R.id.we);
		er = (CheckBox) findViewById(R.id.re);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				res = "";
				if(rm.isChecked()){
					res = res + " read Malayalam ,";
				}
				if(wm.isChecked()){
					res = res + " write Malayalam ";
				}
				if(er.isChecked()){
					res += " read English ";
				}
				if(we.isChecked()){
					res += " Write English ";
				}
				if(res.length()<10)	{
					txt1.setText("you're an illiterate");
				}
				else{
					txt1.setText("you can "+ res);
				}
				
			}
		});
	}

	
}
