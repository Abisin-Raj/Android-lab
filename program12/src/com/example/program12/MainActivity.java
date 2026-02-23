package com.example.program12;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private static int imgloaded = 1;
	String imgPath;
	ImageView imgView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		imgView= (ImageView)findViewById(R.id.imgView);
		
	}
	public void loadImagefromGallery(View view)	{
		Intent galleryIntent = new Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
		startActivityForResult(galleryIntent, imgloaded);
	}
	
	@Override
	protected void onActivityResult (int requestCode,int resultCode,Intent data){
		super.onActivityResult(requestCode, resultCode, data);
		try{
			if(requestCode == imgloaded && resultCode == RESULT_OK && null != data)	{
				Uri selectedImage = data.getData();
				String[] filePathColumn = {
						MediaStore.Images.Media.DATA
				};
				Cursor cursor = getContentResolver().query(selectedImage, filePathColumn, null, null, null);
				cursor.moveToFirst();
				
				int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
				imgPath = cursor.getString(columnIndex);
				cursor.close();
				imgView.setImageBitmap(BitmapFactory.decodeFile(imgPath));
			}
			else{
				Toast.makeText(this, "No images selected", Toast.LENGTH_LONG).show();
			}
		}
		catch(Exception e){
			Toast.makeText(this, "something went wrong", Toast.LENGTH_LONG).show();
		}
	}

	
}
