package com.ghjh.mom_baby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		Button btn_login = (Button) findViewById(R.id.btn_login);
		btn_login.setOnClickListener(new OnClickListener() {

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

		Button btn_start = (Button) findViewById(R.id.btn_start);
		btn_start.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				EditText edit_email = (EditText) findViewById(R.id.edit_email);
				String str_email = edit_email.getText().toString();

				EditText edit_passwd = (EditText) findViewById(R.id.edit_passwd);
				String str_passwd = edit_passwd.getText().toString();

				Intent intent = new Intent(getBaseContext(),
						Main_Activity.class);
				startActivity(intent);
			}
		});

		TextView txt_forget = (TextView) findViewById(R.id.txt_forget);
		String str_forget = "ºñ¹Ð¹øÈ£¸¦ ÀØÀ¸¼Ì³ª¿ä?";
		txt_forget.setText(Html.fromHtml("<u>" + str_forget + "</u>"));

		txt_forget.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});
	}

}
