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

		Resources res = getResources(); // ���ҽ� ��ü ����
		TabHost tabHost = getTabHost(); // ���� ���̱����� ��ȣ����ü����
		TabHost.TabSpec spec; // ��ȣ��Ʈ�� ���� ������ �ǽ����� ���� ; �� ���� �޴��� �������� ���� ��ü
		Intent intent; // ���ǿ��� ����� ����Ʈ ����

		intent = new Intent().setClass(this, Common_Activity.class);
		spec = tabHost.newTabSpec("commonsense");
		spec.setIndicator("����  ���");
		spec.setContent(intent);
		tabHost.addTab(spec);

		intent = new Intent().setClass(this, Story_Activity.class);
		spec = tabHost.newTabSpec("story");
		spec.setIndicator("�츮���� �̾߱�");
		spec.setContent(intent);
		tabHost.addTab(spec);

		tabHost.setCurrentTab(0);
	}
}
