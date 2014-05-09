package com.example.testdrawable;
//import java.io.InputStream;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
//import android.view.Menu;
import android.view.View;
//import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	private Bitmap BackgroundImage;
	ImageView image;
	Button button;
	
  @Override
  public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    image = (ImageView) findViewById(R.id.image);
    Resources res = getResources();	
    BackgroundImage = BitmapFactory.decodeResource(res,
            R.drawable.img0005);
    //InputStream resource = getResources().openRawResource(R.drawable.img0005);
    //Bitmap bitmap = BitmapFactory.decodeStream(resource);
    //button.setBackground(new MyRoundCornerDrawable(bitmap));
    addListenerOnButton();
  }

  public void addListenerOnButton() {
	  
		image = (ImageView) findViewById(R.id.image);

		button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				image.setImageResource(R.drawable.img0002);
			}

		});

	}
}