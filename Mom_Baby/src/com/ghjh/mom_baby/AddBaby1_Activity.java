package com.ghjh.mom_baby;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class AddBaby1_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addbaby1);
        
        Button btn_addbaby2 = (Button)findViewById(R.id.btn_addbaby2);
        btn_addbaby2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getBaseContext(), AddBaby2_Activity.class);
				startActivity(intent);
			}
		});
    }

}