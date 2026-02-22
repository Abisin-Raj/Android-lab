package com.example.program11;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Contacts.ContactMethods;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends Activity {
	GridView gv;
	List<String> Names;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Names = new ArrayList<String>();
		gv = (GridView)findViewById(R.id.gridview1);
	Cursor phones = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,null);
	while (phones.moveToNext()){
		String name = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
		String phoneNumber = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
		Names.add(name +"\n"+ phoneNumber);
		
	}
	phones.close();

		gv.setAdapter(new ArrayAdapter<String>( this,R.layout.cell,Names));
	}
}
