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
				Intent intent = new Intent(getBaseContext(), AddBaby1_Activity.class);
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
		

	}

}
