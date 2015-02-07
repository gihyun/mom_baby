package com.ghjh.mom_baby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Manager_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_manager);

		Button btn_diagnose = (Button) findViewById(R.id.btn_diagnose);
		btn_diagnose.setOnClickListener(new OnClickListener() {

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
