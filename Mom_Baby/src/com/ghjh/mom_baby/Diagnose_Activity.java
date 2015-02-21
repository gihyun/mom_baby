package com.ghjh.mom_baby;

import java.util.Calendar;
import java.util.GregorianCalendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;

public class Diagnose_Activity extends Activity {
	int mYear, mMonth, mDay;
	Button btn_datePicker;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_diagnose);

		btn_datePicker = (Button) findViewById(R.id.btn_datepicker);

		Calendar cal = new GregorianCalendar();
		mYear = cal.get(Calendar.YEAR);
		mMonth = cal.get(Calendar.MONTH);
		mDay = cal.get(Calendar.DAY_OF_MONTH);

		updateNow();

		btn_datePicker.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				new DatePickerDialog(Diagnose_Activity.this, mDateSetListener,
						mYear, mMonth, mDay).show();
			}
		});
	}

	DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {

		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			// TODO Auto-generated method stub
			mYear = year;
			mMonth = monthOfYear;
			mDay = dayOfMonth;

			updateNow();
		}
	};

	void updateNow() {
		String str = mYear + "³â " + (mMonth + 1) + "¿ù " + mDay + "ÀÏ";
		btn_datePicker.setText(str);
	}
}
