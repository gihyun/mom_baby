package com.ghjh.mom_baby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class First_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);

		Button btn_login01 = (Button) findViewById(R.id.btn_login01);
		btn_login01.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent01 = new Intent(getBaseContext(),
						Login_Activity.class);
				startActivity(intent01);
			}
		});

		Button btn_signup = (Button) findViewById(R.id.btn_signup);
		btn_signup.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent02 = new Intent(getBaseContext(),
						Signup_Activity.class);
				startActivity(intent02);
			}
		});
	}

}
