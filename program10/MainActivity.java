package com.example.program10;

import java.sql.Date;
import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

public class MainActivity extends Activity implements View.OnClickListener{
	Button btn1,btn2;
	EditText txt1,txt2;
	private int mYear,mMonth,mDay,mHour,mMinute;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn1 = (Button)findViewById(R.id.btnDate);
		btn2 = (Button)findViewById(R.id.btnTimee);
		txt1 = (EditText)findViewById(R.id.datee);
		txt2 = (EditText)findViewById(R.id.timee);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
	}
			
		
			
			@Override
			public void onClick(View v) {
				if (v == btn1){
					final Calendar c = Calendar.getInstance();
					mYear = c.get(Calendar.YEAR);
					mMonth = c.get(Calendar.MONTH);
					mDay = c.get(Calendar.DAY_OF_MONTH);
					
					DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() 
					{
						
						@Override
						public void onDateSet(DatePicker view, int year, int monthOfYear,
								int dayOfMonth) {
							txt1.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);}},mYear,mMonth,mDay);
						datePickerDialog.show();
				}
			
		
			
				if(v==btn2){
					final Calendar c = Calendar.getInstance();
					mHour = c.get(Calendar.HOUR);
					mMinute = c.get(Calendar.MINUTE);
					
					TimePickerDialog timePickerDialog = new TimePickerDialog(this,
			                new TimePickerDialog.OnTimeSetListener() {
						
						@Override
						public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
							txt2.setText(hourOfDay+ " : "+ minute);
							}
					},mHour,mMinute,false);
					timePickerDialog.show();
						
		
	}
	
}
}
	
	