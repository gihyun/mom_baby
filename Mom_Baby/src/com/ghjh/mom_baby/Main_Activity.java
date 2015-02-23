package com.ghjh.mom_baby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button btn_regOne = (Button) findViewById(R.id.btn_regOne);
		btn_regOne.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});

		Button btn_register = (Button) findViewById(R.id.btn_register);
		btn_register.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getBaseContext(),
						AddBaby1_Activity.class);
				startActivity(intent);
			}
		});

		Button btn_injection = (Button) findViewById(R.id.btn_injection);
		btn_injection.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getBaseContext(),
						Injection_Activity.class);
				startActivity(intent);
			}
		});

		Button btn_growth = (Button) findViewById(R.id.btn_growth);
		btn_growth.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getBaseContext(),
						Growth_Activity.class);
				startActivity(intent);
			}
		});
		
		Button btn_diary = (Button) findViewById(R.id.btn_diary);
		btn_diary.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getBaseContext(),
						Diary_Activity.class);
				startActivity(intent);
			}
		});

		Button btn_hospital = (Button) findViewById(R.id.btn_hospital);
		btn_hospital.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getBaseContext(),
						Hospital_Activity.class);
				startActivity(intent);
			}
		});

		Button btn_magazine = (Button) findViewById(R.id.btn_magazine);
		btn_magazine.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getBaseContext(),
						Magazine_Activity.class);
				startActivity(intent);
			}
		});
	}

}