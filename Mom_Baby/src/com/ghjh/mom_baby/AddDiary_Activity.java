package com.ghjh.mom_baby;

import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AddDiary_Activity extends Activity {

	Calendar m = Calendar.getInstance();

	int year = m.get(Calendar.YEAR);
	int month = m.get(Calendar.MONTH) + 1;
	int day = m.get(Calendar.DATE);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_adddiary);

		Button btn_datepicker = (Button) findViewById(R.id.btn_datepicker);
		btn_datepicker.setText(year + "³â " + month + "¿ù " + day + "ÀÏ");
		btn_datepicker.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});

		Button btn_diarySave = (Button) findViewById(R.id.btn_diarySave);
		btn_diarySave.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getBaseContext(),
						Diary_Activity.class);
				startActivity(intent);
			}
		});
	}
}