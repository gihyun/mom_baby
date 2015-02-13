package com.ghjh.mom_baby;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Common_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		TextView textview = new TextView(this);
		textview.setText("육아 상식이 올 자리");

		setContentView(textview);
	}
}
