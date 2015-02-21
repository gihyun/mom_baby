package com.ghjh.mom_baby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Signup_Activity extends Activity {
	ArrayAdapter<CharSequence> adspin;
	boolean mInitSpinner;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);

		Button btn_login = (Button) findViewById(R.id.btn_login);
		btn_login.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getBaseContext(),
						Login_Activity.class);
				startActivity(intent);
			}
		});

		Button btn_signup = (Button) findViewById(R.id.btn_signup);
		btn_signup.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getBaseContext(),
						Signup_Activity.class);
				startActivity(intent);
			}
		});

		Spinner spin = (Spinner) findViewById(R.id.spin_add1);
		adspin = ArrayAdapter.createFromResource(this, R.array.add1_array,
				android.R.layout.simple_spinner_item);
		adspin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spin.setAdapter(adspin);

		spin.setOnItemSelectedListener(new OnItemSelectedListener() {

			public void onItemSelected(AdapterView<?> parent, View view,
					int pos, long id) {
				/* 초기화 시의 선택 제외시 */
				if (mInitSpinner == false) {
					mInitSpinner = true;
					return;
				}
			}

			public void onNothingSelected(AdapterView<?> arg0) {
			}
		});

		Button btn_start = (Button) findViewById(R.id.btn_start);
		btn_start.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				EditText edit_email = (EditText) findViewById(R.id.edit_email);
				String str_email = edit_email.getText().toString();

				EditText edit_passwd = (EditText) findViewById(R.id.edit_passwd);
				String str_passwd = edit_passwd.getText().toString();

				EditText edit_nickname = (EditText) findViewById(R.id.edit_nickname);
				String str_nickname = edit_nickname.getText().toString();

				Intent intent = new Intent(getBaseContext(),
						Main_Activity.class);
				startActivity(intent);
			}
		});
	}

}