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
	Spinner spinner01;
	Spinner spinner02;

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

		spinner01 = (Spinner) findViewById(R.id.spin_add1);
		populateSpinners();

		spinner02 = (Spinner) findViewById(R.id.spin_add2);
		populateSpinners();

		spinner01.setOnItemSelectedListener(spinSelectedListener);

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

	private void populateSpinners() {
		ArrayAdapter<CharSequence> adspin;
		adspin = ArrayAdapter.createFromResource(this, R.array.main_spinner,
				android.R.layout.simple_spinner_item);
		adspin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner01.setAdapter(adspin);
	}

	private void populateSubSpinners(int itemNum) {
		ArrayAdapter<CharSequence> adspin;
		adspin = ArrayAdapter.createFromResource(this, itemNum,
				android.R.layout.simple_spinner_item);
		adspin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner02.setAdapter(adspin);
	}

	private OnItemSelectedListener spinSelectedListener = new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> parent, View view,
				int position, long id) {
			// TODO Auto-generated method stub
			switch (position) {
			case 0:
				populateSubSpinners(R.array.sub_spinner_seoul);
				break;
			case 1:
				populateSubSpinners(R.array.sub_spinner_busan);
				break;
			case 2:
				populateSubSpinners(R.array.sub_spinner_daegu);
				break;
			case 3:
				populateSubSpinners(R.array.sub_spinner_incheon);
				break;
			case 4:
				populateSubSpinners(R.array.sub_spinner_gwangju);
				break;
			case 5:
				populateSubSpinners(R.array.sub_spinner_daejeon);
				break;
			case 6:
				populateSubSpinners(R.array.sub_spinner_woolsan);
				break;
			case 7:
				populateSubSpinners(R.array.sub_spinner_gyeonggi);
				break;
			case 8:
				populateSubSpinners(R.array.sub_spinner_gangwon);
				break;
			case 9:
				populateSubSpinners(R.array.sub_spinner_chungbuk);
				break;
			case 10:
				populateSubSpinners(R.array.sub_spinner_chungnam);
				break;
			case 11:
				populateSubSpinners(R.array.sub_spinner_jeonbuk);
				break;
			case 12:
				populateSubSpinners(R.array.sub_spinner_jeonnam);
				break;
			case 13:
				populateSubSpinners(R.array.sub_spinner_gyeongbuk);
				break;
			case 14:
				populateSubSpinners(R.array.sub_spinner_gyeongnam);
				break;
			case 15:
				populateSubSpinners(R.array.sub_spinner_sejong);
				break;
			case 16:
				populateSubSpinners(R.array.sub_spinner_jeju);
				break;

			default:
				break;
			}
		}

		@Override
		public void onNothingSelected(AdapterView<?> parent) {
			// TODO Auto-generated method stub

		}
	};
}