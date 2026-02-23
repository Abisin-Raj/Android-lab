package com.example.program8;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Button startButton;
	int isOn;
	private TextView timerValue;
	private long startTime = 0L;
	private Handler customHandler = new Handler();
	long timeInMiliSecs = 0L;
	long timeSwapBuff = 0L;
	long updatedTime = 0L;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		isOn = 0;
		timerValue = (TextView)findViewById(R.id.textView1);
		startButton = (Button)findViewById(R.id.button1);
		startButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(isOn == 0){
					startTime = SystemClock.uptimeMillis();
					customHandler.postDelayed(updateTimeThread,0);
					isOn = 1;
					startButton.setText("Pause");
				}
				else{
					timeSwapBuff += timeInMiliSecs;
					customHandler.removeCallbacks(updateTimeThread);
					isOn = 0;
					startButton.setText("Start");
				}
				
			}
		});
	}

	private Runnable updateTimeThread =  new Runnable() {
		int secs,mins,milliseconds;
		public void run(){
			timeInMiliSecs = SystemClock.uptimeMillis() - startTime;
			updatedTime = timeSwapBuff + timeInMiliSecs;
			secs = (int)(updatedTime / 1000);
			mins = secs/60;
			secs = secs % 60;
			milliseconds = (int)(updatedTime % 1000);
			timerValue.setText("" + mins + ":"+ String.format("%02d", secs) +  ":" + String.format("%03d", milliseconds));
			customHandler.postDelayed(this,0);
		}
	};
}
