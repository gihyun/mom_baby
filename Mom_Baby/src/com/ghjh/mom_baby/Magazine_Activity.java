package com.ghjh.mom_baby;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class Magazine_Activity extends TabActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_magazine);

		Resources res = getResources(); // 리소스 객체 생성
		TabHost tabHost = getTabHost(); // 탭을 붙이기위한 탭호스객체선언
		TabHost.TabSpec spec; // 탭호스트에 붙일 각각의 탭스펙을 선언 ; 각 탭의 메뉴와 컨텐츠를 위한 객체
		Intent intent; // 각탭에서 사용할 인텐트 선언

		intent = new Intent().setClass(this, Common_Activity.class);
		spec = tabHost.newTabSpec("commonsense");
		spec.setIndicator("육아  상식");
		spec.setContent(intent);
		tabHost.addTab(spec);

		intent = new Intent().setClass(this, Story_Activity.class);
		spec = tabHost.newTabSpec("story");
		spec.setIndicator("우리끼리 이야기");
		spec.setContent(intent);
		tabHost.addTab(spec);

		tabHost.setCurrentTab(0);
	}
}
