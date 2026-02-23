package com.example.program6;

import org.w3c.dom.Text;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	RadioButton f,m,o;
	RadioGroup gen;
	TextView txt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		m = (RadioButton)findViewById(R.id.male);
		f = (RadioButton)findViewById(R.id.female);
		o = (RadioButton)findViewById(R.id.other);
		txt = (TextView)findViewById(R.id.textView2);
		gen = (RadioGroup)findViewById(R.id.gender);
		gen.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				if(m.isChecked()){
					txt.setText("you are a man!");
				}
				else if(f.isChecked()){
					txt.setText("You are a woman!");
				}
				else
					txt.setText("you are one of the other genders");
				
			}
		});
	}

}