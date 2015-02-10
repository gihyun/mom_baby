package com.ghjh.mom_baby;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class RegTwo_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regtwo);
        
        ImageButton imgbtn_firstBaby = (ImageButton) findViewById(R.id.imgbtn_firstBaby);
        imgbtn_firstBaby.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getBaseContext(), Manager_Activity.class);
				startActivity(intent);
			}
		});
    }

}