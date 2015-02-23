package com.ghjh.mom_baby;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Diary_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);
        
        Button btn_addDiary = (Button)findViewById(R.id.btn_addDiary);
        btn_addDiary.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getBaseContext(),
						AddDiary_Activity.class);
				startActivity(intent);
			}
		});
        
        Button btn_editDiary = (Button)findViewById(R.id.btn_editDiary);
        btn_editDiary.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getBaseContext(),
						EditDiary_Activity.class);
				startActivity(intent);
			}
		});
       
    }

}